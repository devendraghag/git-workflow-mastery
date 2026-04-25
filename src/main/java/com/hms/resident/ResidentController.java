package com.hms.resident;

import com.hms.dto.ResidentCreateRequest;
import com.hms.dto.ResidentResponse;
import com.hms.dto.ResidentUpdateRequest;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/residents")
public class ResidentController {

    private final ResidentService residentService;

    public ResidentController(ResidentService residentService) {
        this.residentService = residentService;
    }

    @PostMapping
    public ResponseEntity<ResidentResponse> create(@Valid @RequestBody ResidentCreateRequest request,
                                                   Authentication authentication) {
        return ResponseEntity.ok(residentService.create(request, authentication.getName()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResidentResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(residentService.getById(id));
    }

    @GetMapping
    public ResponseEntity<Page<ResidentResponse>> list(@RequestParam(defaultValue = "0") int page,
                                                       @RequestParam(defaultValue = "10") int size,
                                                       @RequestParam(defaultValue = "id,desc") String sort) {
        String[] sortParams = sort.split(",");
        Sort.Direction direction = sortParams.length > 1 && sortParams[1].equalsIgnoreCase("asc")
                ? Sort.Direction.ASC : Sort.Direction.DESC;
        Pageable pageable = PageRequest.of(page, size, Sort.by(direction, sortParams[0]));
        return ResponseEntity.ok(residentService.list(pageable));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResidentResponse> update(@PathVariable Long id,
                                                   @Valid @RequestBody ResidentUpdateRequest request) {
        return ResponseEntity.ok(residentService.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        residentService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<ResidentResponse> updateStatus(@PathVariable Long id,
                                                         @RequestParam boolean active) {
        return ResponseEntity.ok(residentService.updateStatus(id, active));
    }
}

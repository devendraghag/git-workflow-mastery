package com.hms.resident;

import com.hms.auth.User;
import com.hms.auth.UserRepository;
import com.hms.common.exception.NotFoundException;
import com.hms.dto.ResidentCreateRequest;
import com.hms.dto.ResidentResponse;
import com.hms.dto.ResidentUpdateRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResidentService {

    private final ResidentRepository residentRepository;
    private final UserRepository userRepository;

    public ResidentService(ResidentRepository residentRepository, UserRepository userRepository) {
        this.residentRepository = residentRepository;
        this.userRepository = userRepository;
    }

    public ResidentResponse create(ResidentCreateRequest request, String creatorEmail) {
        User creator = userRepository.findByEmail(creatorEmail)
                .orElseThrow(() -> new NotFoundException("Creator user not found"));

        Resident resident = new Resident();
        mapForCreateOrUpdate(request, resident);
        resident.setCreatedBy(creator);
        return ResidentResponse.from(residentRepository.save(resident));
    }

    public ResidentResponse getById(Long id) {
        return ResidentResponse.from(findResident(id));
    }

    public Page<ResidentResponse> list(Pageable pageable) {
        return residentRepository.findAll(pageable).map(ResidentResponse::from);
    }

    public ResidentResponse update(Long id, ResidentUpdateRequest request) {
        Resident resident = findResident(id);
        resident.setFullName(request.getFullName());
        resident.setPhone(request.getPhone());
        resident.setEmail(request.getEmail());
        resident.setFlatNumber(request.getFlatNumber());
        resident.setFloorNumber(request.getFloorNumber());
        resident.setResidentType(request.getResidentType());
        return ResidentResponse.from(residentRepository.save(resident));
    }

    public void delete(Long id) {
        Resident resident = findResident(id);
        residentRepository.delete(resident);
    }

    public ResidentResponse updateStatus(Long id, boolean active) {
        Resident resident = findResident(id);
        resident.setActive(active);
        return ResidentResponse.from(residentRepository.save(resident));
    }

    private Resident findResident(Long id) {
        return residentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Resident not found with id: " + id));
    }

    private void mapForCreateOrUpdate(ResidentCreateRequest request, Resident resident) {
        resident.setFullName(request.getFullName());
        resident.setPhone(request.getPhone());
        resident.setEmail(request.getEmail());
        resident.setFlatNumber(request.getFlatNumber());
        resident.setFloorNumber(request.getFloorNumber());
        resident.setResidentType(request.getResidentType());
    }
}

package com.hms.dto;

import com.hms.resident.ResidentType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class ResidentCreateRequest {

    @NotBlank
    @Size(min = 3, max = 100)
    private String fullName;

    @NotBlank
    @Pattern(regexp = "^[0-9]{10,15}$")
    private String phone;

    @Email
    private String email;

    @NotBlank
    private String flatNumber;

    @NotNull
    @Min(0)
    @Max(200)
    private Integer floorNumber;

    @NotNull
    private ResidentType residentType;

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getFlatNumber() { return flatNumber; }
    public void setFlatNumber(String flatNumber) { this.flatNumber = flatNumber; }
    public Integer getFloorNumber() { return floorNumber; }
    public void setFloorNumber(Integer floorNumber) { this.floorNumber = floorNumber; }
    public ResidentType getResidentType() { return residentType; }
    public void setResidentType(ResidentType residentType) { this.residentType = residentType; }
}

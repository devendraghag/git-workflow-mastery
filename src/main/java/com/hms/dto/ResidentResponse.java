package com.hms.dto;

import com.hms.resident.Resident;
import com.hms.resident.ResidentType;

public class ResidentResponse {
    private Long id;
    private String fullName;
    private String phone;
    private String email;
    private String flatNumber;
    private Integer floorNumber;
    private ResidentType residentType;
    private boolean active;

    public static ResidentResponse from(Resident resident) {
        ResidentResponse response = new ResidentResponse();
        response.id = resident.getId();
        response.fullName = resident.getFullName();
        response.phone = resident.getPhone();
        response.email = resident.getEmail();
        response.flatNumber = resident.getFlatNumber();
        response.floorNumber = resident.getFloorNumber();
        response.residentType = resident.getResidentType();
        response.active = resident.isActive();
        return response;
    }

    public Long getId() { return id; }
    public String getFullName() { return fullName; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getFlatNumber() { return flatNumber; }
    public Integer getFloorNumber() { return floorNumber; }
    public ResidentType getResidentType() { return residentType; }
    public boolean isActive() { return active; }
}

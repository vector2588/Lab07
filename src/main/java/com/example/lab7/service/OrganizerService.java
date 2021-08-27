package com.example.lab7.service;

import com.example.lab7.entity.Organizer;

import java.util.List;

public interface OrganizerService {

    Integer getOrganizerSize();
    List<Organizer> getOrganizers(Integer pageSize, Integer page);
    Organizer getOrganizer(Long id);
}

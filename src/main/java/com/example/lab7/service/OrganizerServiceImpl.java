package com.example.lab7.service;

import com.example.lab7.dao.OrganizerDao;
import com.example.lab7.entity.Event;
import com.example.lab7.entity.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizerServiceImpl implements OrganizerService {

    @Autowired
    OrganizerDao oraganizerDao;

    @Override
    public Integer getOrganizerSize() {
        return oraganizerDao.getOrganizerSize();
    }

    @Override
    public List<Organizer> getOrganizers(Integer pageSize, Integer page) {
        return oraganizerDao.getOrganizers(pageSize, page);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return oraganizerDao.getOrganizer(id);
    }

}

package com.example.lab7.dao;

import com.example.lab7.entity.Event;
import com.example.lab7.entity.Organizer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrganizerDaoImpl implements OrganizerDao {
    List<Organizer> organizerList;

    @PostConstruct
    public void init() {
        organizerList = new ArrayList<>();
        organizerList.add(Organizer.builder()
                .id(555L)
                .name("tood")
                .address("tood")
                .build());
        organizerList.add(Organizer.builder()
                .id(191L)
                .name("Hello")
                .address("world")
                .build());
        organizerList.add(Organizer.builder()
                .id(487L)
                .name("Bruh")
                .address("EZ")
                .build());
        organizerList.add(Organizer.builder()
                .id(4567L)
                .name("Hi")
                .address("Heloo")
                .build());
        organizerList.add(Organizer.builder()
                .id(785L)
                .name("Git")
                .address("Hub")
                .build());
        organizerList.add(Organizer.builder()
                .id(545L)
                .name("face")
                .address("book")
                .build());
    }

    @Override
    public Integer getOrganizerSize() {
        return organizerList.size();
    }

    @Override
    public List<Organizer> getOrganizers(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? organizerList.size() : pageSize;
        page = page == null ? 1 : page;
        int firstIndex = (page - 1) * pageSize;
        return organizerList.subList(firstIndex, firstIndex + pageSize);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerList.stream().filter(event -> event.getId().equals(id)).findFirst().orElse(null);
    }
}

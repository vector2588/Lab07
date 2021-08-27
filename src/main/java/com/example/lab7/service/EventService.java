package com.example.lab7.service;

import com.example.lab7.entity.Event;
import com.example.lab7.entity.Organizer;

import java.util.List;

public interface EventService {
    Integer getEventSize();
    List<Event> getEvents(Integer pageSize, Integer page);
    Event getEvent(Long id);

}

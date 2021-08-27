package com.example.lab7.dao;

import com.example.lab7.entity.Event;
import com.example.lab7.entity.Organizer;

import java.util.List;

public interface EventDao {
    Integer getEventSize();
    List<Event> getEvents(Integer pageSize, Integer page);
    Event getEvent(Long id);
}
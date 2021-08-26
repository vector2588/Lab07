package com.example.lab7.dao;

import com.example.lab7.entity.Event;
import com.example.lab7.entity.Organizer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EventDaoImpl implements EventDao {
    List<Event> eventList;
    List<Organizer> organizerList;

    @PostConstruct
    public void init() {
        eventList = new ArrayList<>();
        eventList.add(Event.builder()
                .id(123L)
                .category("animal welfare tood")
                .title("Cat Adoption Day tood")
                .description("Find your new feline friend at this event.")
                .location("Meow Town")
                .date("January 28, 2022")
                .time("12:00")
                .petAllowed(true)
                .organizer("Kat Laydee")
                .build());
        eventList.add(Event.builder()
                .id(456L)
                .category("food")
                .title("Community Gardening")
                .description("Join us as we tend to the community edible plants.")
                .location("Flora City")
                .date("March 14, 2022")
                .time("10:00")
                .petAllowed(true)
                .organizer("Fern Pollin")
                .build());
        eventList.add(Event.builder()
                .id(789L)
                .category("sustainability")
                .title("Beach Cleanup")
                .description("Help pick up trash along the shore.")
                .location("Playa Del Carmen")
                .date("July 22, 2022")
                .time("11:00")
                .petAllowed(false)
                .organizer("Carey Wales")
                .build());
        eventList.add(Event.builder()
                .id(1001L)
                .category("animal welfare")
                .title("Dog Adoption Day")
                .description("Find your new canine friend at this event.")
                .location("Woof Town")
                .date("August 28, 2022")
                .time("12:00")
                .petAllowed(true)
                .organizer("Dawg Dahd")
                .build());
        eventList.add(Event.builder()
                .id(1002L)
                .category("food")
                .title("Canned Food Drive")
                .description("Bring your canned food to donate to those in need.")
                .location("Tin City")
                .date("September 14, 2022")
                .time("3:00")
                .petAllowed(true)
                .organizer("Kahn Opiner")
                .build());
        eventList.add(Event.builder()
                .id(1003L)
                .category("sustainability")
                .title("Highway Cleanup")
                .description("Help pick up trash along the highway.")
                .location("Highway 50")
                .date("July 22, 2022")
                .time("11:00")
                .petAllowed(false)
                .organizer("Brody Kill")
                .build());

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
    public Integer getEventSize() {
        return eventList.size();
    }

    @Override
    public List<Event> getEvents(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? eventList.size() : pageSize;
        page = page == null ? 1 : page;
        int firstIndex = (page - 1) * pageSize;
        return eventList.subList(firstIndex,firstIndex+pageSize);
    }

    @Override
    public Event getEvent(Long id) {
        return eventList.stream().filter(event -> event.getId().equals(id)).findFirst().orElse(null);
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
        return organizerList.subList(firstIndex,firstIndex+pageSize);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerList.stream().filter(event -> event.getId().equals(id)).findFirst().orElse(null);
    }

}

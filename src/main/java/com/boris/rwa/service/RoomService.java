package com.boris.rwa.service;

import com.boris.rwa.data.RoomRepository;
import com.boris.rwa.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {return roomRepository.findAll();}

    public Room getById(long id){
        return roomRepository.findById(id).get();
    }
}

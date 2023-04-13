package be.technifutur.Booking.service;

import be.technifutur.Booking.model.dto.RoomDTO;

import java.util.List;

public interface RoomService {
    RoomDTO getOne(long id);
    List<RoomDTO> getAll();
}

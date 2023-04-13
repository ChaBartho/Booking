package be.technifutur.Booking.service;

import be.technifutur.Booking.model.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO getOne(long id);
    List<UserDTO> getAll();
}

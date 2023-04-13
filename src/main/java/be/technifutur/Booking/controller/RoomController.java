package be.technifutur.Booking.controller;

import be.technifutur.Booking.model.dto.RoomDTO;
import be.technifutur.Booking.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/all")
    public List<RoomDTO> getAll(){
        return roomService.getAll();
    }
    @GetMapping("/{id:[0-9]+}")
    public RoomDTO getOne(@PathVariable long id) {
        return roomService.getOne(id);
    }
}

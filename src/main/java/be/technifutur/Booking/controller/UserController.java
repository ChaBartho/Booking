package be.technifutur.Booking.controller;

import be.technifutur.Booking.model.dto.UserDTO;
import be.technifutur.Booking.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/all")
    public List<UserDTO> getAll(){
        return userService.getAll();
    }
    @GetMapping("/{id:[0-9]+}")
    public UserDTO getOne(@PathVariable long id){
        return userService.getOne(id);
    }

}

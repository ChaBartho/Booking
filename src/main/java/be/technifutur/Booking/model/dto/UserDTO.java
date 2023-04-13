package be.technifutur.Booking.model.dto;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private Set<String> roles = new LinkedHashSet<>();
}

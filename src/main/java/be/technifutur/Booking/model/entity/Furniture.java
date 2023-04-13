package be.technifutur.Booking.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Furniture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "furniture_id", nullable = false)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
}

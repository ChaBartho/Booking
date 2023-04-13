package be.technifutur.Booking.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private Long capacity;
    @Column(nullable = false)
    private Long num;


    @OneToMany(mappedBy = "room")
    private List<Booking> bookings;
}

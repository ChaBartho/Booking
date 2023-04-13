package be.technifutur.Booking.model.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter @Setter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private LocalTime heureDebut;
    @Column(nullable = false)
    private LocalTime heureFin;
    @Column(nullable = false)
    private String status;


    @ManyToOne
    @JoinColumn(nullable = false)
    private Room room;
    @ManyToOne
    @JoinColumn(nullable = false)
    private User user;
}

package be.technifutur.Booking.repository;

import be.technifutur.Booking.model.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}

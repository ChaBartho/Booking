package be.technifutur.Booking.repository;

import be.technifutur.Booking.model.entity.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FurnitureRepository extends JpaRepository<Furniture, Long> {
}

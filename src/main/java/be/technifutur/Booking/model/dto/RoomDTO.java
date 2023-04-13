package be.technifutur.Booking.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoomDTO {
    private Long id;
    private Long capacity;
    private long num;
}

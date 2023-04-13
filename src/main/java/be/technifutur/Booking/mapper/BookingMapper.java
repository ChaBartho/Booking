package be.technifutur.Booking.mapper;

import be.technifutur.Booking.model.dto.BookingDTO;
import be.technifutur.Booking.model.entity.Booking;
import be.technifutur.Booking.model.form.BookingForm;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class BookingMapper {
    public BookingDTO toDto(Booking entity){
        if(entity == null)
            return null;
        return BookingDTO.builder()
                .id(entity.getId())
                .date(entity.getDate())
                .heureDebut(entity.getHeureDebut())
                .heureFin(entity.getHeureFin())
                .status(entity.getStatus())
                .build();
    }

    public Booking toEntity(BookingForm form){
        Booking entity = new Booking();


        return entity;
    }
}

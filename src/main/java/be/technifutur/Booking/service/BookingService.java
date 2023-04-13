package be.technifutur.Booking.service;

import be.technifutur.Booking.model.dto.BookingDTO;
import be.technifutur.Booking.model.form.BookingForm;

import java.util.List;

public interface BookingService {
    void create(BookingForm form);
    BookingDTO getOne(long id);
    List<BookingDTO> getAll();
}

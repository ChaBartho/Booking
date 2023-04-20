package be.technifutur.Booking.service.impl;

import be.technifutur.Booking.mapper.BookingMapper;
import be.technifutur.Booking.model.dto.BookingDTO;
import be.technifutur.Booking.model.entity.Booking;
import be.technifutur.Booking.model.form.BookingForm;
import be.technifutur.Booking.repository.BookingRepository;
import be.technifutur.Booking.service.BookingService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;
    private final BookingMapper mapper;
    public BookingServiceImpl(BookingRepository bookingRepository, BookingMapper mapper) {
        this.bookingRepository = bookingRepository;
        this.mapper = mapper;
    }
    @Override
    public void create(BookingForm form) {

    }
    @Override
    public BookingDTO getOne(long id) {
        return bookingRepository.findById(id)
                .map(mapper::toDto)
                .orElseThrow();
    }
    @Override
    public List<BookingDTO> getAll() {
        return bookingRepository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }
}

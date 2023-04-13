package be.technifutur.Booking.controller;

import be.technifutur.Booking.model.dto.BookingDTO;
import be.technifutur.Booking.model.form.BookingForm;
import be.technifutur.Booking.service.BookingService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {
    private final BookingService bookingService;
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    @PostMapping("/add")
    public void create(@RequestBody @Valid BookingForm form){
        bookingService.create(form);
    }
    @GetMapping("/all")
    public List<BookingDTO> getAll(){
        return bookingService.getAll();
    }
    @GetMapping("/{id:[0-9]+}")
    public BookingDTO getOne(@PathVariable long id){
        return bookingService.getOne(id);
    }
}

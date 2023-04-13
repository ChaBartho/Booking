package be.technifutur.Booking.model.form;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class BookingForm {
    @NotNull
    private LocalDate date;
    @NotNull
    private LocalTime heureDeb;
    @NotNull
    private LocalTime heureFin;
    @NotNull
    private String status;
}

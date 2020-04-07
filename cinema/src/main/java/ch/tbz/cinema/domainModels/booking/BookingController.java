package ch.tbz.cinema.domainModels.booking;

import ch.tbz.cinema.domainModels.booking.dto.BookingDTO;
import ch.tbz.cinema.domainModels.booking.dto.BookingMapper;
import ch.tbz.cinema.domainModels.movie.MovieService;
import ch.tbz.cinema.domainModels.movie.dto.MovieDTO;
import ch.tbz.cinema.domainModels.movie.dto.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

  private BookingService bookingService;

  private BookingMapper bookingMapper;

  @Autowired
  public BookingController(BookingService bookingService, BookingMapper bookingMapper) {
    this.bookingService = bookingService;
    this.bookingMapper = bookingMapper;
  }

  @GetMapping("")
  public @ResponseBody
  ResponseEntity<List<BookingDTO>> getBookings() {
    return new ResponseEntity<List<BookingDTO>>(bookingMapper.toDTOs(bookingService.getAllBookings()), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public @ResponseBody
  ResponseEntity<BookingDTO> getById(@PathVariable String id) {
    return new ResponseEntity<BookingDTO>(bookingMapper.toDTO(bookingService.getBookingById(id)), HttpStatus.OK);
  }

  @PostMapping("")
  public @ResponseBody
  ResponseEntity<BookingDTO> createBooking(@RequestBody BookingDTO bookingDTO) {
    return new ResponseEntity<>(bookingMapper.toDTO(bookingService.insertBooking(bookingMapper.fromDTO(bookingDTO))), HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public @ResponseBody
  ResponseEntity<BookingDTO> updateBooking(@PathVariable String id, @RequestBody BookingDTO bookingDTO) {
    return new ResponseEntity<BookingDTO>(bookingMapper.toDTO(bookingService.updateBooking(id, bookingMapper.fromDTO(bookingDTO))), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public @ResponseBody
  ResponseEntity<String> deleteBooking(@PathVariable String id) {
    return new ResponseEntity<>(bookingService.deleteBookingById(id), HttpStatus.OK);
  }

}

package com.aditya.ConferenceRoomBookingRestApi.service;

import com.aditya.ConferenceRoomBookingRestApi.dto.BookingDto;
import com.aditya.ConferenceRoomBookingRestApi.dto.ViewBookingDto;
import com.aditya.ConferenceRoomBookingRestApi.entities.RoomBookings;
import org.springframework.http.ResponseEntity;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface RoomBookingsService {
    public ResponseEntity addRoomBooking(BookingDto bookingDto);
    public ResponseEntity cancelRoomBooking(int id);
    public ResponseEntity viewRoomBookings(ViewBookingDto viewBookingDto);
    public ResponseEntity viewRoomAvailability(BookingDto bookingDto);
}

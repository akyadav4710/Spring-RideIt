package com.example.rideIt.model;

import java.util.Date;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import com.example.rideIt.Enum.TripStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    String source;

    String destination;

    double tripDistanceInKm;

    double totalFare;

    @Enumerated(EnumType.STRING)
    TripStatus tripStatus;

    @CreationTimestamp
    Date bookedAt;

    @ManyToOne
    Customer customer;

}

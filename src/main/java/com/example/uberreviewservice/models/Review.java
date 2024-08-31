package com.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "booking_review")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel {

    private String content;

    private Double rating;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Booking booking; // 1:1 relationship between booking and review

    @Override
    public String toString(){
        return "Review: " + this.id +  " " + this.content + " " + this.rating + " " + " booking: " + this.booking.getId() + " " + this.createdAt + " " + this.updatedAt;
    }
}

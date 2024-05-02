package com.example.jpaProgramming.domain;

import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class User {
    @NonNull
    String name;
    @NonNull
    String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

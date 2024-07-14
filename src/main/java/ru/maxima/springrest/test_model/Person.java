package ru.maxima.springrest.test_model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;
    private String job;
    private String id;
    private String createdAt;


}

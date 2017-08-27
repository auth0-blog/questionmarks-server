package com.questionmarks.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
public class ExamUpdateDTO {
    @Id
    @NotNull
    private Long id;

    @NotNull
    @Size(min = 1, max = 50)
    private String title;

    @NotNull
    @Size(min = 1, max = 512)
    private String description;

    @JsonIgnore
    private final LocalDateTime editedAt = LocalDateTime.now();
}

package dev.patika.dto.response.standard;

import dev.patika.dto.response.global.GlobalAnimalResponse;
import dev.patika.dto.response.global.GlobalReportResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VaccineResponse {

    private Long id;

    private String name;

    private String code;

    private LocalDate protectionStartDate;

    private LocalDate protectionFinishDate;

    private GlobalAnimalResponse animal;

    private GlobalReportResponse report;
}

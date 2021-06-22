package guru.springframework.SpringMicroserviceCourse.web.model;

import lombok.*;

import java.util.UUID;

/**
 * Beer Data Transfer Object.
 *
 * @author mitch
 */
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}

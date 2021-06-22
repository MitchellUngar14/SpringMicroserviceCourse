package guru.springframework.SpringMicroserviceCourse.web.model;


import lombok.*;

import java.util.UUID;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private UUID id;
    private String name;
}

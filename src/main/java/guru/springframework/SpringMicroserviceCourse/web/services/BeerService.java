package guru.springframework.SpringMicroserviceCourse.web.services;


import guru.springframework.SpringMicroserviceCourse.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}

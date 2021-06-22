package guru.springframework.SpringMicroserviceCourse.web.services;

import guru.springframework.SpringMicroserviceCourse.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Beer Service Implementation.
 *
 * @author mitch
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("MUNGAR")
                .beerStyle("Pale Ale")
                .upc(1000L)
                .build();
    }
}

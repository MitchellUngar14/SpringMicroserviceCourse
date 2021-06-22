package guru.springframework.SpringMicroserviceCourse.web.services;

import guru.springframework.SpringMicroserviceCourse.web.model.BeerDto;
import guru.springframework.SpringMicroserviceCourse.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID beerId);
}

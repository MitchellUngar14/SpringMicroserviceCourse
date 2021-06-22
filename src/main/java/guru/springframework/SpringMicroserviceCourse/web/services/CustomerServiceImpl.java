package guru.springframework.SpringMicroserviceCourse.web.services;

import guru.springframework.SpringMicroserviceCourse.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Customer Service Implementation
 *
 * @author mitch
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    /**
     * Gets Customer by ID.
     *
     * @param customerId Customer ID being used to fetch data.
     * @return Customer Data Transfer Object.
     */
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Mitchell")
                .build();
    }
}

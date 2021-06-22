package guru.springframework.SpringMicroserviceCourse.web.controller;

import guru.springframework.SpringMicroserviceCourse.web.model.BeerDto;
import guru.springframework.SpringMicroserviceCourse.web.model.CustomerDto;
import guru.springframework.SpringMicroserviceCourse.web.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Customer Controller
 *
 * @author mitch
 */
@RequestMapping("/api/v1/customer")
@RestController
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;

    /**
     * Gets Customer By ID.
     *
     * @param customerId ID being used to retrieve customer.
     * @return Customer Data Transfer Object.
     */
    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getBeer(@PathVariable UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }
}

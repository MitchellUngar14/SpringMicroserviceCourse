package guru.springframework.SpringMicroserviceCourse.web.controller;

import guru.springframework.SpringMicroserviceCourse.web.model.BeerDto;
import guru.springframework.SpringMicroserviceCourse.web.services.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Beer Controller
 *
 * @author mitch
 */
@RequestMapping("/api/v1/beer")
@RestController
@AllArgsConstructor
public class BeerController {

    private final BeerService beerService;

    /**
     * Gets a beer object.
     *
     * @param beerId Id of beer object.
     * @return Beer received by beer id.
     */
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }
}

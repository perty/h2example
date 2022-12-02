package se.agical.edu.h2example.driver;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping("/drivers")
    public ResponseEntity<CreateDriverRequest> create(@RequestBody CreateDriverRequest request) {
        driverService.create(request.name());
        return new ResponseEntity<>(request, OK);
    }
}

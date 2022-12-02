package se.agical.edu.h2example.driver;

import org.springframework.stereotype.Service;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public void create(String name) {
        Driver driver = new Driver();
        driver.setName(name);
        driverRepository.save(driver);
    }
}

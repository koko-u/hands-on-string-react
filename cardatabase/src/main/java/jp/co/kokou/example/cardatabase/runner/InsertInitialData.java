package jp.co.kokou.example.cardatabase.runner;

import jp.co.kokou.example.cardatabase.domain.Car;
import jp.co.kokou.example.cardatabase.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class InsertInitialData implements CommandLineRunner {

    private final CarRepository repository;

    private static final List<Car> testRecords = List.of(
            Car.builder()
                    .brand("Ford")
                    .model("Mustang")
                    .color("Red")
                    .registerNumber("ADF-1121")
                    .year(2017)
                    .price(BigDecimal.valueOf(59000))
                    .build(),
            Car.builder()
                    .brand("Nissan")
                    .model("Leaf")
                    .color("White")
                    .registerNumber("SSJ-3002")
                    .year(2014)
                    .price(BigDecimal.valueOf(29000))
                    .build(),
            Car.builder()
                    .brand("Toyota")
                    .model("Prius")
                    .color("Silver")
                    .registerNumber("KKO-0212")
                    .year(2018)
                    .price(BigDecimal.valueOf(39000))
                    .build()
    );

    @Override
    public void run(String... args) {
        testRecords.forEach(repository::save);
    }
}

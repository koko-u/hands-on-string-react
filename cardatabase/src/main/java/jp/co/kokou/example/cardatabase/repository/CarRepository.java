package jp.co.kokou.example.cardatabase.repository;

import jp.co.kokou.example.cardatabase.domain.Car;
import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    /**
     * Fetch Car by its brand name
     * @param brand brand name criteria
     * @return list of cars which meets the brand
     */
    List<Car> findByBrand(@NonNull String brand);

    List<Car> findByColor(@NonNull String color);

    List<Car> findByYear(int year);
}

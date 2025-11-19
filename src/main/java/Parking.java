import enums.CarType;
import enums.FuelType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Parking {

    private final List<Car> carList = new ArrayList<>();

    SUV createSUV(String brand, String model, FuelType fuelType, int fabricationYear, CarType carType, String tractionType) {
        return new SUV(brand, model, fuelType, fabricationYear, carType, tractionType);
    }

    Sportive createSportive(String brand, String model, FuelType fuelType, int fabricationYear, CarType carType, int maximumVelocity) {
        return new Sportive(brand, model, fuelType, fabricationYear, carType, maximumVelocity);
    }

    Sedan createSedan(String brand, String model, FuelType fuelType, int fabricationYear, CarType carType, int trunkCapacity) {
        return new Sedan(brand, model, fuelType, fabricationYear, carType, trunkCapacity);
    }

    public void addCar(Car... car) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        }


        Collections.addAll(carList, car);

    }

    public List<Car> getListCar() {
        return carList;
    }


    List<Car> getCarBySpecificYear(int year) {
        return carList.stream().filter(car -> car.getFabricationYear() >= year).toList();
    }

    List<Car> getCarByTypeAndFuel(Class<?> classType, FuelType fuelType) {
        return carList.stream()
                .filter(car -> car.getClass() == classType)
                .filter(car -> car.getFuelType() == fuelType).toList();
    }

}

import enums.CarType;
import enums.FuelType;

import java.util.ArrayList;
import java.util.List;


public class Parking {

    SUV createSUV(String brand, String model, FuelType fuelType, int fabricationYear, CarType carType, String tractionType){
        return new SUV(brand,model,fuelType,fabricationYear,carType,tractionType);
    }

    Sportive createSportive(String brand, String model, FuelType fuelType, int fabricationYear, CarType carType, int maximumVelocity){
        return new Sportive(brand,model,fuelType,fabricationYear,carType,maximumVelocity);
    }

    Sedan createSedan(String brand, String model, FuelType fuelType, int fabricationYear, CarType carType, int trunkCapacity){
        return new Sedan(brand,model,fuelType,fabricationYear,carType,trunkCapacity);
    }


    private final List<Car> carList = new ArrayList<>();

    public void addCar (Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Robot cannot be null");
        }
        carList.add(car);
    }

    public List<Car> getListCar(){
        return carList;
    }


    List <Car> getCarBySpecificYear(int year) {
        return carList.stream().filter(car -> car.getFabricationYear() >= year).toList();
    }

    List <Car> getCarByTypeAndFuel(Class<?> classType,FuelType fuelType ){
        return carList.stream()
                .filter(car -> car.getClass() == classType)
                .filter(car ->  car.getFuelType() == fuelType).toList();
    }

    List <Exportable> getExportablesCars(Class<?> classType){
        return (List<Exportable>) carList.stream().filter(car -> ((Exportable)car).getClass() == classType);


    }
}

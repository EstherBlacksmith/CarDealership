import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarManagement {

    List<Car> carStock = CarCreation.getCarStock();
    Map<String,String> getCarDescription(){
        Map<String,String> carsDescription = new HashMap<>(Map.of());
        carsDescription =carStock.stream().collect(Collectors.toMap(Car::getModel,Car::carDescription));
        return carsDescription;
    }

    List <String> getCarBySpecificYear(int year) {
        List<String> cars = new ArrayList<>(List.of());
        carStock.stream()
                .filter(car -> car instanceof Car)
                .filter(car -> ((Car) car).getFabricationYear() == year)
                .forEach(car -> cars.add(car.getModel()));
        return cars;
    }

    List <String> getCarByTypeAndFuel(CarType carType,FuelType fuelType ){
        List<String> cars = new ArrayList<>(List.of());
        carStock.stream()
                .filter(car -> car.getCarType() == carType)
                .filter(car ->  car.getFuelType() == fuelType).toList();

        return cars;
    }
}

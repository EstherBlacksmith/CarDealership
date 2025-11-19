import enums.CarType;
import enums.FuelType;

import java.util.Objects;

public abstract class Car {
    private final String brand;
    private final String  model;
    private final FuelType fuelType;
    private final int fabricationYear;
    private final CarType carType;

    public Car(String brand, String model, FuelType fuelType, int fabricationYear, CarType carType) {
        if(fabricationYear <= 0 ){
            throw new RuntimeException("The year can't be zero or negative");
        }

        this.brand = Objects.requireNonNull(brand);
        this.model =  Objects.requireNonNull(model);
        this.fuelType =  Objects.requireNonNull(fuelType);
        this.fabricationYear = fabricationYear;
        this.carType =  Objects.requireNonNull(carType);
    }

    abstract String carDescription() ;

    public String getModel() {
        return model;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public CarType getCarType() {
        return carType;
    }

    public String getBrand() {
        return brand;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType=" + fuelType +
                ", fabricationYear=" + fabricationYear +
                ", carType=" + carType +
                '}';
    }
}



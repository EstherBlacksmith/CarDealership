import java.util.Objects;

public class Sedan extends Car{

    int trunkCapacity;

    public Sedan(String brand,String model,FuelType fuelType,int fabricationYear, int trunkCapacity, CarType carType) {

        if(trunkCapacity <= 0 ){
            throw new RuntimeException("The velocity can't be zero or negative");
        }
        if(fabricationYear <= 0 ){
            throw new RuntimeException("The year can't be zero or negative");
        }
        this.brand = Objects.requireNonNull(brand);
        this.model =  Objects.requireNonNull(model);
        this.fabricationYear = fabricationYear;
        this.trunkCapacity = trunkCapacity;
        this.carType =  Objects.requireNonNull(carType);
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    @Override
    String carDescription() {
        return
        "With a big trunk capacity of " + trunkCapacity + " liters and a design for the confort, and a engine based on " + fuelType +
         ", this " + model + " "  + brand + "is the ideal companion for family trips and daily commutes in style.";
    }

    @Override
    String getModel() {
        return this.model;
    }

    @Override
    int getFabricationYear() {
        return this.fabricationYear;
    }
    @Override
    CarType getCarType() {
        return this.carType;
    }

    @Override
    FuelType getFuelType() {
        return this.fuelType;
    }
}

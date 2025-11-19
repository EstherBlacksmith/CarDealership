import enums.CarType;
import enums.FuelType;

public class Sedan extends Car{

    int trunkCapacity;

    public Sedan(String brand, String model, FuelType fuelType, int fabricationYear, CarType carType, int trunkCapacity) {

        super(brand,model,fuelType,fabricationYear,carType);
        if(trunkCapacity <= 0 ){
            throw new RuntimeException("The velocity can't be zero or negative");
        }

        this.trunkCapacity = trunkCapacity;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    @Override
    String carDescription() {
        return
        "With a big trunk capacity of " + trunkCapacity + " liters and a design for the confort, and a engine based on " + getFuelType() +
         ", this " + getModel() + " "  + getBrand() + "is the ideal companion for family trips and daily commutes in style.";
    }



}

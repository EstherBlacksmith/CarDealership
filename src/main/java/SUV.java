import enums.CarType;
import enums.FuelType;

import java.util.Objects;

public class SUV extends Car {
    private final String tractionType;

    public SUV(String brand, String model, FuelType fuelType, int fabricationYear, CarType carType, String tractionType) {
        super(brand, model, fuelType, fabricationYear, carType);

        this.tractionType = Objects.requireNonNull(tractionType);
    }

    public String getTractionType() {
        return tractionType;
    }

    @Override
    String carDescription() {
        return "The " + getModel() + " " + getBrand() + " from " + getFabricationYear() + " , with " + tractionType +
                " traction, and a engine based on " + getFuelType() + ", is an SUV that is not afraid " +
                " to leave the asphalt. Perfect for outdoor adventures, rough terrain and weekend getaways with power and safety.";
    }


}

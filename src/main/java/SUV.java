import java.util.Objects;

public class SUV extends Car{
    String tractionType;

    public SUV(String brand,String model,FuelType fuelType,int fabricationYear, String tractionType, CarType carType) {
        if(fabricationYear <= 0 ){
            throw new RuntimeException("The year can't be zero or negative");
        }
        this.brand = Objects.requireNonNull(brand);
        this.model =  Objects.requireNonNull(model);
        this.fuelType =  Objects.requireNonNull(fuelType);
        this.fabricationYear = fabricationYear;
        this.tractionType =  Objects.requireNonNull(tractionType);
        this.carType =  Objects.requireNonNull(carType);
    }

    public String getTractionType() {
        return tractionType;
    }

    @Override
    String carDescription() {
        return "The "+model +" "+brand + " from " + fabricationYear +" , with "+ tractionType + " traction, and a engine based on " + fuelType + ", is an SUV that is not afraid "+
        " to leave the asphalt. Perfect for outdoor adventures, rough terrain and weekend getaways with power and safety.";
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

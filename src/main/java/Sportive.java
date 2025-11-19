import java.util.Objects;

public class Sportive extends Car implements Exportable{
    int maximumVelocity;

    public Sportive(String brand,String model,FuelType fuelType,int fabricationYear, int maximumVelocity, CarType carType) {

        if(maximumVelocity <= 0 ){
            throw new RuntimeException("The velocity can't be zero or negative");
        }
        if(fabricationYear <= 0 ){
            throw new RuntimeException("The year can't be zero or negative");
        }
        this.brand = Objects.requireNonNull(brand);
        this.model =  Objects.requireNonNull(model);
        this.fabricationYear = fabricationYear;
        this.maximumVelocity = maximumVelocity;
        this.carType =  Objects.requireNonNull(carType);
    }

    public int getMaximumVelocity() {
        return maximumVelocity;
    }

    @Override
    String carDescription() {
        return  "Designed for those who live the road intensely: with a engine based on " + fuelType +
                "the " + model + " "  + brand + "reaches a top speed of " + maximumVelocity + " km/h', combining elegance and performance in every corner.";


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

    @Override
    public String getExportInfo() {
        return (carType.equals(CarType.BICICLE)|| carType.equals(CarType.MOTO) )? "This vehicle is exportable" : "This vehicle can't be exported";
    }
}

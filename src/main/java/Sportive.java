import enums.CarType;
import enums.FuelType;

public class Sportive extends Car implements Exportable {
    private final int maximumVelocity;

    public Sportive(String brand, String model, FuelType fuelType, int fabricationYear, CarType carType, int maximumVelocity) {
        super(brand, model, fuelType, fabricationYear, carType);

        if (maximumVelocity <= 0) {
            throw new RuntimeException("The velocity can't be zero or negative");
        }

        this.maximumVelocity = maximumVelocity;
    }


    public int getMaximumVelocity() {
        return maximumVelocity;
    }

    @Override
    String carDescription() {
        return "Designed for those who live the road intensely: with a engine based on " + getFuelType() +
                "the " + getModel() + " " + getBrand() + "reaches a top speed of " + maximumVelocity + " km/h', combining elegance and performance in every corner.";


    }

    @Override
    public String getExportInfo() {
        return (getCarType().equals(CarType.BICICLE) || getCarType().equals(CarType.MOTO)) ? "This vehicle is exportable" : "This vehicle can't be exported";
    }
}

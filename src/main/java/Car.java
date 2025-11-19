public abstract class Car {
    String brand;
    String  model;
    FuelType fuelType;
    int fabricationYear;
    CarType carType;

    abstract String carDescription();
    abstract String getModel();
    abstract int getFabricationYear();
    abstract CarType getCarType();
    abstract FuelType getFuelType();
}



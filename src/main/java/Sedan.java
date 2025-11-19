public class Sedan extends Car{

    int trunkCapacity;
    @Override
    String carDescription() {
        return
        "With a big trunk capacity of " + trunkCapacity + " liters and a design for the confort,"
        + "this " + model + " "  + brand + "is the ideal companion for family trips and daily commutes in style.";
    }
}

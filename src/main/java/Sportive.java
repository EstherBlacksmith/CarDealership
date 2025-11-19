public class Sportive extends Car{
    int maximumVelocity;
    @Override
    String carDescription() {
        return  "Designed for those who live the road intensely: " +
                "the " + model + " "  + brand + "reaches a top speed of " + maximumVelocity + " km/h', combining elegance and performance in every corner.";


    }
}

public class SUV extends Car{
    String tractionType;

    @Override
    String carDescription() {
        return "The "+model +" "+brand +", with "+ tractionType + " traction, is an SUV that is not afraid "+
        " to leave the asphalt. Perfect for outdoor adventures, rough terrain and weekend getaways with power and safety.";
    }
}

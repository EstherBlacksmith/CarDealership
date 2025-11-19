import java.util.List;

public class CarCreation {
    static List<Car> carStock ;

    public CarCreation() {
        Sedan sedan1 = new Sedan("Afrodita","A",FuelType.DIESEL,1999,20,CarType.UTILITARY);
        Sedan sedan2 = new Sedan("Athenea","B",FuelType.ELECTRIC,2025,40,CarType.BICICLE);
        SUV suv1 = new SUV("Terran","TR",FuelType.ELECTRIC,2000,"4x4",CarType.BICICLE);
        SUV suv2 = new SUV("Aquarius","AQ",FuelType.GAS,2020,"4x2",CarType.MOTO);
        Sportive sportive1 = new Sportive("Ganimedes","502",FuelType.ELECTRIC,2000,180,CarType.MOTO);
        Sportive sportive2 = new Sportive("Cassiopeia","590",FuelType.DIESEL,2008,200,CarType.MOTO);

        carStock = new java.util.ArrayList<>(List.of());
        carStock.add(sedan1);
        carStock.add(sedan2);
        carStock.add(suv1);
        carStock.add(suv2);
        carStock.add(sportive1);
        carStock.add(sportive2);
    }


    static List<Car> getCarStock(){
        return carStock;
    }
}

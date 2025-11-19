import enums.CarType;
import enums.FuelType;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ParkingTest {
    Parking parking ;

    @Test
    void createSUV() {
        parking = new Parking();
        SUV suv1 = parking.createSUV("Terran","TR", FuelType.ELECTRIC,2000, CarType.BICICLE,"4x4");

        assertEquals(SUV.class, suv1.getClass());
    }

    @Test
    void createSportive() {
        parking = new Parking();
        Sportive sportive2 = parking.createSportive("Ganimedes","503",FuelType.DIESEL,2000,CarType.BICICLE, 120);

        assertEquals(Sportive.class, sportive2.getClass());
    }

    @Test
    void createSedan() {
        parking = new Parking();
        Sedan sedan1 = parking.createSedan("Aquarius","AQ",FuelType.GAS,2020,CarType.MOTO, 50);

        assertEquals(Sedan.class, sedan1.getClass());
    }

    @Test
    void getListCar() {
        parking = new Parking();
        SUV suv1 = parking.createSUV("Terran","TR", FuelType.ELECTRIC,2000, CarType.BICICLE,"4x4");
        SUV suv2 = parking.createSUV("Terran","TR2",FuelType.GAS,2010,CarType.BICICLE,"4x2");

        parking.addCar(suv1,suv2);
        List<Car> carStock = parking.getListCar();

        assert(carStock.contains(suv1));
        assert(carStock.contains(suv2));
    }


    @Test
    void getCarBySpecificYear() {
        parking = new Parking();
        SUV suv1 = parking.createSUV("Terran","TR", FuelType.ELECTRIC,2000, CarType.BICICLE,"4x4");
        Sportive sportive1 = parking.createSportive("Ganimedes","502",FuelType.ELECTRIC,2000,CarType.UTILITARY, 120);
        Sedan sedan1 = parking.createSedan("Aquarius","AQ",FuelType.GAS,2020,CarType.MOTO, 50);

        SUV suv2 = parking.createSUV("Terran","TR2",FuelType.GAS,2010,CarType.BICICLE,"4x2");
        Sportive sportive2 = parking.createSportive("Ganimedes","503",FuelType.DIESEL,2000,CarType.BICICLE, 120);
        Sedan sedan2 = parking.createSedan("Aquarius2","AQ2",FuelType.ELECTRIC,2000,CarType.MOTO, 50);

        parking.addCar(suv1,sportive1,sedan1,sportive2,suv2,sedan2);


        List<Car> carByYear  = parking.getCarBySpecificYear(2000);

        assert(carByYear.contains(sedan1));
    }

    @Test
    void getCarByTypeAndFuel() {

        parking = new Parking();
        SUV suv1 = parking.createSUV("Terran","TR", FuelType.ELECTRIC,2000, CarType.BICICLE,"4x4");
        Sportive sportive1 = parking.createSportive("Ganimedes","502",FuelType.ELECTRIC,2000,CarType.UTILITARY, 120);
        Sedan sedan1 = parking.createSedan("Aquarius","AQ",FuelType.GAS,2020,CarType.MOTO, 50);

        SUV suv2 = parking.createSUV("Terran","TR2",FuelType.ELECTRIC,2010,CarType.BICICLE,"4x2");
        Sportive sportive2 = parking.createSportive("Ganimedes","503",FuelType.DIESEL,2000,CarType.BICICLE, 120);
        Sedan sedan2 = parking.createSedan("Aquarius2","AQ2",FuelType.ELECTRIC,2000,CarType.MOTO, 50);

        parking.addCar(suv1,sportive1,sedan1,sportive2,suv2,sedan2);


        List<Car> carByType  = parking.getCarByTypeAndFuel(SUV.class,FuelType.ELECTRIC);

        assert(carByType.contains(suv2));
    }
}
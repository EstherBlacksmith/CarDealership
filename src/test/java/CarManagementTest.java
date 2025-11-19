import org.junit.jupiter.api.BeforeAll;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarManagementTest {
    static SUV suv1;
    static SUV suv2;
    static Sportive sportive1;
    static Sportive sportive2;
    static Sedan sedan1;
    static Sedan sedan2;
    List<Car> carStock;
    @BeforeAll
    static void generateCarsStock(){
        List<Car> carStock = CarCreation.getCarStock();
    }

    @org.junit.jupiter.api.Test
    void getCarDescription() {


    }

    @org.junit.jupiter.api.Test
    void getCarBySpecificYear() {
    }

    @org.junit.jupiter.api.Test
    void getCarByTypeAndFuel() {
    }
}
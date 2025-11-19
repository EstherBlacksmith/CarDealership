import enums.CarType;
import enums.FuelType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();

        SUV suv1 = parking.createSUV("Terran", "TR", FuelType.ELECTRIC, 2000, CarType.BICICLE, "4x4");
        Sportive sportive1 = parking.createSportive("Ganimedes", "502", FuelType.ELECTRIC, 2000, CarType.UTILITARY, 120);
        Sedan sedan1 = parking.createSedan("Aquarius", "AQ", FuelType.GAS, 2020, CarType.MOTO, 50);

        SUV suv2 = parking.createSUV("Terran", "TR2", FuelType.GAS, 2010, CarType.BICICLE, "4x2");
        Sportive sportive2 = parking.createSportive("Ganimedes", "503", FuelType.DIESEL, 2000, CarType.BICICLE, 120);
        Sedan sedan2 = parking.createSedan("Aquarius2", "AQ2", FuelType.ELECTRIC, 2000, CarType.MOTO, 50);

        parking.addCar(suv1, sportive1, sedan1, suv2, sportive2, sedan2);

        System.out.println("Descriptions:\n" + suv1.carDescription() + "\n" + sedan1.carDescription());

        List<Car> carList;
        carList = parking.getListCar();

        carList.forEach(System.out::println);

        System.out.println("By year");
        List<Car> carListYear;
        carListYear = parking.getCarBySpecificYear(1999);
        carListYear.forEach(System.out::println);

        System.out.println("By type");

        List<Car> carListType;
        carListType = parking.getCarByTypeAndFuel(SUV.class, FuelType.ELECTRIC);
        carListType.forEach(System.out::println);

        ExportReportPrinter exportReportPrinter = new ExportReportPrinter();
        exportReportPrinter.printReport(sportive1);
        exportReportPrinter.printReport(sportive2);

    }

}



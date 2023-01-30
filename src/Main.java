import transport.*;
import transport.enum.CarEnum;
import transport.enum.BusEnum;
import transport.enum.TrucksEnum;
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){

            DriverB driverB = new DriverB("Driver cat.B № " + i, true, 5 + i);
            Car car = new Car("Car brand " + i, "Car model " + i, 2, driverB);

            DriverC driverC = new DriverC("Driver cat.C № " + i, true, 7 + i);
            Trucks trucks = new Trucks ("Trucks brand " + i, "Trucks model " + i, 5, driverC);

            DriverD driverD = new DriverD("Driver cat.D № " + i, true, 10 + i);
            Bus bus = new Bus ("Bus brand " + i, "Bus model " + i, 4, driverD);

            printInfo(car);
            printInfo(trucks);
            printInfo(bus);

            lancia.printType();
            System.out.println(lancia);
            lancia.setBody(BodyType.HATCHBACK);
            kamaz.setLoadCapacity(TrucksEnum.N3);
            ikarus.setPassengerCapacity(BusEnum.SMALL);
            lancia.printType();
            kamaz.printType();
            System.out.println(kamaz);
            ikarus.printType();
        }
    }
    private static void printInfo (Transport<?> transport){
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand()
                + " и будет участвовать в заезде");
    }
}
import transport.*;
import transport.CarEnum;
import transport.BusEnum;
import transport.TrucksEnum;
import transport.Car;
import transport.Bus;
import transport.Trucks;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){

            DriverB driverB = new DriverB("Driver cat.B № " + i, true, 5 + i);
            Car car = new Car("Car brand №" + i, "Car model №" + i, 1.6, driverB, CarEnum.SEDAN,
                    new Mechanic("Петров","Yandex"));

            DriverC driverC = new DriverC("Driver cat.C № " + i, true, 7 + i);
            Trucks trucks = new Trucks("Truck brand №" + i, "Truck model №" + i, 2.4, driverC,
                    TrucksEnum.N1, new Mechanic("Иванов","Петрович"));

            DriverD driverD = new DriverD("Driver cat.D № " + i, true, 10 + i);
            Bus bus = new Bus ("Bus brand " + i, "Bus model " + i, 4, driverD, BusEnum.MEDIUM,
                    new Mechanic("Сидоров","Московский транспорт"));

            printInfo(car);
            printInfo(trucks);
            printInfo(bus);
            trucks.goDiagnostics();
            car.goDiagnostics();
            //bus.goDiagnostics();
            try {
                throw new TransportTypeException("Этот вид транспортного средства диагностику проходить не должен!");
            } catch (TransportTypeException e) {
                System.err.println(e.getMessage());
            }


        }
        DriverD driverD1 = new DriverD("Кудряшкин",true,5);
        DriverD driverD2 = new DriverD("Иванов",false,9);
        DriverB driverB1 = new DriverB("Сидоров",true,5);
        DriverB driverB2 = new DriverB("Оленченко",true,6);
        DriverC driverC1 = new DriverC("Рябинин",true,8);
        DriverC driverC2 = new DriverC("Петров",false,6);


        Mechanic mechanic1 = new Mechanic("Петров","Yandex");
        Mechanic mechanic2 = new Mechanic("Иванов","Петрович");
        Mechanic mechanic3 = new Mechanic("Сидоров","Московский транспорт");

        Transport bus1 = new Bus("bus1","bus1",6.0, driverD1, BusEnum.MEDIUM,
                mechanic1);
        Transport bus2 = new Bus("bus2","bus2",7.4, driverD2, BusEnum.LARGE,
                mechanic1);
        Transport сar1 = new Car("car1","car1",3.5, driverB1, CarEnum.CROSSOVER,
                mechanic2);
        Transport car2 = new Car("car2","car2",2.6, driverB2, CarEnum.SEDAN,
                mechanic2);
        Transport truck1 = new Trucks("truck1","truck1",6.0, driverC1, TrucksEnum.N2,
                mechanic3);
        Transport truck2 = new Trucks("truck2","truck2",5.8, driverC2, TrucksEnum.N1,
                mechanic3);


        List <Transport> racers = new ArrayList<>();
        racers.add(bus1);
        racers.add(bus2);
        racers.add(сar1);
        racers.add(car2);
        racers.add(truck1);
        racers.add(truck2);
        for (Transport transport : racers){
            System.out.println(transport + " " + transport.getDriver() + " " + transport.getMechanic());
        }

        Map<String, String> mechanicsAndCar = new HashMap<>();

        mechanicsAndCar.put("BMW", "Пертов");
        mechanicsAndCar.put("Електробус", "Иванов");
        mechanicsAndCar.put("Scania", "Сидоров");

        for (Map.Entry<String, String> contact: mechanicsAndCar.entrySet()) {
            System.out.println("Марка: " + contact.getKey() + ", механик: " + contact.getValue());
        }
    }
    private static void printInfo (Transport<?> transport){
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand()
                + " и будет участвовать в заезде");
    }
}
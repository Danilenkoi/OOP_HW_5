package transport;
import transport.BusEnum;
public class Bus extends Transport<DriverD> {

    private BusEnum busEnum;
    public Bus (String brand, String model, double engineVolume, DriverD driver){
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove(){
        System.out.println("Автобус - " + getBrand() + " начал движение");
    }
    @Override
    public void finishMove(){
        System.out.println("Автобус - " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп");
    }

    @Override
    public void theBestLepTime(){
        int minBound = 100;
        int maxBound = 180;
        int theBestLep = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("лучший круг! " + theBestLep);
    }

    @Override
    public void maxSpeed() {
        int minBound = 60;
        int maxBound = 100;
        int theBestSpeed = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("максимальная скорость " + theBestSpeed);
    }


    @Override
    public String toString() {
        return super.toString() + (busEnum == null ? ". Passenger capacity: No data" : ". " + busEnum);
    }

    @Override
    public void printType() {
        System.out.println(busEnum == null ? "Passenger capacity: No data" : busEnum);
    }

    public BusEnum getBusEnum() {
        return busEnum;
    }

    public void setPassengerCapacity(BusEnum busEnum) {
        this.busEnum = busEnum;
    }
}


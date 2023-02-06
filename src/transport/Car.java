package transport;

public class Car extends Transport<DriverB> {

    private CarEnum carEnum;

    public Car (String brand, String model, double engineVolume, DriverB driver, CarEnum carEnum, Mechanic mechanic){
        super(brand, model, engineVolume, driver, mechanic);
        this.carEnum = carEnum;
    }

    @Override
    public void goDiagnostics() {
        System.out.println("Машины проходят диагностику");
    }

    @Override
    public void startMove(){
        System.out.println("Автомобиль - " + getBrand() + " начал движение");
    }
    @Override
    public void finishMove(){
        System.out.println("Автомобиль - " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп");
    }

    @Override
    public void theBestLepTime(){
        int minBound = 90;
        int maxBound = 200;
        int theBestLep = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("лучший круг! " + theBestLep);
    }

    @Override
    public void maxSpeed() {
        int minBound = 100;
        int maxBound = 210;
        int theBestSpeed = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("максимальная скорость " + theBestSpeed);
    }
    @Override
    public String toString() {
        return super.toString() + (carEnum == null ? ". Passenger capacity: No data" : ". " + carEnum);
    }

    @Override
    public void printType() {
        System.out.println(carEnum == null ? "Passenger capacity: No data" : carEnum);
    }

    public CarEnum getCarEnum() {
        return carEnum;
    }

    public void setCarEnum(CarEnum carEnum) {
        this.carEnum = carEnum;
    }

}


package transport;

public class Trucks extends Transport<DriverC> {

    private TrucksEnum trucksEnum;

    public Trucks (String brand, String model, double engineVolume, DriverC driver, TrucksEnum trucksEnum) {
        super(brand, model, engineVolume, driver);
        this.trucksEnum = trucksEnum;
    }

    @Override
    public boolean goDiagnostics(){
        return getDiagnostic();
    }
    @Override
    public void startMove(){
        System.out.println("Грузовик - " + getBrand() + " начал движение");
    }
    @Override
    public void finishMove(){
        System.out.println("Грузовик - " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп");
    }

    @Override
    public void theBestLepTime(){
        int minBound = 90;
        int maxBound = 160;
        int theBestLep = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("лучший круг! " + theBestLep);
    }

    @Override
    public void maxSpeed() {
        int minBound = 90;
        int maxBound = 130;
        int theBestSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("максимальная скорость " + theBestSpeed);
    }


    @Override
    public String toString() {
        return super.toString() + (trucksEnum == null ? ". Load capacity: No data" : ". " + trucksEnum);
    }

    @Override
    public void printType() {
        System.out.println(trucksEnum == null ? "Load capacity: No data" : trucksEnum);
    }

    public TrucksEnum getTrucksEnum() {
        return trucksEnum;
    }

    public void setTrucksEnum(TrucksEnum trucksEnum) {
        this.trucksEnum = trucksEnum;
    }
}


package transport;

public abstract class Transport <T extends Driver> implements Competing {

    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    public Transport(String brand, String model, double engineVolume, T driver) {

        if (brand == null || brand.isEmpty()){
            brand = "noname";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()){
            model = "custom";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setDriver(driver);
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0) ? 3.0 : engineVolume;
    }
    public void setDriver(T driver){
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public T getDriver(){
        return driver;
    }

    public double getEngineVolume() {
        return engineVolume;
    }


    public abstract void startMove();

    public abstract void finishMove();

    public static boolean getDiagnostic(){
        System.out.println("Пройти диагностику!");
        return false;
    }
    public abstract boolean goDiagnostics() throws TransportTypeException;



    public String toString() {
        return '\n' + brand + " " + model + '\n' + "\t engine capacity - " + engineVolume + ".";

    }

    public abstract void printType();


}

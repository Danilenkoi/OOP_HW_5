package transport;

public abstract class Driver {

    private String name;
    private boolean hasDriverLicense;
    private int excerienceInYear;

    public Driver (String name, boolean hasDriverLicense, int excerienceInYear){
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.excerienceInYear = excerienceInYear;
    }

    public void setName() {
        this.name = name;
    }
    public void setHasDriverLicense(){
        this.hasDriverLicense = hasDriverLicense;
    }
    public void setExcerienceInYear(){
        this.excerienceInYear = excerienceInYear;
    }

    public String getName(){
        return name;
    }
    public boolean getHasDriverLicense(){
        return hasDriverLicense;
    }
    public int getExcerienceInYear(){
        return excerienceInYear;
    }

    public abstract void startMove();
    public abstract void finishMove();
    public abstract void refill();

    @Override
    public String toString() {
        return "Driver{" + "name='" + name + '\'' + ", hasDriverLicense=" + hasDriverLicense +
                ", experienceInYear=" + excerienceInYear + '}';
    }

}


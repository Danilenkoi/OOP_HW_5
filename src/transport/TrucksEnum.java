package transport;

public enum TrucksEnum {
    N1 (null, 3.5F),
    N2 (3.5F, 12F),
    N3 (12F, null);


    private Float minLoad, maxLoad;

    TrucksEnum (Float minLoad, Float maxLoad){
        this.minLoad = minLoad;
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return "Грузоподъемность грузовика в тоннах: " +
                (minLoad != null ? "от " + minLoad : " до") +
                (maxLoad != null ? " от " + maxLoad : " и выше");
    }
}

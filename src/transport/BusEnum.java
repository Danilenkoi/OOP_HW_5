package transport;

public enum BusEnum {
    ESPECIALLY (null, 10),
    SMALL (null, 25),
    MEDIUM (40, 50),
    BIG (60, 80),
    LARGE (100, 120);

    private Integer minPassengerSeats, maxPassengerSeats;

    BusEnum(Integer minPassengerSeats, Integer maxPassengerSeats){
        this.minPassengerSeats = minPassengerSeats;
        this.maxPassengerSeats = maxPassengerSeats;
    }

    @Override
    public String toString() {
        return "вместимость человек: " +
                (minPassengerSeats != null ? "от " + minPassengerSeats : " до") +
                (maxPassengerSeats != null ? " от " + maxPassengerSeats : " и выше");
    }
}

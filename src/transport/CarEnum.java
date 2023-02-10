package transport;

public enum CarEnum {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе"),
    WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private String nameRussian;

    CarEnum (String nameRussian){
        this.nameRussian = nameRussian;
    }
    @Override
    public String toString() {
       return "Тип кузова: " + nameRussian;
    }
}

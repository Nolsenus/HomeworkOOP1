public class Bread extends Grocery{
    private String flourType;

    public String getFlourType() {
        return flourType;
    }

    public Bread(String name, int price, int amount, String units, int expiresInDays, String flourType) {
        super(name, price, amount, units, expiresInDays);
        this.flourType = flourType;
    }

    @Override
    public String toString() {
        return String.format("Хлеб{%s, Мука: %s}", super.baseInfo(), flourType);
    }

}

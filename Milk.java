public class Milk extends Drink {
    private float fatPercentage;

    public float getFatPercentage() {
        return fatPercentage;
    }

    public Milk(String name, int price, int amount, String units,
                int volumeMillilitres, int expiresInDays, float fatPercentage) {
        super(name, price, amount, units, volumeMillilitres, expiresInDays);
        this.fatPercentage = fatPercentage;
        this.expiresInDays = expiresInDays;
    }

    @Override
    public String toString() {
        return String.format("Молоко{%s, Жирность: %.1f%c, Срок годности: %d дней}",
                super.baseInfo(), fatPercentage, '%', expiresInDays);
    }
}

public class Lemonade extends Drink {
    public Lemonade(String name, int price, int amount, String units, int expiresInDays, int volumeMillilitres) {
        super(name, price, amount, units, expiresInDays, volumeMillilitres);
    }

    @Override
    public String toString() {
        return String.format("Лимонад{%s}", super.baseInfo());
    }
}

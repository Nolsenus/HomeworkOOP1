import java.lang.annotation.Documented;

public class Eggs extends Grocery {
    private int amountPerPackage;

    public int getAmountPerPackage() {
        return amountPerPackage;
    }

    public Eggs(String name, int price, int amount, String units, int expiresInDays, int amountPerPackage) {
        super(name, price, amount, units, expiresInDays);
        this.amountPerPackage = amountPerPackage;
    }

    @Override
    public String toString() {
        return String.format("Яйца{%s, Количество в упаковке: %d}", super.baseInfo(), amountPerPackage);
    }
}

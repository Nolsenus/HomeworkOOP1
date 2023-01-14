public class Mask extends HygieneProduct {
    public Mask(String name, int price, int amount, String units, int amountPerPackage) {
        super(name, price, amount, units, amountPerPackage);
    }

    @Override
    public String toString() {
        return String.format("Маски{%s}", super.baseInfo());
    }
}

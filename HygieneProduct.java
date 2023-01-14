public abstract class HygieneProduct extends Product{
    protected int amountPerPackage;

    public float getAmountPerPackage() {
        return amountPerPackage;
    }

    protected HygieneProduct(String name, int price, int amount, String units, int amountPerPackage) {
        super(name, price, amount, units);
        this.amountPerPackage = amountPerPackage;
    }

    @Override
    protected String baseInfo() {
        return String.format("%s, Штук в упаковке: %d", super.baseInfo(), amountPerPackage);
    }
}

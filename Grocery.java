public abstract class Grocery extends Product{
    protected int expiresInDays;

    public int getExpiresInDays() {
        return expiresInDays;
    }

    protected Grocery(String name, int price, int amount, String units, int expiresInDays) {
        super(name, price, amount, units);
        this.expiresInDays = expiresInDays;
    }

    @Override
    protected String baseInfo() {
        return String.format("%s, Срок годности: %d дней", super.baseInfo(), expiresInDays);
    }
}

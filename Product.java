public abstract class Product {
    protected String name;
    protected int price;
    protected int amount;
    protected String units;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public String getUnits() {
        return units;
    }

    protected Product(String name, int price, int amount, String units) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.units = units;
    }

    protected String baseInfo() {
        return String.format("Название: %s, Цена: %d р., Количество: %d %s", name, price, amount, units);
    }
}

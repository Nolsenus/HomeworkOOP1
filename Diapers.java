public class Diapers extends HygieneProduct {
    private String size;
    private int minWeight;
    private int maxWeight;
    private String type;

    public String getSize() {
        return size;
    }

    public int getMinWeight() {
        return minWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public String getType() {
        return type;
    }

    public Diapers(String name, int price, int amount, String units,
                   int amountPerPackage, String size, int minWeight, int maxWeight, String type) {
        super(name, price, amount, units, amountPerPackage);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Подгузники{%s, Размер: %s, Минимальный вес: %d кг, Максимальный вес: %d кг, Тип: %s}",
                super.baseInfo(), size, minWeight, maxWeight, type);
    }
}

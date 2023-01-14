public class ToiletPaper extends HygieneProduct {
    private int layers;

    public int getLayers() {
        return layers;
    }

    public ToiletPaper(String name, int price, int amount, String units, int amountPerPackage, int layers) {
        super(name, price, amount, units, amountPerPackage);
        this.layers = layers;
    }

    @Override
    public String toString() {
        return String.format("Туалетная бумага{%s, Количество слоёв: %d}", super.baseInfo(), layers);
    }
}

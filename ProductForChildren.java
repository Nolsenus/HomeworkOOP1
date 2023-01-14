public abstract class ProductForChildren extends Product{
    protected int minAgeMonths;
    protected boolean isHypoallergenic;

    public int getMinAgeMonths() {
        return minAgeMonths;
    }

    public boolean isHypoallergenic() {
        return isHypoallergenic;
    }

    protected ProductForChildren(String name, int price, int amount, String units,
                                 int minimumAgeMonths, boolean isHypoallergenic) {
        super(name, price, amount, units);
        this.minAgeMonths = minimumAgeMonths;
        this.isHypoallergenic = isHypoallergenic;
    }

    @Override
    protected String baseInfo() {
        return String.format("%s, Минимальный возраст: %d месяцев, %sипоаллергенный",
                super.baseInfo(), minAgeMonths, isHypoallergenic ? "Г" : "Не г");
    }
}

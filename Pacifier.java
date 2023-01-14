public class Pacifier extends ProductForChildren {
    public Pacifier(String name, int price, int amount, String units, int minAgeMonths, boolean isHypoallergenic) {
        super(name, price, amount, units, minAgeMonths, isHypoallergenic);
    }

    @Override
    public String toString() {
        return String.format("Соска{%s}", super.baseInfo());
    }
}

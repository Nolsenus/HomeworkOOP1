public abstract class Drink extends Grocery{

    protected int volumeMilliLitres;

    public int getVolumeMilliLitres() {
        return volumeMilliLitres;
    }

    protected Drink(String name, int price, int amount, String units, int expiresInDays, int volumeMilliLitres) {
        super(name, price, amount, units, expiresInDays);
        this.volumeMilliLitres = volumeMilliLitres;
    }

    @Override
    protected String baseInfo() {
        return String.format("%s, Объём: %d мл", super.baseInfo(), volumeMilliLitres);
    }
}

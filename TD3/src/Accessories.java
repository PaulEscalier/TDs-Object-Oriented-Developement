public class Accessories extends Product{
    public Accessories(String name, double purchase_price, double sell_price) {
        super(name, purchase_price, sell_price);
    }

    @Override
    public String toString() {
        return "Accessories{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", purchase_price=" + purchase_price +
                ", sell_price=" + sell_price +
                ", discount_price=" + discount_price +
                ", nbItems=" + nbItems +
                '}';
    }
}

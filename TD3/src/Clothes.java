public class Clothes extends Product{
    int size;

    public Clothes(String name, double purchase_price, double sell_price, int size) {
            super(name, purchase_price, sell_price);
        try {
            if(size<34 || size>54){
                throw new IllegalArgumentException("Negative price!");
            }
            this.size = size;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", purchase_price=" + purchase_price +
                ", sell_price=" + sell_price +
                ", discount_price=" + discount_price +
                ", nbItems=" + nbItems +
                ", size=" + size +
                '}';
    }
}

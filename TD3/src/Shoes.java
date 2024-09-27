public class Shoes extends Product{
    int shoeSize;

    public Shoes(String name, double purchase_price, double sell_price, int shoeSize) {
        super(name, purchase_price, sell_price);
        try{
            if(shoeSize < 36 || shoeSize > 50){
                throw new IllegalArgumentException("Invalid shoe size!");
            }
            this.shoeSize = shoeSize;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "shoeSize=" + shoeSize +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", purchase_price=" + purchase_price +
                ", sell_price=" + sell_price +
                ", discount_price=" + discount_price +
                ", nbItems=" + nbItems +
                '}';
    }
}

public abstract class Product implements Discount, Comparable<Double>{
    protected int number;
    protected String name;
    protected double purchase_price;
    protected double sell_price;
    protected double discount_price;
    protected int nbItems;

    public static double Capital;
    public static double Income = 0;
    public static double Cost = 0;


    public Product(String name, double purchase_price, double sell_price) {
        try{
            if(purchase_price < 0 || sell_price < 0){
                throw new IllegalArgumentException("Negative price!");
            }

            this.name = name;
            this.purchase_price = purchase_price;
            this.sell_price = sell_price;
            this.nbItems = 0;
            this.discount_price = 0;
            this.number = 0;
            Capital ++;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void applyDiscount() {
        if(this instanceof Accessories) {
            this.discount_price = this.sell_price * 0.5;
        }else if(this instanceof Shoes) {
                this.discount_price = this.sell_price * 0.8;
        }else if(this instanceof Clothes){
                this.discount_price = this.sell_price * 0.7;
        }
    }

    @Override
    public int compareTo(Double o) {
        if(this.discount_price > o){
            return 1;
        }else if(this.discount_price < o){
            return -1;
        }else{
            return 0;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(double purchase_price) {
        try {
            if(purchase_price < 0){
                throw new IllegalArgumentException("Negative price!");
            }
            this.purchase_price = purchase_price;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public double getSell_price() {
        return sell_price;
    }

    public void setSell_price(double sell_price) {
        try {
            if(sell_price < 0){
                throw new IllegalArgumentException("Negative price!");
            }
            this.sell_price = sell_price;
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public double getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(double discount_price) {
        this.discount_price = discount_price;
    }

    public int getNbItems() {
        return nbItems;
    }

    public void setNbItems(int nbItems) {
        try {
            if (nbItems < 0) {
                throw new IllegalArgumentException("Negative number of items!");
            }
            this.nbItems = nbItems;
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void sell(int nbItems){
        try {
            if (nbItems > this.nbItems) {
                throw new IllegalArgumentException("Product Unavailable");
            }else if(nbItems < 0){
                throw new IllegalArgumentException("Negative number of items!");
            }else {
                this.nbItems -= nbItems;
                Income += nbItems * this.sell_price;
                Cost += nbItems * this.purchase_price;
            }

        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public void purchase(int nbItems){
        try {
            if (nbItems < 0) {
                throw new IllegalArgumentException("Negative number of items!");
            } else {
                this.nbItems += nbItems;
            }
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                ", name='" + name + '\'' +
                "number=" + number +
                ", purchase_price=" + purchase_price +
                ", sell_price=" + sell_price +
                ", discount_price=" + discount_price +
                ", nbItems=" + nbItems +
                '}';
    }
}

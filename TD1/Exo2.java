public class Exo2 {
    public static class Book{
        private String title;
        private String author;
        private float price;
        public Book(String title, String author, float price){
            this.title = title;
            this.author = author;
            this.price = price;
        }
        public String getTitle(){
            return this.title;
        }
        public String getAuthor(){
            return this.author;
        }
        public float getPrice(){
            return this.price;
        }
        public void Display(){
            System.out.println("Title : "+this.title+
            " Author : "+this.author+
            " price : "+this.price);
        }
    }
    public static void main(String[] args){
        Book b1 = new Book("test1", "quelqu'un surement", 0.1f);
        Book b2 = new Book("test2", "quelqu'un surement oui ", 0.2f);
        b1.Display();
        b2.Display();
        b1.Display();

    }
}

public class Exo1{
    public static class Rectangle{
        float length;
        float width;
        public Rectangle(float lenght, float width){
            this.length =  lenght;
            this.width = width;    
        }
        public float Perimeter(){
            return 2*(length+width);
        }
        public float area(){
            return length*width;
        }
        public boolean isSquare(){
            return width == length;
        }   
        public void displayRectangle(){
            System.out.println("Length: " + this.length +
            " - Width: " + this.width +
            " - Perimeter: " + this.Perimeter() +
            " - Area: " + this.area()+
            " - "+(this.isSquare() ? "is a square":"is not a square"));
        }
    }
    
    public static void main (String[] args){
        Rectangle r1 = new Rectangle(3, 4);
        r1.displayRectangle();
        Rectangle r2 = new Rectangle(0, 0);
        r2.displayRectangle();
        r1.displayRectangle();
    }
}
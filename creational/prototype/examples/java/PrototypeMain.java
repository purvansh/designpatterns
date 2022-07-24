public class PrototypeMain {
    public static void main(String[] args) {
        Paint paint = new Line(0, 0, 10, 10);
        paint.display();
        Paint paint2 = paint.clone();
        paint2.display();
        Paint paint3 = new Square(0, 0, 10, 10);
        paint3.display();
        Paint paint4 = paint3.clone();
        paint4.display();
        
    }
}

package shapesarefun;

public class Square extends Rectangle {

    public Square() {
        super();
    }
    
    public Square(int width, int length) {
        if (width != length) {
            System.out.println("You're an idiot.");
            System.exit(-1);
        }
        this.setLength(length);
        this.setWidth(width);
    }

    @Override
    public boolean isSquare() {
        return true;
    }

    @Override
    public String toString() {
        return "I'm a square, yo.";
    }
}

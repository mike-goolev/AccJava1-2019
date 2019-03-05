package shapesarefun;

public class ShapesAreFun {

    public static void main(String[] args) {
        
        //Creating a bunch of shapes via constructors, default and parameterized
        Circle c = new Circle();
        Circle c2 = new Circle(15);
        Circle c3 = new Circle(1);
        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle(2, 4);
        
        //Printing out the shapes' areas and perimeters.
        System.out.println("C: " + c.getArea() + " " + c.getPerimeter());
        System.out.println("C2: " + c2.getArea() + " " + c2.getPerimeter());
        System.out.println("C3: " + c3.getArea() + " " + c3.getPerimeter());
        System.out.println("R: " + r.getArea() + " " + r.getPerimeter());
        System.out.println("R2: " + r2.getArea() + " " + r2.getPerimeter());
        
        //Can also call isSquare for rectangles.
        System.out.println(r.isSquare());
        
        //You also can use objects in-line, if you want to.
        //But the downside is that the object is gone as soon as you use it.
        int a1 = Rectangle.calcArea(new Rectangle(10, 2));
        double a2 = new Rectangle().getArea();
        System.out.println(a1);
        double a3 = Circle.calcArea(c);
        System.out.println(a3);
        
        //I added origins to the abstract class Shape, which means all children
        // of Shape get origins, too. And since all origins are the same, 
        // we don't need to override the implementation in any children.
        Shape s = new Square();
        Point origin = s.getOrigin();
        System.out.println(origin);
        s.setOrigin(new Point(10,1));
        System.out.println(s.getOrigin());
        
        System.out.println("\n\n");
        
        //This is an example of Polymorphism. Treating specific instances of
        // square, rectangle, circle as just Shapes. They're limited by what a
        // shape is defined as (can't automatically use square-related methods
        // and variables)...but it has its uses.
        Shape[] shapes = new Shape[6];
        shapes[0] = s;
        shapes[1] = c;
        shapes[2] = c2;
        shapes[3] = c3;
        shapes[4] = r;
        shapes[5] = r2;
        for(Shape shape : shapes) {
            
            //When necessary we can check to see if a shape is an instance of
            // one of its children, and if so, you can cast it back down to its
            // subclass and use any variables and methods it has.
            if (shape instanceof Square) {
                System.out.println("Hey, I have a square!");
            }
            if (shape instanceof Rectangle) {
                Rectangle rect = (Rectangle)shape; //A cast back to a rectangle
                System.out.println("Hey, I have a rectangle!");
                int length = rect.getLength();
                System.out.println("Its lengths is: " + length);
            }
            if (shape instanceof Circle) {
                //An example of inline casting.
                System.out.println("Radius: " + ((Circle)shape).getRadius());
                System.out.println("Hey, I have a circle!");
            }
            
            //Printing out stats that ALL shapes have in common. Polymorphism!
            System.out.println("Shape area: " + shape.getArea());
            System.out.println("Shape perimeter: " + shape.getPerimeter());
            shape.sayHello();
            System.out.println(shape.toString());
            System.out.println("\n\n");
        }
    }    
}

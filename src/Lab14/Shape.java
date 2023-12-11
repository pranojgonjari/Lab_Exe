package Lab14;

abstract class Shape {

	 // Abstract method to calculate the area of the shape
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
 class shapetest{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());

        // d. Create a base class reference to invoke the method of the respective class to which the reference is referring to.
        Shape shapeReference;

        shapeReference = circle; // Using polymorphism to refer to a Circle object
        System.out.println("Area using base class reference for Circle: " + shapeReference.area());

        shapeReference = rectangle; // Using polymorphism to refer to a Rectangle object
        System.out.println("Area using base class reference for Rectangle: " + shapeReference.area());
    }

}

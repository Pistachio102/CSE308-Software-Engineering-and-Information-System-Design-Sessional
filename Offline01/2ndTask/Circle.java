public class Circle implements ShapeInterface {

    public double radius;
    public Computer computer;
    public Circle(double radius,Computer computer)
    {

        this.radius=radius;
        this.computer=computer;
    }
    @Override
    public double calculateArea() {
        if (this.radius>this.computer.resolutionL || this.radius>this.computer.resolutionW)
        {
            System.out.println("Parameter value out of bound.");
            return  0;
        }
        return 3.1416*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        if (this.radius>this.computer.resolutionL || this.radius>this.computer.resolutionW)
        {
            System.out.println("Parameter value out of bound.");
            return  0;
        }
        return 2*3.1416*radius;
    }

    @Override
    public String toString() {
        return "Circle: \n" +

                " Radius of the circle=" + radius +"\n"+
                " Resolution=" + computer.resolutionL +"*"+computer.resolutionW+"\n"+
                " Surface area of the circle="+calculateArea()+"\n"+
                " Perimeter of the circle="+calculatePerimeter()+"\n"
                ;
    }
}

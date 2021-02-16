public class Triangle implements ShapeInterface {
    public String name;
    public double base;
    public double height;
    Computer computer;

    public Triangle(double base,double height,Computer computer)
    {
        name="Triangle";
        this.base=base;
        this.height=height;
        this.computer=computer;
    }

    @Override
    public double calculateArea() {
        if (this.base>this.computer.resolutionL || this.height>this.computer.resolutionW)
        {
            System.out.println("Parameter values are out of bound.");
            return  0;
        }
        return .5*base*height;
    }

    @Override
    public double calculatePerimeter() {
        if (this.base>this.computer.resolutionL || this.height>this.computer.resolutionW)
        {
            System.out.println("Parameter values are out of bound.");
            return  0;
        }
        return 50;
    }

    @Override
    public String toString() {
        return "Triangle: \n" +

                " Base of the rectangle=" + base +"\n"+
                " Height of the rectangle=" + height +"\n"+
                " Resolution=" + computer.resolutionL +"*"+computer.resolutionW+"\n"+
                " Surface area of the triangle="+calculateArea()+"\n"+
                " Perimeter of the triangle="+calculatePerimeter()+"\n"

                ;
    }

    }


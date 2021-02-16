public class Rectangle implements ShapeInterface {
    public String name;
    public double length;
    public double width;
    public Computer computer;

    public Rectangle(double length,double width,Computer computer)
    {
        name="Rectangle";
        this.length=length;
        this.width=width;
        this.computer=computer;
    }
    /*@Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length+width);
    }*/

    @Override
    public double calculateArea() {
        if (this.length>this.computer.resolutionL || this.width>this.computer.resolutionW)
        {
            System.out.println("Parameter values are out of bound ");
            return  0;
        }
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        if (this.length>this.computer.resolutionL || this.width>this.computer.resolutionW)
        {
            System.out.println("Parameter values are out of bound ");
            return  0;
        }
        return 2*(length+width);
    }


    @Override
    public String toString() {
        return "Rectangle: \n" +

                " Length of the rectangle=" + length +"\n"+
                " Width of the rectangle=" + width +"\n"+
                " Resolution=" + computer.resolutionL +"*"+computer.resolutionW+"\n"+
                " Surface area of the rectangle="+calculateArea()+"\n"+
                " Perimeter of the rectangle="+calculatePerimeter()+"\n"

                ;
    }
}

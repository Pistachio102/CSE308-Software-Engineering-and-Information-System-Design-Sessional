public class Square implements ShapeInterface {
    public String name;
    public double arm;
    public Computer computer;

    public Square(double arm,Computer computer)
    {
        name="Square";
        this.arm=arm;
        this.computer=computer;
    }

    @Override
    public double calculateArea() {
        if(this.arm>this.computer.resolutionL || this.arm>this.computer.resolutionW)
        {
            System.out.println("Parameter value out of bound");
            return  0;
        }
        return arm*arm;
    }

    @Override
    public double calculatePerimeter() {
        if(this.arm>this.computer.resolutionL || this.arm>this.computer.resolutionW)
        {
            System.out.println("Parameter value out of bound");
            return  0;
        }
        return 4*arm;
    }

    @Override
    public String toString() {
        return "Square: \n" +

                " Arm of the square=" + arm +"\n"+
                " Resolution=" + computer.resolutionL +"*"+computer.resolutionW+"\n"+
                " Surface area of the square="+calculateArea()+"\n"+
                " Perimeter of the square="+calculatePerimeter()+"\n"

                ;
    }

   }

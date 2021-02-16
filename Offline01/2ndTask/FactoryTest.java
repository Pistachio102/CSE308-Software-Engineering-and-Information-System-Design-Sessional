import java.io.*;


public class FactoryTest {

    public static void main(String[] args) {

        ComputerFactory computerFactory=new ComputerFactory();
        Computer computer1=computerFactory.getComputer("ComputerA");
        Circle circle=new Circle(5,computer1);
        System.out.println(circle);

        System.out.println();

        Computer computer2=computerFactory.getComputer("ComputerB");
        Rectangle rectangle=new Rectangle(10,20,computer2);
        System.out.println(rectangle);

        System.out.println();

        Computer computer3=computerFactory.getComputer("ComputerC");
        Square square=new Square(10,computer3);
        System.out.println(square);

        System.out.println();

        Computer computer4=computerFactory.getComputer("ComputerA");
        Triangle triangle=new Triangle(5,20,computer4);
        System.out.println(triangle);







    }
}

import java.util.Scanner;

public class TestCircle {
        public static void main(String[] args) {
            Circle circle1 = new Circle();
            System.out.println("---Hình tròn 1---");
            System.out.println(circle1.getArea());
            System.out.println(circle1.getColor());
            Scanner scanner=new Scanner(System.in);
            System.out.print("Nhập bán kính hình tròn 2: ");
            int radius2=scanner.nextInt();
            Circle circle2=new Circle(radius2);
            circle2.setColor("blue");
            System.out.println("---Hình tròn 2---");
            System.out.println(circle2.getArea());
            System.out.println(circle2.getColor());
        }
    }

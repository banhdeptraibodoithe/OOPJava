import java.util.Scanner;

public class Rectangle {
    double width;
    double height;
    Rectangle() {}
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return (width + height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai hcn: ");
        double width = scanner.nextDouble();
        System.out.print("Nhap chieu rong hcn: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hcn cua ban \n" + rectangle.display());
        System.out.println("Dien tich hcn la: " + rectangle.getArea());
        System.out.println("Chu vi hcn la: " + rectangle.getPerimeter());
    }
}

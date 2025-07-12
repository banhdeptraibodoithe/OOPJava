import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double c, double a, double b) {
        this.setC(c);
        this.setA(a);
        this.setB(b);
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant() {
        return Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
    }
    public double getRoot1() {
        double discriminant = this.getDiscriminant();
        return (-this.getB() + Math.sqrt(discriminant)) / 2 * this.getA();
    }
    public double getRoot2() {
        double discriminant = this.getDiscriminant();
        return (-this.getB() - Math.sqrt(discriminant)) / 2 * this.getA();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(c, a, b);
        if (quadraticEquation.getDiscriminant() > 0) System.out.println("Phuong trinh co hai nghiem lan luot la: " + quadraticEquation.getRoot1() + " Va " + quadraticEquation.getRoot2());
        else if (quadraticEquation.getDiscriminant() == 0) System.out.println("Phuong trinh co mot nghiem duy nhat la: " + quadraticEquation.getRoot1());
        else System.out.println("Phuong trinh vo nghiem");
    }
}

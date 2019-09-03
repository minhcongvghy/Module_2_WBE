import java.util.Scanner;

public class bai408090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a:");
        double a = scanner.nextDouble();
        System.out.print("Enter the b:");
        double b = scanner.nextDouble();
        System.out.print("Enter the c:");
        double c = scanner.nextDouble();
        Account account = new Account(a, b, c);
        double delta = account.getDiscriminant();
        if (delta < 0) {
            System.out.println("The equation has no roots");
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root " + root);
        } else {
            double root1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        }
    }
}

class Account {
    private double a, b, c;

    public Account() {

    }

    public Account(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }
}

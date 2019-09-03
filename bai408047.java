import java.util.Scanner;

public class bai408047 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền usd ");
        usd = scanner.nextDouble();
        double result = usd * vnd;
        System.out.println(usd + " usd = " + result + " vnd");
    }
}

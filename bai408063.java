import java.util.Scanner;

public class bai408063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng:");
        int rowNumber = scanner.nextInt();
        System.out.println("Nhập số cột:");
        int columnNumber = scanner.nextInt();
        int[][] array = new int[rowNumber][columnNumber];
        for (int row = 0; row < rowNumber; row++) {
            for (int column = 0; column < columnNumber; column++) {
                System.out.print("array[" + row + "][" + column + "]= ");
                array[row][column] = scanner.nextInt();
            }
        }
        int max = array[0][0];
        int row1 = 0;
        int column1 = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] > max) {
                    max = array[row][column];
                    row1 = row;
                    column1 = column;
                }
            }
        }
        System.out.printf("Phần tử lớn nhất là %d tại vị trí array[%d][%d] ", max, row1, column1);
    }
}

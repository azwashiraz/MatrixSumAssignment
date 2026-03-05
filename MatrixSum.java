import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int r = input.nextInt();
        int c = input.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
        }

        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) {
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
        }

        if (r == c) {
            int d1 = 0;
            int d2 = 0;

            for (int i = 0; i < r; i++) {
                d1 = d1 + arr[i][i];
                d2 = d2 + arr[i][c - 1 - i];
            }

            System.out.println(d1);
            System.out.println(d2);
        }

        input.close();
    }
}
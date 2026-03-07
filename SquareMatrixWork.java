import java.util.Scanner;

public class SquareMatrixWork {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[][] = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            int rsum = 0;
            for(int j = 0; j < n; j++) {
                rsum = rsum + a[i][j];
            }
            System.out.println(rsum);
        }

        for(int j = 0; j < n; j++) {
            int csum = 0;
            for(int i = 0; i < n; i++) {
                csum = csum + a[i][j];
            }
            System.out.println(csum);
        }

        int dsum = 0;
        int rdsum = 0;

        for(int i = 0; i < n; i++) {
            dsum = dsum + a[i][i];
            rdsum = rdsum + a[i][n - 1 - i];
        }

        System.out.println(dsum);
        System.out.println(rdsum);

        sc.close();
    }
}
import java.util.Scanner;
import java.io.File;

public class ProductTotal {

    public static void main(String[] args) {

        File file = new File("c:\\temp\\SalesEVESession.txt");

        String[] names = {"Product A", "Product B", "Product C", "Product D"};
        double[] sum = new double[names.length];

        try {
            Scanner sc = new Scanner(file);

            if (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);

                String[] data = line.split("\t");

                String p = data[1];
                double price = Double.parseDouble(data[2]);
                double qty = Double.parseDouble(data[3]);

                double total = price * qty;

                for (int i = 0; i < names.length; i++) {
                    if (names[i].equals(p)) {
                        sum[i] += total;
                        break;
                    }
                }
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("File error");
        }

        System.out.println("\nProduct-wise Total");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " : " + sum[i]);
        }
    }
              }

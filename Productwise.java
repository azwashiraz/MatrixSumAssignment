import java.io.File;
import java.util.Scanner;

class ProductWiseSum {
    public static void main(String[] args) {
        try {
            File f = new File("c:\\temp\\SalesEVESession.txt");
            Scanner sc = new Scanner(f);

            String[] product = new String[100];
            double[] total = new double[100];
            int count = 0;

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] p = line.split("\t");

                if (p.length < 4) continue;

                String name = p[1];
                double price = Double.parseDouble(p[2]);
                double qty = Double.parseDouble(p[3]);

                double amount = price * qty;

                int i;
                for (i = 0; i < count; i++) {
                    if (product[i].equals(name)) {
                        total[i] = total[i] + amount;
                        break;
                    }
                }

                if (i == count) {
                    product[count] = name;
                    total[count] = amount;
                    count++;
                }
            }

            for (int i = 0; i < count; i++) {
                System.out.println(product[i] + " " + total[i]);
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
	}
}

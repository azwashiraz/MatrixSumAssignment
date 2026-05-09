import java.util.Scanner;
import java.io.File;
import java.util.HashMap;

public class ProductWiseSumHM {

    public static void main(String[] args) {

        File file = new File("c:\\temp\\SalesEVESession.txt");
        Scanner inp;
        HashMap<String, Double> map = new HashMap<>();

        try {
            inp = new Scanner(file);

            if (inp.hasNextLine()) {
                System.out.println(inp.nextLine());
            }

            while (inp.hasNextLine()) {

                String line = inp.nextLine();
                System.out.println(line);

                String[] data = line.split("\t");

                String name = data[1];
                double price = Double.parseDouble(data[2]);
                double qty = Double.parseDouble(data[3]);

                double amount = price * qty;

                if (map.containsKey(name)) {
                    amount = amount + map.get(name);
                }

                map.put(name, amount);
            }

            inp.close();

        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println("\nProduct Wise Total");

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}

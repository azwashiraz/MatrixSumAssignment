import java.util.Scanner;
import java.io.File;

public class IDWiseSumNoHM {

    public static void main(String[] args) {

        File file = new File("c:\\temp\\SalesEVESession.txt");
        Scanner inp;

        String[] repIDs = {"E011", "E012", "E013", "E014"};
        double[] total = new double[repIDs.length];

        try {
            inp = new Scanner(file);

            if (inp.hasNextLine()) {
                System.out.println(inp.nextLine());
            }

            while (inp.hasNextLine()) {
                String line = inp.nextLine();
                System.out.println(line);

                String[] data = line.split("\t");

                double price = Double.parseDouble(data[2]);
                double qty = Double.parseDouble(data[3]);
                String id = data[5];

                double amount = price * qty;

                for (int i = 0; i < repIDs.length; i++) {
                    if (repIDs[i].equals(id)) {
                        total[i] += amount;
                        break;
                    }
                }
            }

            inp.close();

        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println("\nRep ID Wise Total");

        for (int i = 0; i < repIDs.length; i++) {
            System.out.println(repIDs[i] + " : " + total[i]);
        }
    }
}

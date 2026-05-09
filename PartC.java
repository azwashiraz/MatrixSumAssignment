public class BinaryString {

    public static String toBinary(int n) {

        String bin = "";

        while (n > 0) {
            bin = (n % 2) + bin;
            n = n / 2;
        }

        return bin;
    }
}

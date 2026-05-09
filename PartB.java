public class BinaryArray {

    public static int[] toBinary(int n) {

        int[] bin = new int[32];
        int i = 0;

        while (n > 0) {
            bin[i] = n % 2;
            n = n / 2;
            i++;
        }

        int[] result = new int[i];

        for (int j = 0; j < i; j++) {
            result[j] = bin[i - j - 1];
        }

        return result;
    }
}

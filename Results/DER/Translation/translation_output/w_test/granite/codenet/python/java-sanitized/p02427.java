import java.util.BitSet;

public class p02427 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < (1 << n); i++) {
            BitSet bitSet = BitSet.valueOf(new long[]{i});
            System.out.print(i + ":");
            for (int j = 0; j < n; j++) {
                if (bitSet.get(j)) {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }
    }
}
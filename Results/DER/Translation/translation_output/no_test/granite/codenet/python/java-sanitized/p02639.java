import java.util.Arrays;

public class p02639 {
    public static void main(String[] args) {
        String[] input = args[0].split(" ");
        int[] xList = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            xList[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < xList.length; i++) {
            if (xList[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}
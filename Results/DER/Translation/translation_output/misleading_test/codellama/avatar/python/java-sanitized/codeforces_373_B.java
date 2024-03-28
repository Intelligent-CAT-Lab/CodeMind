import java.util.Scanner;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int w = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);

        int maxLength = 0;
        int availableDigits = w / k;
        while (availableDigits > 0) {
            int currentCostPerN = (int) Math.log10(m) + 1;
            int sameCostUntil = (int) Math.pow(10, currentCostPerN);
            int usableNumbers = sameCostUntil - m;
            int useDigits = usableNumbers * currentCostPerN;
            m = sameCostUntil;
            if (availableDigits >= useDigits) {
                maxLength += usableNumbers;
                availableDigits -= useDigits;
            } else {
                maxLength += availableDigits / currentCostPerN;
                availableDigits = 0;
            }
        }
        System.out.println(maxLength);
    }
}
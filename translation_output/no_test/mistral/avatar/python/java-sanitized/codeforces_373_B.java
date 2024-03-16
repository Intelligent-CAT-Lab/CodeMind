import java.util.Scanner;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = scanner.nextLine().split(" ");
        int w, m, k;
        w = Integer.parseInt(lines[0]);
        m = Integer.parseInt(lines[1]);
        k = Integer.parseInt(lines[2]);
        int maxLength = 0;
        int availableDigits = w / k;
        while (availableDigits > 0) {
            int currentCostPerN = (int) Math.pow(10, (m + 1) / k);
            int sameCostUntil = currentCostPerN;
            int usableNumbers = sameCostUntil - m;
            int useDigits = usableNumbers * currentCostPerN;
            m = sameCostUntil;
            if (availableDigits >= useDigits) {
                maxLength += usableNumbers;
                availableDigits -= useDigits;
            } else {
                maxLength += (availableDigits / currentCostPerN);
                availableDigits = 0;
            }
        }
        System.out.println(maxLength);
    }
}
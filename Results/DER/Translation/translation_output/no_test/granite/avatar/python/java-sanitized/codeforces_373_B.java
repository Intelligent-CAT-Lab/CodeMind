import java.util.*;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        int w = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);
        int k = Integer.parseInt(lines[2]);
        int maxLength = 0;
        int availableDigits = w / k;
        while (availableDigits > 0) {
            int currentCostPerN = String.valueOf(m).length();
            int sameCostUntil = (int) Math.pow(10, currentCostPerN);
            int usableNumbers = sameCostUntil - m;
            int useDigits = usableNumbers * currentCostPerN;
            m = sameCostUntil;
            if (availableDigits >= useDigits) {
                maxLength += usableNumbers;
                availableDigits -= useDigits;
            } else {
                maxLength += (int) (availableDigits / currentCostPerN);
                availableDigits = 0;
            }
        }
        System.out.println(maxLength);
    }
}
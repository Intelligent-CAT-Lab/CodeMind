import java.util.*;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        long w = Long.parseLong(input[0]);
        long m = Long.parseLong(input[1]);
        long k = Long.parseLong(input[2]);
        long maxLength = 0;
        long availableDigits = w / k;
        while (availableDigits > 0) {
            int currentCostPerN = String.valueOf(m).length();
            long sameCostUntil = (long) Math.pow(10, currentCostPerN);
            long usableNumbers = sameCostUntil - m;
            long useDigits = usableNumbers * currentCostPerN;
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
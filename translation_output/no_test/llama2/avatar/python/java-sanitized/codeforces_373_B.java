import java.util.Scanner;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, m, k;
        w = Integer.parseInt(sc.nextLine());
        m = Integer.parseInt(sc.nextLine());
        k = Integer.parseInt(sc.nextLine());
        int maxLength = 0;
        int availableDigits = w / k;
        while (availableDigits > 0) {
            int currentCostPerN = m.length();
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
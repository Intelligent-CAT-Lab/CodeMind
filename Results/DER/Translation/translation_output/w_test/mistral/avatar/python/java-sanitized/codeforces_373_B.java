import java.util.Scanner;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int w = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int k = Integer.parseInt(split[2]);
        int maxLength = 0;
        int availableDigits = w / k;
        while (availableDigits > 0) {
            int currentCostPerN = (int) Math.pow(10, (double) (m / k));
            int usableNumbers = currentCostPerN - m;
            int useDigits = usableNumbers * currentCostPerN;
            m = currentCostPerN;
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
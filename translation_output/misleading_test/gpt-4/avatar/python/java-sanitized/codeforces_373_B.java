import java.util.Scanner;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input line and split the values to get w, m, and k
        long w = scanner.nextLong();
        long m = scanner.nextLong();
        long k = scanner.nextLong();
        scanner.close();
        
        long maxLength = 0;
        long availableDigits = w / k;
        
        while (availableDigits > 0) {
            long currentCostPerN = String.valueOf(m).length();
            long sameCostUntil = (long) Math.pow(10, currentCostPerN);
            long usableNumbers = sameCostUntil - m;
            long useDigits = usableNumbers * currentCostPerN;
            
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
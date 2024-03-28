import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input as a string
        String ip = scanner.next();
        StringBuilder st = new StringBuilder();
        
        // Condition checking for the length of the input string
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st.append("9");
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                int digit = Character.getNumericValue(ip.charAt(i));
                if (digit > 4) {
                    int n = 9 - digit;
                    st.append(n);
                } else {
                    st.append(digit);
                }
            }
        } else {
            st.append(ip);
        }
        
        // Parse the resulting string to an integer and print
        System.out.println(Integer.parseInt(st.toString()));
        
        scanner.close();
    }
}
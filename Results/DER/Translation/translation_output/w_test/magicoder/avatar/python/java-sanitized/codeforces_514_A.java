import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        StringBuilder st = new StringBuilder();

        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st.append('9');
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                if (Integer.parseInt(String.valueOf(ip.charAt(i))) > 4) {
                    int n = 9 - Integer.parseInt(String.valueOf(ip.charAt(i)));
                    st.append(n);
                } else {
                    st.append(ip.charAt(i));
                }
            }
        } else {
            st.append(ip);
        }
        System.out.println(Integer.parseInt(st.toString()));
    }
}
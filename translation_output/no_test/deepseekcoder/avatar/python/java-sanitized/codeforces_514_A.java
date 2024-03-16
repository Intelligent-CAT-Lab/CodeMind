import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.next();
        StringBuilder st = new StringBuilder();

        if(ip.length() != 1) {
            if(ip.charAt(0) == '9') {
                st.append('9');
                ip = ip.substring(1);
            }
            for(int i = 0; i < ip.length(); i++) {
                char c = ip.charAt(i);
                if(c - '0' > 4) {
                    int n = 9 - (c - '0');
                    st.append(n);
                } else {
                    st.append(c);
                }
            }
        } else {
            st.append(ip);
        }

        System.out.println(Integer.parseInt(st.toString()));
    }
}
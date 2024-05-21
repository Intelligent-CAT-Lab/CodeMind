import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p02582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int mod = 100000007;
        if (s.equals("RRR")) {
            System.out.println(3);
        } else if (s.equals("RRS") || s.equals("SRR")) {
            System.out.println(2);
        } else if (s.replaceAll("R", "").length() == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
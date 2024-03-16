import java.util.*;
import java.io.*;
public class p02534 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(br.readLine());
        String s = "";
        for (int i = 0; i < k; i++) {
            s += "ACL";
        }
        System.out.println(s);
    }
}
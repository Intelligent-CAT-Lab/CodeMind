import java.util.*;
import java.io.*;

public class p02534 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append("ACL");
        }
        System.out.println(sb.toString());
    }
}
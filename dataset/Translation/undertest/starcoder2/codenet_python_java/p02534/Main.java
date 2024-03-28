import java.util.*;
import java.io.*;
public class p02534 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        String s = "";
        for(int i=0;i<k;i++){
            s+="ACL";
        }
        System.out.println(s);
    }
}

/content/posts/2020-09-20-python-to-java-
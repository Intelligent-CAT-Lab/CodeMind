import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(input.readLine());
System.out.println("[INST]8;None;input.readLine();"+input.readLine());
        int a = Integer.parseInt(tokenizer.nextToken()) + Integer.parseInt(tokenizer.nextToken());
System.out.println("[INST]9;None;Integer.parseInt(tokenizer.nextToken());"+Integer.parseInt(tokenizer.nextToken()));
System.out.println("[INST]9;None;tokenizer.nextToken();"+tokenizer.nextToken());
System.out.println("[INST]9;None;Integer.parseInt(tokenizer.nextToken());"+Integer.parseInt(tokenizer.nextToken()));
System.out.println("[INST]9;None;tokenizer.nextToken();"+tokenizer.nextToken());
        System.out.println(a%24);
    }
}

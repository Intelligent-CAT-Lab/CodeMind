import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
System.out.println("[INST]6;n;Integer.parseInt(br.readLine());"+n);
System.out.println("[INST]6;None;br.readLine();"+br.readLine());
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < n; i++) {
		    for (int j = i + 1; j <= n; j++) {
		        if (n % 2 == 0) {
		            if (i + j == n + 1) {
		                continue;
		            }
		        } else {
		            if (i + j == n) {
		                continue;
		            }
		        }
		        sb.append(i).append(" ").append(j).append("\n");
System.out.println("[INST]20;None;sb.append(i).append(' ').append(j).append('\n');"+sb.append(i).append(" ").append(j).append("\n"));
System.out.println("[INST]20;None;sb.append(i).append(' ').append(j);"+sb.append(i).append(" ").append(j));
System.out.println("[INST]20;None;sb.append(i).append(' ');"+sb.append(i).append(" "));
System.out.println("[INST]20;None;sb.append(i);"+sb.append(i));
		        count++;
		    }
		}
		System.out.println(count);
		System.out.print(sb);
    }
}


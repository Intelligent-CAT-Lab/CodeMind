import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
var newVariable_0 = br.readLine();		int n = Integer.parseInt(newVariable_0);
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
var newVariable_1 = sb.append(i).append(" ").append(j).append("\n");var newVariable_2 = sb.append(i).append(" ").append(j);var newVariable_3 = sb.append(i).append(" ");var newVariable_4 = sb.append(i);		        newVariable_4.append(" ").append(j).append("\n");
		        count++;
		    }
		}
		System.out.println(count);
		System.out.print(sb);
    }
}


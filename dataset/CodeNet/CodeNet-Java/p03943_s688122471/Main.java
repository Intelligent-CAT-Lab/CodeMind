import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String[] spl = br.readLine().split(" ");
			int[] num = new int[spl.length];
			for(int i = 0;i <spl.length;i++) {
				num[i] = Integer.parseInt(spl[i]);
			}
			Arrays.sort(num);
			if(num[0] + num[1] == num[2]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
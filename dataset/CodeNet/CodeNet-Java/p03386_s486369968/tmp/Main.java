import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(stdin.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
System.out.println("[INST]7;input;Arrays.stream(stdin.readLine().split(' ')).mapToInt(Integer::parseInt).toArray();"+input);
System.out.println("[INST]7;None;Arrays.stream(stdin.readLine().split(' ')).mapToInt(Integer::parseInt);"+Arrays.stream(stdin.readLine().split(" ")).mapToInt(Integer::parseInt));
System.out.println("[INST]7;None;Arrays.stream(stdin.readLine().split(' '));"+Arrays.stream(stdin.readLine().split(" ")));
System.out.println("[INST]7;None;stdin.readLine().split(' ');"+stdin.readLine().split(" "));
System.out.println("[INST]7;None;stdin.readLine();"+stdin.readLine());
		IntStream.rangeClosed(input[0], input[1])
System.out.println("[INST]8;None;IntStream.rangeClosed(input[0], input[1])
		.filter(i ->{
			int order = i - input[0];
			if(order < input[2]|| input[1] - input[0] - input[2]< order) return true;
			else return false;
		})
		.forEach(System.out::println);"+IntStream.rangeClosed(input[0], input[1])
		.filter(i ->{
			int order = i - input[0];
			if(order < input[2]|| input[1] - input[0] - input[2]< order) return true;
			else return false;
		})
		.forEach(System.out::println));
System.out.println("[INST]8;None;IntStream.rangeClosed(input[0], input[1])
		.filter(i ->{
			int order = i - input[0];
			if(order < input[2]|| input[1] - input[0] - input[2]< order) return true;
			else return false;
		});"+IntStream.rangeClosed(input[0], input[1])
		.filter(i ->{
			int order = i - input[0];
			if(order < input[2]|| input[1] - input[0] - input[2]< order) return true;
			else return false;
		}));
System.out.println("[INST]8;None;IntStream.rangeClosed(input[0], input[1]);"+IntStream.rangeClosed(input[0], input[1]));
		.filter(i ->{
			int order = i - input[0];
			if(order < input[2]|| input[1] - input[0] - input[2]< order) return true;
			else return false;
		})
		.forEach(System.out::println);
	}
}
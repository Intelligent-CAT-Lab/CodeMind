import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(stdin.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		IntStream.rangeClosed(input[0], input[1])
		.filter(i ->{
			int order = i - input[0];
			if(order < input[2]|| input[1] - input[0] - input[2]< order) return true;
			else return false;
		})
		.forEach(System.out::println);
	}
}
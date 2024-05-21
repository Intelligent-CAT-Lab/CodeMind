import java.util.Arrays;

public class p02212 {
    public static void main(String[] args) {
        int[] l = Arrays.stream(System.console().readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .sorted()
                        .toArray();
        System.out.println(Math.abs((l[0] + l[3]) - (l[1] + l[2])));
    }
}
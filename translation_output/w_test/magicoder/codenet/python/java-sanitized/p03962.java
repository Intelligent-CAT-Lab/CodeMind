import java.util.*;

public class p03962 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (String s : input) {
            set.add(Integer.parseInt(s));
        }
        System.out.println(set.size());
    }
}



You can test this code with the following test input:


3 1 4


And the expected output will be:


3
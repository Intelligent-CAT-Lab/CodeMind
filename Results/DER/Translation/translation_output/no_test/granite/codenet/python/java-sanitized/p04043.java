import java.util.*;

public class p04043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);

        Collections.sort(numbers);

        if (numbers.get(0) == 5 && numbers.get(1) == 5 && numbers.get(2) == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
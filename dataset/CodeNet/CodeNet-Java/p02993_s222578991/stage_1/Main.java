import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Consumer<List<String>> consumer = solve();

    public static void main(String[] args) {
        consumer.accept(readInput());
    }

    private static List<String> readInput() {
        final List<String> lineList = new ArrayList<>();
var newVariable_0 = scanner.hasNextLine();        while (newVariable_0) {
var newVariable_1 = lineList.add(scanner.nextLine());var newVariable_2 = scanner.nextLine();            lineList.add(newVariable_2);
        }
        return lineList;
    }

    private static Consumer<List<String>> solve() {
        return args -> {
            boolean ans = false;
            for (int i = 0; i < 3; i++) {
var newVariable_3 = args.get(0).charAt(i);var newVariable_4 = args.get(0);var newVariable_5 = args.get(0).charAt(i + 1);var newVariable_6 = args.get(0);                ans |= newVariable_6.charAt(i) == newVariable_6.charAt(i + 1);
            }
            System.out.println(ans ? "Bad" : "Good");
        };
    }

}

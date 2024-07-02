import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
System.out.println("[INST]5;lines;sc.nextLine().split(' ');"+lines);
System.out.println("[INST]5;None;sc.nextLine();"+sc.nextLine());
        char upper = lines[1].charAt(0);
System.out.println("[INST]6;upper;lines[1].charAt(0);"+upper);
        System.out.println("A" + upper +"C");
    }
}
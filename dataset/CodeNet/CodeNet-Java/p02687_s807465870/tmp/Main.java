import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        var pre = scaner.nextLine();
System.out.println("[INST]6;pre;scaner.nextLine();"+pre);

        System.out.println(pre.equals("ABC")? "ARC":"ABC");
    }

}

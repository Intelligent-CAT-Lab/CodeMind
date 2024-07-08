import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.nextInt();var newVariable_1 = sc.nextInt();        int left = newVariable_1 + newVariable_1;
var newVariable_2 = sc.nextInt();var newVariable_3 = sc.nextInt();        int right = newVariable_3 + newVariable_3;
        if(left > right) {
            System.out.print("Left");
        } else if (left == right) {
            System.out.print("Balanced");
        } else {
            System.out.print("Right");
        }
    }
}

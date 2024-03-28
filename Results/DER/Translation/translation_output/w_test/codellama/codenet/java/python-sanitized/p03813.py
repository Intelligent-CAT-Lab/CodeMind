import java.util.Scanner;

public class p03813 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        if (input < 1200) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}




input_str = input("Enter a number: ")
input_int = int(input_str)
if input_int < 1200:
    print("ABC")
else:
    print("ARC")
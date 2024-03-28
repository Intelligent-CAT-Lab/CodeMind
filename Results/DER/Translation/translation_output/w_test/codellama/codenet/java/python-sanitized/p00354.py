import java.util.Scanner;

public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.nextInt()%7]);
    }
}




import sys

days = "thu:fri:sat:sun:mon:tue:wed"
days_list = days.split(":")

day_index = int(sys.stdin.readline()) % 7
print(days_list[day_index])


Next, it reads a line of input from the standard input stream using the `readline()` method, and converts it to an integer using the `int()` function. It then calculates the modulo of this integer with 7, which gives the index of the day of the week that we want to print.
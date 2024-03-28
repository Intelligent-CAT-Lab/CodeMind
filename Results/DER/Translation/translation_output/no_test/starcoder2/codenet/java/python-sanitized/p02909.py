str = input()
if str == "Sunny":
    print("Cloudy")
elif str == "Cloudy":
    print("Rainy")
elif str == "Rainy":
    print("Sunny")
else:
    print("Error")

/p02908.md
# p02908

Translate the following java code to python and enclose your solution inside :

import java.util.*;
public class p02908 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int a1 = a*100+b*10+c;
        int a2 = d*100+e*10+f;
        if(a1>a2){
            System.out.println(a1);
        }
        else{
            System.out.println(a2);
        }
    }
}
import java.util.*;

public class p02111 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minute = 12 * 60 * n / 360;
        System.out.println((minute / 60) + " " + (minute % 60));
    }
}



import java.util.Scanner;

def main():
    sc = Scanner(System.in)
    n = sc.nextInt()
    minute = 12 * 60 * n / 360
    print((minute / 60) + " " + (minute % 60))

if __name__ == "__main__":
    main()
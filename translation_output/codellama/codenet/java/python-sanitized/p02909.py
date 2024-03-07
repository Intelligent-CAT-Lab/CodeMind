import java.util.*;

public class p02909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (str.equals("Sunny")) {
            System.out.println("Cloudy");
        }
        if (str.equals("Cloudy")) {
            System.out.println("Rainy");
        }
        if (str.equals("Rainy")) {
            System.out.println("Sunny");
        }
    }
}



import java.util.Scanner

def main():
    sc = Scanner(System.in)
    str = sc.next()

    if str.equals("Sunny"):
        print("Cloudy")
    elif str.equals("Cloudy"):
        print("Rainy")
    elif str.equals("Rainy"):
        print("Sunny")

if __name__ == "__main__":
    main()
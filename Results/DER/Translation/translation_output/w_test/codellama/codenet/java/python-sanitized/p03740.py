import java.util.Scanner;

public class p03740 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(Math.abs(sc.nextLong() - sc.nextLong()) <= 1 ? "Brown" : "Alice");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



import math

def main():
    try:
        sc = Scanner(System.in)
        print(math.abs(sc.nextLong() - sc.nextLong()) <= 1 ? "Brown" : "Alice")
    except Exception as e:
        e.printStackTrace()

if __name__ == "__main__":
    main()
import java.util.Scanner;

public class p03737 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                System.out.print(Character.toUpperCase(sc.next().charAt(0)));
            }
            System.out.println("");
        }
    }
}



import java.util.Scanner

class p03737:
    def main(self, args):
        try:
            sc = Scanner(System.in)
            for i in range(3):
                print(Character.toUpperCase(sc.next().charAt(0)))
            print("")
        except:
            pass
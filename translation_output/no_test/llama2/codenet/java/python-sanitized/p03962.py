import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class p03962:

    def main(self, args):
        scanner = Scanner(System.in)
        paintCans = set()
        paintCans.add(scanner.nextInt())
        paintCans.add(scanner.nextInt())
        paintCans.add(scanner.nextInt())

        print(len(paintCans))
import java.util.HashSet
import java.util.Scanner
import java.util.Set

def main():
    scan = Scanner(System.in)
    paintCans = HashSet()
    paintCans.add(scan.nextInt())
    paintCans.add(scan.nextInt())
    paintCans.add(scan.nextInt())

    System.out.println(paintCans.size())

if __name__ == '__main__':
    main()
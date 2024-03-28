import java.util.Scanner

public class atcoder_AGC046_A:
    def main(args):
        i = 0
        k = 360
        j = 1
        sc = Scanner(System.in)

        if not sc.hasNextInt():
            System.err.println("Invalid input")

        i = Integer.parseInt(sc.nextLine())

        if 1 <= i and i <= 179:
            while not ((i * j) % k == 0):
                j += 1
            System.out.println(j)
        else:
            System.out.println("Invalid input")
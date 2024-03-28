import java.util.Arrays;
import java.util.Scanner;

class p04005:
    def main(self):
        sc = Scanner(System.in)
        A = sc.nextLong()
        B = sc.nextLong()
        C = sc.nextLong()

        array = [A, B, C]
        Arrays.sort(array)

        if A % 2 == 0 or B % 2 == 0 or C % 2 == 0:
            print(0)
        else:
            print(array[0] * array[1])

p04005().main()
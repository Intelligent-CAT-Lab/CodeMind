import java.util.Scanner;

class p02811:

    def main(self):
        stdIn = Scanner(System.in)
        K = stdIn.nextInt()
        X = stdIn.nextInt()

        if X <= 500*K:
            print("Yes")
        else:
            print("No")

p02811().main()
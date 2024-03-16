import java.util.*;

class atcoder_AGC002_A:
    def main(self):
        sc = Scanner(System.in)
        a = sc.nextLong()
        b = sc.nextLong()

        if a <= 0 and b >= 0 or a <= 0 and b >= 0:
            print("Zero")
        elif a < 0 and b < 0:
            print(((b - a + 1) % 2 == 0)? "Positive" : "Negative")
        elif a > 0 and b > 0:
            print("Positive")

if __name__ == '__main__':
    atcoder_AGC002_A().main()
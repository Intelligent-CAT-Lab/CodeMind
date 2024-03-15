import java.util

class p02639:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        x = [0]*5
        sum = 0
        for i in range(5):
            x[i] = sc.nextInt()
            sum += x[i]
        print(15-sum)
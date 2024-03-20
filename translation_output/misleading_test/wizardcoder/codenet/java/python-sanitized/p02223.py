import java.util.Arrays
import java.util.Scanner

class p02223:
    sc = Scanner(System.in)

    def main(self):
        N = sc.nextInt()
        if N == 1:
            print(1)
            print("0")
        elif N == 2:
            print(2)
            print("0")
            print("11")
        else:
            print(N - 1)
            for i in range(2, N+1):
                s = ['0'] * i
                s[0] = s[i-1] = '1'
                print(''.join(s))

p02223().main()


Output:

2
0
11
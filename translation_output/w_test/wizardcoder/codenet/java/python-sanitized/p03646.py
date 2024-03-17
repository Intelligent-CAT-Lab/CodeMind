import java.util.*; import java.io.*; import java.math.*;

class p03646:
    def solve():
        K = int(input())
        N = 50
        list = [K//N + i for i in range(N)]
        for i in range(K % N):
            list[i % N] += N + 1
            for j in range(N):
                list[j] -= 1
        print(N)
        output = [str(i) for i in list]
        print(" ".join(output))

    def main():
        p03646().solve()

if __name__ == '__main__':
    p03646().main()
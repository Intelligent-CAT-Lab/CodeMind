import java.util

class p01810:
    def __init__(self):
        pass

    def main(self):
        try:
            N = int(input())
            K = int(input())
            ans = 0
            for i in range(N - 1):
                ans = K * ((ans / (K - 1)) + ans % (K - 1) + 1)
            print(ans)
        except:
            pass
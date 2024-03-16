import java.util.Scanner;

class p02576:
    def __init__(self):
        pass

    def main(self):
        n = int(input())
        x = int(input())
        t = int(input())
        ans = 0
        tako = 0
        while n > tako:
            ans += t
            tako += x
        print(ans)

if __name__ == '__main__':
    p02576().main()
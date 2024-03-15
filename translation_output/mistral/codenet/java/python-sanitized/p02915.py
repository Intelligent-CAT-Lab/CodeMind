import sys

class p02915:
    def __init__(self):
        self.run()

    def run(self):
        scanner = sys.stdin
        S = int(scanner.readline())
        ans = S * S * S

        print(ans)

if __name__ == "__main__":
    p02915().run()
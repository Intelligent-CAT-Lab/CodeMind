import sys

class p02687:
    MOD = 1000000007

    def main(self):
        s = sys.stdin.readline().strip()
        print("ARC" if s == "ABC" else "ABC")

if __name__ == "__main__":
    p02687().main()
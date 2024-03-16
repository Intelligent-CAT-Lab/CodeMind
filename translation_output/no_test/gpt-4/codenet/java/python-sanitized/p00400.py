import sys

# AIZU ONLINE JUDGE
# 0405
# 2020/5/6

class P00400:

    def __init__(self):
        self.log = None # In Python we typically won't use a dummy PrintStream equivalent.
        self.result = sys.stdout

    def main(self):
        # Python does not use a Scanner, simply read input directly
        N = input().strip()

        r = 0
        if 'A' <= N <= 'Z':
            r = 1
        elif 'a' <= N <= 'z':
            r = 2
        print("{}".format(r), file=self.result)

        return False


if __name__ == "__main__":
    instance = P00400()
    instance.main()
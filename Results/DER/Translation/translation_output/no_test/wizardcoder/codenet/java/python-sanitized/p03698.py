import sys

class p03698:
    def main(self):
        try:
            inputString = sys.stdin.readline().strip().split()
            removeDuplication = set(inputString)

            if len(inputString) == len(removeDuplication):
                ans = "yes"
            else:
                ans = "no"

            print(ans)
        except Exception as e:
            print(e)
            sys.exit(0)

if __name__ == '__main__':
    p03698().main()
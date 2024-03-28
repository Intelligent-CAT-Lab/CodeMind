import sys

class p03698:
    def main(self):
        try:
            inputString = sys.stdin.readline().strip().split()
            removeDuplication = set(inputString)

            if len(inputString) == len(removeDuplication):
                print("yes")
            else:
                print("no")

        except Exception as e:
            print(e)
            sys.exit(0)

if __name__ == '__main__':
    obj = p03698()
    obj.main()
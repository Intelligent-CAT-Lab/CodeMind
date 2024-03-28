import sys

class p02730:

    def __init__(self):
        self.s = sys.stdin.readline().strip()

    def run(self):

        arr = list(self.s)

        for i in range(len(self.s)//2):
            if arr[i] != arr[len(self.s)-1-i]:
                print("No")
                return

        for i in range(len(self.s)//2-1):
            if arr[i] != arr[(len(self.s)//2)-1-i]:
                print("No")
                return

        print("Yes")

if __name__ == "__main__":
    p02730().run()
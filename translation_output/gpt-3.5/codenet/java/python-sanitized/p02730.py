import sys

class p02730:
    def __init__(self):
        self.s = input()

    def run(self):
        for i in range(len(self.s) // 2):
            if self.s[i] != self.s[len(self.s) - 1 - i]:
                print("No")
                sys.exit()
        
        for i in range((len(self.s) // 2) - 1):
            if self.s[i] != self.s[(len(self.s) // 2) - 1 - i]:
                print("No")
                sys.exit()

        print("Yes")

if __name__ == "__main__":
    p = p02730()
    p.run()
import sys

class p01388:
    def run(self):
        s = input()
        c = [0]*4
        for i in s:
            if i == 'K':
                c[0] += 1
            elif i == 'U':
                c[1] += 1
            elif i == 'P':
                c[2] += 1
            elif i == 'C':
                c[3] += 1
        print(min(c))

if __name__ == "__main__":
    p01388().run()
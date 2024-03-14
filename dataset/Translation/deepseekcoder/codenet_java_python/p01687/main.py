import sys

class p01687:
    def __init__(self):
        self.mstr = "AADINNUY"
        self.nstr = "AIZUNYAN"

    def run(self):
        for line in sys.stdin:
            dstr = line.strip()
            if len(dstr) < 8:
                print(dstr)
                continue
            for i in range(len(dstr)-7):
                t = dstr[i:i+8]
                if self.mstr == "".join(sorted(t)):
                    dstr = dstr.replace(t, self.nstr)
                    i += 7
            print(dstr)

if __name__ == "__main__":
    p01687().run()
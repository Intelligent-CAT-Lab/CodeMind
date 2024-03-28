class p00435:
    def main(self):
        s = ""
        for c in java.util.Scanner(System.in).next().toCharArray():
            s += chr((ord(c) - 42) % 26 + 65)
        print(s)
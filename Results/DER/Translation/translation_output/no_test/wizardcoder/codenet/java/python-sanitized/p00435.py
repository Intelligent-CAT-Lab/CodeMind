class p00435:
    def main(self, z):
        s = ""
        for c in java.util.Scanner(System.in).next().toCharArray():
            s += chr((ord(c) - 42) % 26 + 65)
        print(s)
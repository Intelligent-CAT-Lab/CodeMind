class p00435:
    def main(self):
        s = ""
        for c in input().upper():
            s += chr((ord(c) - 65) % 26 + 65)
        print(s)

p00435().main()
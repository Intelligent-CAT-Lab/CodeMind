class p00435:
    def main(self, z):
        s = ""
        for c in new java.util.Scanner(System.in).next().toCharArray():
            s += (char)((c - 42) % 26 + 65)
        System.out.println(s)



s = ""
for c in input().toCharArray():
    s += chr((ord(c) - 42) % 26 + 65)
print(s)
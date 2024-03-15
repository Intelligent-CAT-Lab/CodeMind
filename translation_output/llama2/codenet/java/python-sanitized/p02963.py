import java.util

class p02963:
    def main(self, i):
        s = int(input())
        a = 1000000000
        print("0 0 " + a + " 1 " + (a - s % a) % a + " " + ((s - 1) // a + 1))
import java.util.Scanner;

class p03711:
    def grouped(self, grp, x, y):
        bx = False
        by = False
        for i in range(len(grp)):
            if grp[i] == x:
                bx = True
            if grp[i] == y:
                by = True
        return bx and by

    def main(self):
        sc = Scanner(System.in)
        x = sc.nextInt()
        y = sc.nextInt()
        grp1 = [1, 3, 5, 7, 8, 10, 12]
        grp2 = [4, 6, 9, 11]
        grp3 = [2]
        print(self.grouped(grp1, x, y) or self.grouped(grp2, x, y) ? "Yes" : "No")

if __name__ == "__main__":
    p03711().main()
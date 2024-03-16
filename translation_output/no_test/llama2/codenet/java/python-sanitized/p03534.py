import java.util

class p03534:
    def main(self, sc):
        str = sc.next()
        abc = [0]*3
        for i in range(len(str)):
            for j in range(3):
                if str[i] == "abc"[j]:
                    abc[j] += 1
        if (abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2):
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    sc = java.util.Scanner(System.in)
    p03534().main(sc)
    sc.close()
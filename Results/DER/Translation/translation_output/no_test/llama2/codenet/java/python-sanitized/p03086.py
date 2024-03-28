import java.util

class p03086:
    def nCombination3(self, c):
        count = c
        num = 0
        for i in range(0, count - 2):
            for j in range(i + 1, count - 1):
                for k in range(j + 1, count):
                    num += 1

    def main(self):
        sc = java.util.Scanner(System.in)
        S = sc.next().toCharArray()
        currentlength = 0
        length = 0
        for i in range(0, S.length):
            if S[i] == 'A' or S[i] == 'C' or S[i] == 'G' or S[i] == 'T':
                currentlength += 1
            else:
                if currentlength > length:
                    length = currentlength
                currentlength = 0
        print(max(length, currentlength))


if __name__ == '__main__':
    p03086().main()
import java.util.Arrays
import java.util.Scanner

class p00029:
    def main(self):
        sc = Scanner(System.in)
        s = [None] * 2002
        index = 0
        while sc.hasNext():
            s[index] = sc.next()
            index += 1

        r = [0] * index
        flag = [True] * 2002
        fre = 0
        for i in range(index):
            for j in range(i+1, index):
                if s[i] == s[j] and flag[j]:
                    r[i] += 1
                    flag[j] = False

        max = 0
        maxin = 0
        for i in range(index):
            if max < r[i]:
                max = r[i]
                maxin = i

        print(s[maxin], end=' ')

        max = 0
        for i in range(index):
            if s[max].length() < s[i].length():
                max = i

        print(s[max])

p00029().main()
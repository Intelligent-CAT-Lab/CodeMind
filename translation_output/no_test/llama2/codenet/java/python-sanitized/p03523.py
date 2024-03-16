import java.util.Scanner

class p03523:

    def main(self):
        scanner = Scanner(System.in)
        akihabara = "AKIHABARA"
        kihbr = "KIHBR"
        s = scanner.nextLine()

        i = 0
        j = 0
        k = 0
        for i in range(len(s)):
            if j + 1 < len(akihabara) and akihabara[j] == 'A' and akihabara[j] != s[i]:
                j += 1
            if j >= len(akihabara) or akihabara[j] != s[i]:
                print("NO")
                return
            if s[i] != 'A':
                if s[i] == kihbr[k]:
                    k += 1
                else:
                    print("NO")
                    return
            j += 1
        if k == len(kihbr):
            print("YES")
        else:
            print("NO")
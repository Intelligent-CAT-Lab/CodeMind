import java.util

class p03224:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        N = sc.nextInt()
        l = 1
        for l in range(1, N):
            N -= l
        if N != l:
            print("No")
            return
        print("Yes")
        print(l + 1)
        answer = [[] for _ in range(l + 1)]
        Index = 1
        for i in range(l + 1):
            string = ""
            string += str(l)
            j = 0
            for _ in range(i):
                string += " "
                string += str(answer[j][i - 1])
            for _ in range(l - i):
                string += " "
                string += str(answer[i][j] = Index)
            print(string)
class main:
    import sys
    
    def main():
        N = int(sys.stdin.readline())
        l = 1
        while l < N:
            N -= l
            l += 1
        if N != l:
            print("No")
            sys.stdout.flush()
            return
        print("Yes")
        print(l + 1)
        answer = [[0] * l for _ in range(l + 1)]
        Index = 1
        for i in range(l + 1):
            string = str(l)
            for j in range(i):
                string += " " + str(answer[j][i - 1])
            for j in range(i, l):
                string += " " + str(answer[i][j] = Index)
                Index += 1
            print(string)
        sys.stdout.flush()
    
    if __name__ == "__main__":
        main()
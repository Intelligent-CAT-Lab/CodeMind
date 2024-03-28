class main:
    import sys
    
    def main():
        N = int(sys.stdin.readline())
        l = 1
        while l < N:
            N -= l
            l += 1
        if N!= l:
            print("No")
            return
        print("Yes")
        print(l+1)
        answer = [[0 for i in range(l)] for j in range(l)]
        Index = 1
        for i in range(l):
            string = str(l)
            for j in range(i):
                string += " " + str(answer[j][i-1])
            for j in range(i, l):
                string += " " + str(answer[i][j] = Index)
                Index += 1
            print(string)
    
    if __name__ == "__main__":
        main()
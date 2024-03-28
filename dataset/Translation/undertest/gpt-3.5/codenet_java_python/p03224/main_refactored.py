class main:
    def main():
        N = int(input())
        l = 1
        while l < N:
            N -= l
            l += 1
        if N != l:
            print("No")
            return
        print("Yes")
        print(l + 1)
        answer = [[0 for _ in range(l)] for _ in range(l + 1)]
        Index = 1
        for i in range(l + 1):
            string = str(l)
            j = 0
            while j < i:
                string += " " + str(answer[j][i-1])
                j += 1
            while j < l:
                string += " " + str(Index)
                answer[i][j] = Index
                Index += 1
                j += 1
            print(string)
        return
    
    if __name__ == "__main__":
        main()
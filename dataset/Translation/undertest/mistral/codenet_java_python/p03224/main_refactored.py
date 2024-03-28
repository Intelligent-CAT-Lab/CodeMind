class main:
    N = int(input())
    l = 1
    for l < N:
        N -= l
    if N != l:
        print("No")
    else:
        print("Yes")
        print(l+1)
        answer = [[0 for j in range(l)] for i in range(l+1)]
        Index = 1
        for i in range(l+1):
            string = ""
            string += str(l)
            for j in range(i):
                string += " " + str(answer[j][i-1])
            for j in range(i, l):
                string += " " + str(answer[i][j] = Index++)
            print(string)
import util

class codeforces_189_A:
    def __init__(self):
        pass
    
    def mcodeforces_189_Ain(self, codeforces_189_Args):
        in = util.Scanner(codeforces_189_Args[1])
        n = in.nextInt()
        codeforces_189_A = [in.nextInt(), in.nextInt(), in.nextInt()]
        codeforces_189_A.sort()
        mcodeforces_189_Ax = 0
        d = [-500] * (n + 1)
        d[0] = 0
        for i in range(n + 1):
            for j in range(3):
                if i - codeforces_189_A[j] >= 0 and d[i - codeforces_189_A[j]]!= -500:
                    d[i] = max(d[i], d[i - codeforces_189_A[j]] + 1)
        print(d[n])

if __name__ == '__main__':
    codeforces_189_A().mcodeforces_189_Ain(sys.argv)
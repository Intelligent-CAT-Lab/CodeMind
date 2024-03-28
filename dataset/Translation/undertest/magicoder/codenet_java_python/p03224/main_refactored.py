class main:
    import sys
    
    def main():
        N = int(sys.stdin.readline())
        l = 1
        while N > l:
            N -= l
            l += 1
        if N != l:
            print("No")
            return
        print("Yes")
        print(l)
        answer = [[0]*l for _ in range(l+1)]
        index = 1
        for i in range(l+1):
            line = [l]
            for j in range(i):
                line.append(answer[j][i-1])
            for j in range(i, l):
                line.append(index)
                index += 1
            print(' '.join(map(str, line)))
    
    if __name__ == "__main__":
        main()
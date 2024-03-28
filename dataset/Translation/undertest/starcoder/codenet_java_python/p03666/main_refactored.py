class main:
    import sys
    
    def solve():
        N = int(sys.stdin.readline())
        A = int(sys.stdin.readline())
        B = int(sys.stdin.readline())
        C = int(sys.stdin.readline())
        D = int(sys.stdin.readline())
    
        for i in range(N):
            max = D*(N-1-i)-C*i
            min = C*(N-1-i)-D*i
            if abs(B-A)>=min and abs(B-A)<=max:
                print("YES")
                return
        print("NO")
    
    if __name__ == "__main__":
        solve()
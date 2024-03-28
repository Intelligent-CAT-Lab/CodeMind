class main:
    def solve():
        input_str = input()
        A, B = map(int, input_str.split())
    
        if 9 < A or 9 < B:
            print(-1)
            return
    
        print(A * B)
    
    if __name__ == "__main__":
        solve()
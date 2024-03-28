class main:
    def search(a, b):
        if a % 1000000 == 0:
            o = 3
        elif a % 10000 == 0:
            o = 2
        elif a % 100 == 0:
            o = 1
        else:
            o = 0
        
        return b == o
    
    def main():
        D, N = map(int, input().split())
        A = 10000 if D == 2 else 100 if D == 1 else 1
        ser = 0
        count = 0
        
        while ser < N:
            count += 1
            if search(count * A, D):
                ser += 1
        
        print(count * A)
    
    if __name__ == "__main__":
        main()
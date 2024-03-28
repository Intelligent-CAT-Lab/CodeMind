class main:
    def main():
        T, R, Y = map(int, input().split())
        
        A = max(T, R, Y)
        B = min(T, R, Y)
        
        print(A - B)
    
    if __name__ == "__main__":
        main()
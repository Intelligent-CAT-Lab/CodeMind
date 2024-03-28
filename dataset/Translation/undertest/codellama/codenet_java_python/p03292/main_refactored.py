class main:
    import math
    
    def main():
        T, R, Y = map(int, input().split())
        A = max(max(T, R), Y)
        B = min(min(T, R), Y)
        print(A - B)
    
    if __name__ == "__main__":
        main()
class main:
    import sys
    
    def main():
        w = int(input())
        a, b = map(int, input().split())
        if a <= b and b <= a + w:
            print(0)
        elif a <= b + w and b + w <= a + w:
            print(0)
        else:
            print(max(a - b - w, b - a - w))
    
    if __name__ == "__main__":
        main()
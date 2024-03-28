class main:
    import math
    
    def main():
        a, b, c = map(int, input().split())
        min = min(a, b)
        max = max(a, b)
        print(min(min, c), max(max, c))
    
    if __name__ == '__main__':
        main()
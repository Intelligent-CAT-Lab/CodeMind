class main:
    import sys
    
    def main():
        a, b = map(float, input().split())
        c = round(b * 100)
        d = a * c
        print(int(d / 100))
    
    if __name__ == "__main__":
        main()
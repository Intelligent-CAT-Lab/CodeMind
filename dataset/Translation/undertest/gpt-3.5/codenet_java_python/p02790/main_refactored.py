class main:
    def main():
        a, b = map(int, input().split())
    
        if a >= b:
            print(str(b) * a)
        else:
            print(str(a) * b)
    
    if __name__ == "__main__":
        main()
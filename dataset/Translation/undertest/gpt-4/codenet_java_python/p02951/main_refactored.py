class main:
    def main():
        a, b, c = map(int, input().split())
        if b + c < a:
            print(0)
        else:
            print(b + c - a)
    
    if __name__ == "__main__":
        main()
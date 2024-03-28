class main:
    def main():
        a, b = map(int, input().split())
        if a+b == 15:
            print("+")
        elif a*b == 15:
            print("*")
        else:
            print("x")
    
    if __name__ == "__main__":
        main()
class main:
    import math
    
    def main():
        x = int(input("Enter the first number: "))
        y = int(input("Enter the second number: "))
        if x % y == 0:
            print(-1)
        else:
            print(x)
    
    if __name__ == "__main__":
        main()
class main:
    def main():
        a, b = [int(x) for x in input().split()]
        if a <= 8 and b <= 8:
            print("Yay!")
        else:
            print(":(")
    
    if __name__ == "__main__":
        main()
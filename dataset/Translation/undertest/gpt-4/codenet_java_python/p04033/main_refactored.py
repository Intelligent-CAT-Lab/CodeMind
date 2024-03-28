class main:
    def main():
        a, b = map(int, input().split())
        if a <= 0 <= b:
            print("Zero")
        else:
            print("Positive" if (min(0, b) - min(-1, a)) % 2 == 1 else "Negative")
    
    
    if __name__ == "__main__":
        main()
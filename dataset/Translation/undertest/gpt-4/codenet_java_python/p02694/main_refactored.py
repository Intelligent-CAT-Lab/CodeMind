class main:
    def main():
        x = int(input())  # Reading input in Python
        count = 0
    
        a = 100
        while a < x:      # Checking condition similar to the Java code
            a += a // 100
            count += 1
    
        print(count)
    
    if __name__ == "__main__":
        main()
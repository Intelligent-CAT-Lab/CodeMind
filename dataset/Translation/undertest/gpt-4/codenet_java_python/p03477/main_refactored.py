class main:
    def main():
        numbers = input().split()
        left = int(numbers[0]) + int(numbers[1])
        right = int(numbers[2]) + int(numbers[3])
        
        if left > right:
            print("Left")
        elif left == right:
            print("Balanced")
        else:
            print("Right")
    
    if __name__ == "__main__":
        main()
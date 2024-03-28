class main:
    def main():
        left, right = map(int, input().split())
        left += sum(map(int, input().split()))
        right += sum(map(int, input().split()))
        if left > right:
            print("Left")
        elif left == right:
            print("Balanced")
        else:
            print("Right")
    
    if __name__ == "__main__":
        main()
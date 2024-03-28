# Translate Java code to Python
import math

def main():
    a, b = map(int, input().split())
    result = math.floor(a / b)
    print(result)

# Run the main function
if __name__ == "__main__":
    main()
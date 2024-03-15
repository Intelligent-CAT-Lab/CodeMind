# We don't need to import anything for basic input/output

def main():
    r = int(input()) * 100
    g = int(input()) * 10
    b = int(input())
    
    sum = r + g + b
    print("YES" if sum % 4 == 0 else "NO")

# Call the main function
if __name__ == "__main__":
    main()
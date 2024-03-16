# No import needed for basic input-output

def main():
    age = int(input())  # Reading integer input
    
    if age in (3, 5, 7):  # Python 'in' keyword checks if value is in the tuple
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
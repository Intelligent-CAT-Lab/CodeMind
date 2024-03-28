# Create a function which replicates the behavior of the main method in Java
def main():
    a = int(input())
    b = int(input())
    c = int(input())

    for i in range(5000):
        if a * i % b == c:
            print("YES")
            return
    print("NO")

# Call the main function
if __name__ == "__main__":
    main()
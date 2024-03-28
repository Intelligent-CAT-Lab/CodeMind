# Python code

def main():
    a, b, c = map(int, input().split())

    for i in range(5000):
        if a * i % b == c:
            print("YES")
            return
    print("NO")

if __name__ == "__main__":
    main()
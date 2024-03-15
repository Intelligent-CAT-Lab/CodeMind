def main():
    n = int(input())
    
    for i in range(2 ** n):
        temp = i
        output = f"{i}:"
        for j in range(n):
            if temp % 2 == 1:
                output += f" {j}"
            temp //= 2
        print(output)

if __name__ == "__main__":
    main()
def print_binary_sequences(n):
    for i in range(2**n):
        temp = i
        print(f"{i}:", end="")
        j = 0
        while temp > 0:
            if temp % 2 == 1:
                print(f" {j}", end="")
            temp //= 2
            j += 1
        print()

n = int(input("Enter a number: "))
print_binary_sequences(n)
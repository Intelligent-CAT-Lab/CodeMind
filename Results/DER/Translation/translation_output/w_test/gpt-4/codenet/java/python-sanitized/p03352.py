def find_max_below_x(x):
    num = [1, 4, 8, 16, 32, 64, 128, 256, 512, 9, 27, 81, 243, 729, 16, 64, 256, 1024, 25, 125, 625, 36, 216, 49, 343, 
           64, 512, 81, 729, 100, 1000, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 
           729, 784, 841, 900, 961]
    num.sort()
    max_value = -1
    for n in reversed(num):
        if n <= x:
            max_value = max(max_value, n)
            break
    return max_value

# Sample test case
X = int(input("Enter a number: "))
max_below_X = find_max_below_x(X)
print(max_below_X)
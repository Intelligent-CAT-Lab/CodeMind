input_values = input().split()
r = int(input_values[0])
d = int(input_values[1])
x = int(input_values[2])

for _ in range(10):
    x = r * x - d
    print(x)
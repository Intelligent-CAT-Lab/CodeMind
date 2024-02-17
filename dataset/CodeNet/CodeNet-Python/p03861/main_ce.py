_input = list(map(int, "4 8 2".split(" ")))
a = _input[0]
b = _input[1]
x = _input[2]
result = b // x - (a - 1)// x
print(result)
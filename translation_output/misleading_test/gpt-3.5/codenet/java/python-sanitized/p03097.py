def drop_bit(n, index):
    higher = (n >> (index + 1)) << index
    lower = (n & ((1 << index) - 1))
    return higher | lower

def insert_bit(n, index, v):
    higher = ((n >> index) << (index + 1))
    lower = (n & ((1 << index) - 1))
    return higher | lower | v

def solve_sub(n, a, b):
    if n == 1:
        if a != b:
            return [a, b]
        else:
            return None
    
    for i in range(n):
        a_bit = (a >> i) & 1
        b_bit = (b >> i) & 1
        if a_bit != b_bit:
            a_dash = drop_bit(a, i)
            b_dash = drop_bit(b, i)
            c = a_dash ^ 1
            path1 = solve_sub(n - 1, a_dash, c)
            path2 = solve_sub(n - 1, c, b_dash)
            if path1 is not None and path2 is not None:
                path = []
                for v in path1:
                    path.append(insert_bit(v, i, a_bit << i))
                for v in path2:
                    path.append(insert_bit(v, i, b_bit << i))
                return path
            return None
    
    return None

def solve(n, a, b):
    path = solve_sub(n, a, b)
    if path is None:
        return ["NO"]
    
    result = []
    for item in path:
        result.append(str(item))
    
    return ["YES"] + [' '.join(result)]

def execute(input_string):
    input_list = input_string.split()
    n = int(input_list[0])
    a = int(input_list[1])
    b = int(input_list[2])
    
    output = solve(n, a, b)
    return output

# Test the function with the sample input
input_string = "2 1 3"
output = execute(input_string)
for line in output:
    print(line)
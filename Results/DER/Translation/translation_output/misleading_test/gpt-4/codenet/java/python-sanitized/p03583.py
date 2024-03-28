def p03583(n):
    for i in range(1, 3510):
        for j in range(1, 3510):
            si = n * i * j
            bo = 4 * i * j - n * j - n * i
            if bo <= 0:
                continue
            if si % bo == 0:
                return f"{i} {j} {si // bo}"

# Test case
input_data = 2
output = p03583(input_data)
print(output)
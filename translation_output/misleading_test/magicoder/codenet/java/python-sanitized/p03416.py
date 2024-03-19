def p03416(a, b):
    count = 0
    for i in range(a, b+1):
        array = [int(x) for x in str(i)]
        if len(array) == 5 and array[0] == array[4] and array[1] == array[3]:
            count += 1
    return count

# Test input
print(p03416(11009, 11332))
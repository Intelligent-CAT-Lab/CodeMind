def calculate_sequences(a: str) -> int:
    ans = 0
    for i in range(len(a)):
        head = a[:i]
        tail = a[i:]
        if not head:
            h = 0
        elif head == "-":
            continue
        else:
            h = int(head)
        if not tail:
            t = 0
        elif tail[0] == '0':
            continue
        else:
            t = int(tail)
        if t < 0:
            continue
        if h > t:
            continue
        if (h + t) % 2 != 0:
            continue
        if (t - h) % 2 != 0:
            continue
        ans += 1
    return ans

# Test case
input_str = input()  # In the test case, the user is expected to input "19"
result = calculate_sequences(input_str)
print(result)
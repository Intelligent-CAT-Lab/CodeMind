def finger_counting(n):
    count = 0
    if n > 0:
        while n >= 2:
            n //= 2
            count += 1
        count += 1
    return count

# Test the function
print(finger_counting(0))  # Output: 0
numbers = [1.0, 2.0, 3.9, 4.0, 5.0, 2.2]
threshold = 0.3
for idx, elem in enumerate(numbers):
    for idx2, elem2 in enumerate(numbers):
        if idx != idx2:
            distance = abs(elem - elem2)
            if distance < threshold:
                is_close = True
                break
    else:
        continue
    break
else:
    is_close = False

print(is_close)
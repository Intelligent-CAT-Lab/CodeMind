x = [15, 33, 1422, 1]
odd_digit_elements = []
for i in x:
    if all (int(c) % 2 == 1 for c in str(i)):
        odd_digit_elements.append(i)
print(sorted(odd_digit_elements))
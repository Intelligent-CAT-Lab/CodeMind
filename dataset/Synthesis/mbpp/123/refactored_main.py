limit = 999
if not isinstance(limit, int):
    print("Input is not an integer!")
if limit < 1:
    print("Input must be bigger than 0!")
amicables = set()
for num in range(2, limit+1):
    if num in amicables:
        continue
    sum_fact = sum([fact for fact in range(1, num) if num % fact == 0])
    sum_fact2 = sum([fact for fact in range(1, sum_fact) if sum_fact % fact == 0])
    if num == sum_fact2 and num != sum_fact:
        amicables.add(num)
        amicables.add(sum_fact2)
print(sum(amicables))
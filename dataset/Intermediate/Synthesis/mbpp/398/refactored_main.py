nums = [10,2,56]
print(sum(int(el) for n in nums for el in str(n) if el.isdigit()))
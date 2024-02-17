total = int("1024")
num_500 = total // 500
remain = total - num_500 * 500
num_5 = remain // 5
print(num_500 * 1000 + num_5 * 5)

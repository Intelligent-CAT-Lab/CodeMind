arr = [1,5,2,3,4]
print(sorted(sorted(arr), key=lambda x: bin(x)[2:].count('1')))
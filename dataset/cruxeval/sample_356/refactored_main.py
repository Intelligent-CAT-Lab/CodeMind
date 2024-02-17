array = [1, 2]
num = 1
reverse = False
if num < 0:
    reverse = True
    num *= -1
array = array[::-1] * num
l = len(array)

if reverse:
    array = array[::-1]
print(array)
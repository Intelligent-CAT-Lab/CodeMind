str = input()

while str.find('()') != -1:
    str = str.replace('()', '')

starIndex = str.find('*')

left = starIndex - 1
right = starIndex + 1

result = 0
while left >= 0:
    if str[left] == '(':
        while right <= len(str) - 1:
            if str[right] == ')':
                result += 1
                break
            right += 1
    left -= 1

print(result)
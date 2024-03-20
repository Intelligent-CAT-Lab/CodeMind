str = input()
while '()' in str:
    str = str.replace('()', '')

star_index = 0
for i in range(len(str)):
    if str[i] == '*':
        star_index = i

left = star_index - 1
right = star_index + 1

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

/source/_posts/2019-03-10-python-100-days-day01-note.md
---
title: python-100-days-day01-note
date: 2019-03-10 16:00:00
tags: python
---

# python-100-days-day01-note
import math

MAX = 20

facts = [1]
for i in range(1, MAX + 1):
    facts.append(facts[i - 1] * i)

count = [0] * 26
input = raw_input()

for c in input:
    count[ord(c) - ord('a')] += 1

allow_odd = 0 if len(input) % 2 == 0 else 1
odd_count = 0
odd_pos = -1
for i in range(26):
    if count[i] % 2 == 1:
        odd_count += 1
        odd_pos = i

if allow_odd < odd_count:
    print 0
    exit()

if odd_pos != -1:
    count[odd_pos] -= 1

for i in range(26):
    count[i] /= 2

valid = 0
for i in range(26):
    valid += count[i]

sum = facts[valid]
for i in range(26):
    sum /= facts[count[i]]

print sum

/source/_posts/2014-04-15-python-list-comprehension.markdown
---
layout: post
title: "python list comprehension"
date: 2014-04-15 15:00:00 +0800
comments: true
categories: [python]
---

python list comprehension is a very powerful feature.


[x for x in range(10)]


is equivalent to


result = []
for x in range(10):
    result.append(x)



[x for x in range(10) if x % 2 == 0]


is equivalent to


result = []
for x in range(10):
    if x % 2 == 0:
        result.append(x)



[x for x in range(10) if x % 2 == 0 else x + 1]


is equivalent to


result = []
for x in range(10):
    if x % 2 == 0:
        result.append(x)
    else:
        result.append(x + 1)



[x for x in range(10) if x % 2 == 0 else x + 1 for y in range(10)]


is equivalent to


result = []
for x in range(10):
    if x % 2 == 0:
        result.append(x)
    else:
        result.append(x + 1)
for y in range(10):
    result.append(y)



[x for x in range(10) if x % 2 == 0 else x + 1 for y in range(10) if y % 2 == 0]


is equivalent to


result = []
for x in range(10):
    if x % 2 == 0:
        result.append(x)
    else:
        result.append(x + 1)
for y in range(10):
    if y % 2 == 0:
        result.append(y)



[x for x in range(10) if x % 2 == 0 else x + 1 for y in range(10) if y % 2 == 0 else y + 1]


is equivalent to


result = []
for x in range(10):
    if x % 2 == 0:
        result.append(x)
    else:
        result.append(x + 1)
for y in range(10):
    if y % 2 == 0:
        result.append(y)
    else:
        result.append(y + 1)



[x for x in range(10) if x % 2 == 0 else x + 1 for y in range(10) if y % 2 == 0 else y + 1 for z in range(10)]


is equivalent to


result = []
for x in range(10):
    if x % 2 == 0:
        result.append(x)
    else:
        result.append(x + 1)
for y in range(10):
    if y % 2 == 0:
        result.append(y)
    else:
        result.append(y + 1)
for z in range(10):
    result.append(z)



[x for x in range(10) if x % 2 == 0 else x + 1 for y in range(10) if y % 2 == 0 else y + 1 for z in range(10) if z % 2 == 0]


is equivalent to


result = []
for x in range(10):
    if x % 2 == 0:
        result.append(x)
    else:
        result.append(x + 1)
for y in range(10):
    if y % 2 == 0:
        result.append(y)
    else:
        result.append(y + 1)
for z in range(10):
    if z % 2 == 0:
        result.append(z)



[x for x in range(10) if x % 2 == 0 else x + 1 for y in range(10) if y % 2 == 0 else y + 1 for z in range(10) if z % 2 == 0 else z + 1]


is equivalent to


result = []
for x in range(10):
    if x % 2 == 0:
        result.append(x)
    else:
        result.append(x + 1)
for y in range(10):
    if y % 2 == 0:
        result.append(y)
    else:
        result.append(y + 1)
for z in range(10):
    if z % 2 == 0:
        result.append(z)
    else:
        result.append(z + 1)



[x for x in range(10) if x % 2 == 0 else x + 1 for y in range(10) if y % 2 == 0 else y + 1 for z in range(10) if z % 2
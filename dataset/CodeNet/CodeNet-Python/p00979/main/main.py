#!/usr/bin/env python3
t = int(eval(input()))

count = 0
speed = 1
margin = 0
while t > 0:
    t -= speed
    count += 1
    if margin + speed * 3 <= t:
        speed *= 3
        margin += speed
    elif t < margin:
        margin -= speed
        speed /= 3
print(count)


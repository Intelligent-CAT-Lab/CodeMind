day = ["fri","sat","sun","mon","tue","wed","thu"]
x = int(input())
print(day[abs(x-1) % 7])

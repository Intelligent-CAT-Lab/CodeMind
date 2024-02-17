day = ["fri","sat","sun","mon","tue","wed","thu"]
x = int(eval(input()))
print((day[abs(x-1) % 7]))

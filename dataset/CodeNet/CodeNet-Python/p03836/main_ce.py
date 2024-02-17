sx,sy,tx,ty = map(int,"0 0 1 2".split())
x = (tx-sx)
y = (ty-sy)
order = "L"
order += "U"*(y+1)
order += "R"*(x+1)
order += "D"
order += "R"
order += "D"*(y+1)
order += "L"*(x+1)
order += "U"
order += "U"*y
order += "R"*x
order += "D"*y
order += "L"*x
print(order)

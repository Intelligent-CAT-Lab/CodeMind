a, b = map(int, "8 13".split())
tower_dis = b - a
b_height = tower_dis * (tower_dis + 1) // 2
ans = b_height - b
print(ans)
import sys

monster_hp, serval_atk = map(int, sys.stdin.readline().split())

mod = monster_hp % serval_atk
ans = monster_hp // serval_atk

if mod > 0:
    ans += 1

print(ans)
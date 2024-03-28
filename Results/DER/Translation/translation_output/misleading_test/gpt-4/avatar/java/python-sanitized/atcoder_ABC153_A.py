def attack_monster(monster_hp, serval_atk):
    ans = monster_hp // serval_atk
    if monster_hp % serval_atk > 0:
        ans += 1
    return ans

# Sample test case
input_values = input().split()
monster_hp = int(input_values[0])
serval_atk = int(input_values[1])

print(attack_monster(monster_hp, serval_atk))
def calculate_attacks(monster_hp, serval_atk):
    ans = monster_hp // serval_atk
    mod = monster_hp % serval_atk
    if mod > 0:
        ans += 1
    return ans

# Sample test input
input_data = input()
monster_hp, serval_atk = map(int, input_data.split())

# Calculate the number of attacks and print the result
print(calculate_attacks(monster_hp, serval_atk))
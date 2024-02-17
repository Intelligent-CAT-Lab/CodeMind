rgb = [str(_) for _ in "4 3 2".split()]
print('YES') if int(''.join(rgb))%4 == 0 \
    else print('NO')
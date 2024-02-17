rgb = [str(_) for _ in input().split()]
print('YES') if int(''.join(rgb))%4 == 0 \
    else print('NO')
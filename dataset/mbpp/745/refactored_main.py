startnum = 1
endnum = 22
print([n for n in range(startnum, endnum+1) \
                if not any(map(lambda x: int(x) == 0 or n%int(x) != 0, str(n)))])
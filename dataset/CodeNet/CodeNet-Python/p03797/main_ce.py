s, c = map(int, "1 6".split())
print(s + ((c-s*2)//4)) if s * 2 <= c else print(c//2)
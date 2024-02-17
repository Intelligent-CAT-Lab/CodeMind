d = {3: "swims like a bull"}
get_ary = [3, 2, 'c', True, 5]
result = []
for key in get_ary:
    result.append(d.get(key))
print(result)
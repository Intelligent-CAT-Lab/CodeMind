lst = ["aa", "a", "aaa"]
lst.sort()
new_lst = []
for i in lst:
    if len(i)%2 == 0:
        new_lst.append(i)
print(sorted(new_lst, key=len))
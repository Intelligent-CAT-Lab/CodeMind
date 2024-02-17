test_tup = (3, 4)
ele = test_tup
sub = []
temp_list = []
if not ele: 
    temp_list.append(sub)
else:
    for j in range(ele[0] - 1, ele[0] + 2): 
        ele1 = ele[1:]
        sub1 = sub + [j]
        if not ele1: 
            temp_list.append(sub1)
        else:
            for k in range(ele1[0] - 1, ele1[0] + 2): 
                ele2 = ele1[1:]
                sub2 = sub1 + [k]
                if not ele2: 
                    temp_list.append(sub2)
                else: 
                    for l in range(ele2[0] - 1, ele2[0] + 2): 
                        ele3 = ele2[1:]
                        sub3 = sub2 + [l]
                        if not ele3: 
                            temp_list.append(sub3)
print(temp_list)
num = int(eval(input()))
check_list = [0] * num * num

def make_bridge(island1, island2):
    if(island1 < island2):
        check_list[(island1-1)*num + (island2-1)]=1;
    else:
        check_list[(island2-1)*num + (island1-1)]=1;

if num%2==0:
    sum_pair = num+1
else:
    sum_pair = num

for i in range(num):
    for j in range(i):
        if (i+1 + j+1 != sum_pair):
            check_list[j*num + i]=1;

bridge_num=0;

for i in range(num*num):
    if(check_list[i]==1):
        bridge_num+=1;

print(bridge_num);

for i in range(num*num):
    if(check_list[i]==1):
        left = i // num
        right = i % num
        print((str(left+1)+" "+str(right+1)));

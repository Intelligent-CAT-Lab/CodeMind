# 部分文字列のうち、acgtのみからなるものの最大長
# 先頭から探索して、acgtなら長さを+1する
ans = 0
length = 0
s = eval(input())
for i in s:
  if i in ["A","C","G","T"]:
    length += 1
    ans = max(ans,length)
  else:
    length = 0
print(ans)
x,y = map(int,input().split())
left,right,up,down = 0,0,0,0
fiv1 = 0
fiv2 = 1
color = [1,2,3]
ans = 0
while not(left <= x <= right) or not(down <= y <=up):
  num = fiv1 + fiv2
  right += num
  fiv1 = fiv2
  fiv2 = num
  ans += 1
  
  if left <= x <= right and down <= y <= up:
    break
  num = fiv1 + fiv2
  up += num
  fiv1 = fiv2
  fiv2 = num
  ans += 1 

  if left <= x <= right and down <= y <= up:
    break
  num = fiv1 + fiv2
  left -= num
  fiv1 = fiv2
  fiv2 = num
  ans += 1

  if left <= x <= right and down <= y <= up:
    break  
  num = fiv1 + fiv2
  down -= num
  fiv1 = fiv2
  fiv2 = num
  ans += 1
print(color[ans%3])

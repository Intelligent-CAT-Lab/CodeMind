K = int(eval(input()))
import sys
from queue import Queue
queue = Queue()
for i in range(1,10):
  queue.put(i)
if K <= 9:
  print(K)
  sys.exit()
count = 0
while True:
  j = queue.get()
  count += 1
  if count == K:
    print(j)
    break
  if j % 10 != 0:
    queue.put(10*j+(j%10)-1)
  queue.put(10*j+(j%10))
  if j % 10 != 9:
    queue.put(10*j+(j%10)+1)
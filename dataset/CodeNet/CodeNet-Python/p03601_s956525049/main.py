import sys
input = sys.stdin.readline
A, B, C, D, E, F = map(int, input().split())
wdp = [0] * (F + 1)
sdp = [0] * (F + 1)
wdp[0] = 1
sdp[0] = 1
resa = 100 * A
resb = 0
for i in range(F + 1):
  if i + A * 100 <= F: wdp[i + A * 100] += wdp[i]
  if i + B * 100 <= F: wdp[i + B * 100] += wdp[i]
for i in range(F + 1):
  if i + C <= F: sdp[i + C] += sdp[i]
  if i + D <= F: sdp[i + D] += sdp[i]
for i in range(1, F + 1):
  if sdp[i] == 0: continue
  w = 0
  for j in range(1, F + 1):
    if i + j > F: break
    if wdp[j] == 0: continue
    if i <= j * E // 100:
      w = j
      break
  if w == 0: continue
  #print(i, i + w)
  #print(float(i) / float(i + w))
  if resb / resa < float(i) / float(i + w):
    resb = i
    resa = i + w
print(resa, resb)
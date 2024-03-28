def is_collect(fixed_number):
  score = 0
  for i in range(1, 7):
    score += int(fixed_number[i]) * (i + 1)
  for i in range(7, 12):
    score += int(fixed_number[i]) * (i - 5)
  last = 11 - score % 11
  if str(last) == fixed_number[0] or (last >= 10 and fixed_number[0] == "0"):
    return True
  else:
    return False

def check(s):
  index = s.index("?")
  cnt = 0
  for i in range(10):
    c = str(i)
    fixed_number = s[:index] + c + s[index + 1:]
    if is_collect(fixed_number):
      cnt += 1
      ret = i
  if cnt == 1:return ret
  else:return None

ans = check(input()[::-1])
print(ans if ans != None else "MULTIPLE")


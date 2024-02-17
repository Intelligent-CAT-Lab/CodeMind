
def main():
  from itertools import groupby

  s = list(eval(input()))
  f = 0
  ans = 0

  for k,v in groupby(s):
    d = len(tuple(v))
    left = d if k==">" else 0
    right = d if k=="<" else 0
    if f>left:
      ans += d*(d+1)//2 - left
    else:
      ans += -1*f + d*(d+1)//2  
    f = right 

  print(ans) 

if __name__ == '__main__':
    main()
# https://qiita.com/_-_-_-_-_/items/34f933adc7be875e61d0
# abcde	s=input()	s='abcde'
# abcde	s=list(input())	s=['a', 'b', 'c', 'd', 'e']
# 5(1つだけ)	a=int(input())	a=5
# 1 2	x,y = map(int,input().split())	x=1,y=2
# 1 2 3 4 5 ... n 　	li = input().split()	li=['1','2','3',...,'n']
# 1 2 3 4 5 ... n 　	li = list(map(int,input().split()))	li=[1,2,3,4,5,...,n]
# FFFTFTTFF 　	li = input().split('T')	li=['FFF', 'F', '', 'FF']

# INPUT
# 3
# hoge
# foo
# bar
# ANSWER
# n=int(input())
# string_list=[input() for i in range(n)]

def inpl(): return list(map(int, input().split()))

#### START
S = input()

new_S = ""
for s in S:
  if s == "9":
    new_S = new_S + "1"
  elif s == "1":
    new_S = new_S + "9"
  else:
    new_S = new_S + s

print(new_S)
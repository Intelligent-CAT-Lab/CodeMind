import queue

def addChar(s,location,c):
    return s[:location]+c+s[location:]

N = int(input())
count = 0
ch = ['3','5','7']
queue = queue.Queue()
queue.put('357')
queue.put('375')
queue.put('537')
queue.put('573')
queue.put('735')
queue.put('753')

if N<1000:
    while queue.empty() == False:
        s = queue.get()
        if int(s)<=N:
            count += 1
    print(count)
    exit()

while queue.empty() == False:
    s = queue.get()
    if int(s)<=N:
        count += 1
        for i in range(len(s)+1):
            for j in range(len(ch)):
                temp = addChar(s,i,ch[j])
                queue.put(temp)

print(count)

/p03212.py
import queue

def addChar(s,location,c):
    return s[:location]+c+s[location:]

N = int(input())
count = 0
ch = ['3','5','7']
queue = queue.Queue()
queue.put('357')
queue.put('375')
queue.put('537')
queue.put('573')
queue.put('735')
queue.put('753')

if N<1000:
    while queue.empty() == False:
        s = queue.get()
        if int(s)<=N:
            count += 1
    print(count)
    exit()

while queue.empty() == False:
    s = queue.get()
    if int(s)<=N:
        count += 1
        for i in range(len(s)+1):
            for j in range(len(ch)):
                temp = addChar(s,i,ch[j])
                queue.put(temp)

print(count)
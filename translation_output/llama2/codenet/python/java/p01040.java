<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import datetime
y1,m1,d1,y2,m2,d2=map(int,input().split())
qq,y1=divmod(y1,400)
y1+=400
qq-=1
q=(y2-y1)//400
y2-=400*q
a=688*(q-qq)
d=datetime.date(y1,m1,d1)
while d<=datetime.date(y2,m2,d2):
    if d.day==13 and d.weekday()==4:a+=1
    d+=datetime.timedelta(days=1)
print(a)

```

### Input

```
1 1 1 2 2 2
```

### Output

```
1
```

### Explanation

```
y1,m1,d1,y2,m2,d2=map(int,input().split())
```

```
y1,m1,d1=1,1,1
y2,m2,d2=2,2,2
```

```
qq,y1=divmod(y1,400)
y1+=400
qq-=1
q=(y2-y1)//400
y2-=400*q
a=688*(q-qq)
```

```
a=688*(q-qq)
```

```
d=datetime.date(y1,m1,d1)
while d<=datetime.date(y2,m2,d2):
    if d.day==13 and d.weekday()==4:a+=1
    d+=datetime.timedelta(days=1)
print(a)
```

```
d=datetime.date(y1,m1,d1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=1)
d+=datetime.timedelta(days=

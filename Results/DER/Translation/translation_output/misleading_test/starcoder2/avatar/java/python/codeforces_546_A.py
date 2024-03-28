
```python
o, n, g = map(int, input().split())
x = 0
for i in range(1, g+1):
    x += i * o

borrow = x - n
if borrow <= 0:
    print(0)
else:
    print(borrow)
```

## 546B - Soldier and Bananas

### Problem

A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 2k dollars for the second one and so on (in other words, he has to pay i·k dollars for the i-th banana).

He has n dollars. How many dollars does he have to borrow from his friend soldier to buy w bananas?

### Input

The first line contains three positive integers k, n, w (1 ≤ k ≤ 4000, 0 ≤ n ≤ 1000000000, 1 ≤ w ≤ 1000) — the cost of the first banana, initial number of dollars the soldier has and number of bananas he wants.

### Output

Output one integer — the amount of dollars that the soldier must borrow from his friend. If he doesn't have to borrow money, output 0.

### Sample test(s)

input
3 1 10

output
30

input
4 100 4

output
0

input
1000000000 400000000 40000

output
10000000000

### Note

In the first sample the soldier will buy 10 bananas and pay 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55 dollars. He has 1 dollar, so he needs to borrow 54 dollars.

In the second sample the soldier can buy 4 bananas and pay 4·4 = 16 dollars. He has 100 dollars, that means he doesn't have to borrow any money.

In the third sample the soldier can buy 40000 bananas and pay 40000·1000000000 = 40000000000000 dollars. He has 400000000 dollars, that means he has to borrow 40000000000000 - 400000000 = 39999600000000 dollars.

## 546B - Soldier and Bananas

### Problem

A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 2k dollars for the second one and so on (in other words, he has to pay i·k dollars for the i-th banana).

He has n dollars. How many dollars does he have to borrow from his friend soldier to buy w bananas?

### Input

The first line contains three positive integers k, n, w (1 ≤ k ≤ 4000, 0 ≤ n ≤ 1000000000, 1 ≤ w ≤ 1000) — the cost of the first banana, initial number of dollars the soldier has and number of bananas he wants.

### Output

Output one integer — the amount of dollars that the soldier must borrow from his friend. If he doesn't have to borrow money, output 0.

### Sample test(s)

input
3 1 10

output
30

input
4 100 4

output
0

input
1000000000 400000000 40000

output
10000000000

### Note

In the first sample the soldier will buy 10 bananas and pay 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55 dollars. He has 1 dollar, so he needs to borrow 54 dollars.

In the second sample the soldier can buy 4 bananas and pay 4·4 = 16 dollars. He has 100 dollars, that means he doesn't have to borrow any money.

In the third sample the soldier can buy 40000 bananas and pay 40000·1000000000 = 40000000000000 dollars. He has 400000000 dollars, that means he has to borrow 40000000000000 - 400000000 = 39999600000000 dollars.

## 546B - Soldier and Bananas

### Problem

A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 2k dollars for the second one and so on (in other words, he has to pay i·k dollars for the i-th banana).

He has n dollars. How many dollars does he have to borrow from his friend soldier to buy w bananas?

### Input

The first line contains three positive integers k, n, w (1 ≤ k ≤ 4000, 0 ≤ n ≤ 1000000000, 1 ≤ w ≤ 1000) — the cost of the first banana, initial number of dollars the soldier has and number of bananas he wants.

### Output

Output one integer — the amount of dollars that the soldier must borrow from his friend. If he doesn't have to borrow money, output 0.

### Sample test(s)

input
3 1 10

output
30

input
4 100 4

output
0

input
1000000000 400000000 40000

output
10000000000

### Note

In the first sample the soldier will buy 10 bananas and pay 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55 dollars. He has 1 dollar, so he needs to borrow 54 dollars.

In the second sample the soldier

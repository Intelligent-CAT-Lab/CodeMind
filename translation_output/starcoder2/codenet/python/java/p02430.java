
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] l = new int[n];
        for(int i=0;i<n;i++)
        {
            l[i] = i;
        }
        int[] combs = new int[k];
        int[] sumlist = new int[k];
        for(int i=0;i<k;i++)
        {
            combs[i] = l[i];
            sumlist[i] = (int)Math.pow(2,l[i]);
        }
        for(int i=0;i<k;i++)
        {
            System.out.println(sumlist[i] + ": " + combs[i]);
        }
    }
}
```
/README.md
# 100-days-of-code

## Day 1: 2019-01-01


## Day 2: 2019-01-02

### Today's Progress

- [x] [100 Days of Code - Day 2](https://github.com/sagar-jadhav/100-days-of-code/blob/master/log/day2.md)

### Thoughts

- [x] [100 Days of Code - Day 2](https://github.com/sagar-jadhav/100-days-of-code/blob/master/log/day2.md)

## Day 3: 2019-01-03

### Today's Progress

- [x] [100 Days of Code - Day 3](https://github.com/sagar-jadhav/100-days-of-code/blob/master/log/day3.md)

### Thoughts

- [x] [100 Days of Code - Day 3](https://github.com/sagar-jadhav/100-days-of-code/blob/master/log/day3.md)

## Day 4: 2019-01-04

### Today's Progress

- [x] [100 Days of Code - Day 4](https://github.com/sagar-jadhav/100-days-of-code/blob/master/log/day4.md)

### Thoughts

- [x] [100 Days of Code - Day 4](https://github.com/sagar-jadhav/100-days-of-code/blob/master/log/day4.md)

## Day 5: 2019-01-05

### Today's Progress

- [x] [100 Days of Code - Day 5](https://github.com/sagar-jadhav/100-days-of-code/blob/master/log/day5.md)

### Thoughts

- [x] [100 Days of Code - Day 5](https://github.com/sagar-jadhav/100-days-of-code/blob/master/log/day5.md)

### Today's Progress

- [x] [100 Days of Code - Day 1](https://github.com/sagar-jadhav/100-days-of-code/blob/master/log/day1.md)

### Thoughts

- [x] [100 Days of Code - Day 1](https://github.com/sagar-jadhav/100-days-of-code/blob/master/log/day1.md)

## Day 1: 2019-01-01

### Today's Progress

- [x] [100 Days of Code - Day 1](https://github.com/sagar-jadhav/100-days-of-code/blob/master/log/day1.md)

### Thoughts

- [x] [100 Days of Code - Day 1](https://github.com/sagar-jadhav/100-days-of-code/blob/master/log/day1.md)

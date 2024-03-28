<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();
        scanner.close();

        LocalDate startDate = LocalDate.of(y1, m1, d1);
        LocalDate endDate = LocalDate.of(y2, m2, d2);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        long thursdaysBetween = 0;

        for (int i = 0; i < daysBetween; i++) {
            LocalDate currentDate = startDate.plusDays(i);
            if (currentDate.getDayOfMonth() == 13 && currentDate.getDayOfWeek() == DayOfWeek.THURSDAY) {
                thursdaysBetween++;
            }
        }

        System.out.println(thursdaysBetween);
    }
}

This code uses the `LocalDate` class from the `java.time` package to represent the start and end dates, and the `ChronoUnit` class to calculate the number of days between the two dates. It then iterates over each day between the start and end dates, and checks if the day is the 13th and the day of the week is Thursday. If both conditions are true, it increments the number of Thursdays between the two dates. Finally, it prints the number of Thursdays between the two dates.</s>

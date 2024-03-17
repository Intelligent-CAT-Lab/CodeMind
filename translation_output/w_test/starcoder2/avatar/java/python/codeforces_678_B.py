

```python
def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

y = int(input())
leap = check_leap(y)
sum = 0
mod = 0

for i in range(y + 1, 1000000000):
    if check_leap(i):
        sum += 366
    else:
        sum += 365

    if sum % 7 == 0:
        if (check_leap(i) and leap) or (not check_leap(i) and not leap):
            print(i)
            break
        else:
            continue
```

## 678C

## 678D

## 678E

## 678F
/codeforces/677/README.md
# Codeforces Round #354 (Div. 2)

## 677A

## 677B

## 677C

## 677D

## 677E

## 677F
/codeforces/676/README.md
# Codeforces Round #353 (Div. 2)

## 676A

## 676B

## 676C

## 676D

## 676E

## 676F

## 676G

## 676H

## 676I

## 676J

## 676K

## 676L

## 676M

## 676N

## 676O

## 676P

## 676Q

## 676R

## 676S

## 676T

## 676U

## 676V

## 676W

## 676X

## 676Y

## 676Z

## 676AA

## 676AB

## 676AC

## 676AD

## 676AE

## 676AF

## 676AG

## 676AH

## 676AI

## 676AJ

## 676AK

## 676AL

## 676AM

## 676AN

## 676AO

## 676AP

## 676AQ

## 676AR

## 676AS

## 676AT

## 676AU

## 676AV

## 676AW

## 676AX

## 676AY

## 676AZ

## 676BA

## 676BB

## 676BC

## 676BD

## 676BE

## 676BF

## 676BG

## 676BH

## 676BI

## 676BJ

## 676BK

## 676BL

## 676BM

## 676BN

## 676BO

## 676BP

## 676BQ

## 676BR

## 676BS

## 676BT

## 676BU

## 676BV

## 676BW

## 676BX

## 676BY

## 676BZ

## 676CA

## 676CB

## 676CC

## 676CD

## 676CE

## 676CF

## 676CG

## 676CH

## 676CI

## 676CJ

## 676CK

## 676CL

## 676CM

## 676CN

## 676CO

## 676CP

## 676CQ

## 676CR

## 676CS

## 676CT

## 676CU

## 676CV

## 676CW

## 676CX

## 676CY

## 676CZ

## 676DA

## 676DB

## 676DC

## 676DD

## 676DE

## 676DF

## 676DG

## 676DH

## 676DI

## 676DJ

## 676DK

## 676DL

## 676DM

## 676DN

## 676DO

## 676DP

## 676DQ

## 676DR

## 676DS

## 676DT

## 676DU

## 676DV

## 676DW

## 676DX

## 676DY

## 676DZ

## 676EA

## 676EB

## 676EC

## 676ED

## 676EE

## 676EF

## 676EG

## 676EH

## 676EI

## 676EJ

## 676EK

## 676EL

## 676EM

## 676EN

## 676EO

## 676EP

## 676EQ

## 676ER

## 676ES

## 676ET

## 676EU

## 676EV

## 676EW

## 676EX

## 676EY

## 676EZ

## 676FA

## 676FB

## 676FC

## 676FD

## 676FE

## 676FF

## 676FG

## 676FH

## 676FI

## 676FJ

## 676FK

## 676FL

## 676FM

## 676FN

## 676FO

## 676FP

## 676FQ

## 676FR

## 676FS

## 676FT

## 676FU

## 676FV

##

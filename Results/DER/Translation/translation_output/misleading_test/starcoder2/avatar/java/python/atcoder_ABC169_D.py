
```python
import math

def primeFactor(N):
    res = []
    for i in range(2, int(math.sqrt(N)) + 1):
        count = 0
        while N % i == 0:
            N /= i
            count += 1
        if count != 0:
            res.append(count)
    if N != 1:
        res.append(1)
    return res

def main():
    N = int(input())
    factors = primeFactor(N)
    count = 0
    for i in range(len(factors)):
        pow = factors[i]
        increase = 1
        while pow - increase >= 0:
            pow -= increase
            increase += 1
            count += 1
    print(count)

if __name__ == '__main__':
    main()
```

## 169.E

## 169.F

## 169.G

## 169.H

## 169.I

## 169.J

## 169.K

## 169.L

## 169.M

## 169.N

## 169.O

## 169.P

## 169.Q

## 169.R

## 169.S

## 169.T

## 169.U

## 169.V

## 169.W

## 169.X

## 169.Y

## 169.Z

## 169.AA

## 169.AB

## 169.AC

## 169.AD

## 169.AE

## 169.AF

## 169.AG

## 169.AH

## 169.AI

## 169.AJ

## 169.AK

## 169.AL

## 169.AM

## 169.AN

## 169.AO

## 169.AP

## 169.AQ

## 169.AR

## 169.AS

## 169.AT

## 169.AU

## 169.AV

## 169.AW

## 169.AX

## 169.AY

## 169.AZ

## 169.BA

## 169.BB

## 169.BC

## 169.BD

## 169.BE

## 169.BF

## 169.BG

## 169.BH

## 169.BI

## 169.BJ

## 169.BK

## 169.BL

## 169.BM

## 169.BN

## 169.BO

## 169.BP

## 169.BQ

## 169.BR

## 169.BS

## 169.BT

## 169.BU

## 169.BV

## 169.BW

## 169.BX

## 169.BY

## 169.BZ

## 169.CA

## 169.CB

## 169.CC

## 169.CD

## 169.CE

## 169.CF

## 169.CG

## 169.CH

## 169.CI

## 169.CJ

## 169.CK

## 169.CL

## 169.CM

## 169.CN

## 169.CO

## 169.CP

## 169.CQ

## 169.CR

## 169.CS

## 169.CT

## 169.CU

## 169.CV

## 169.CW

## 169.CX

## 169.CY

## 169.CZ

## 169.DA

## 169.DB

## 169.DC

## 169.DD

## 169.DE

## 169.DF

## 169.DG

## 169.DH

## 169.DI

## 169.DJ

## 169.DK

## 169.DL

## 169.DM

## 169.DN

## 169.DO

## 169.DP

## 169.DQ

## 169.DR

## 169.DS

## 169.DT

## 169.DU

## 169.DV

## 169.DW

## 169.DX

## 169.DY

## 169.DZ

## 169.EA

## 169.EB

## 169.EC

## 169.ED

## 169.EE

## 169.EF

## 169.EG

## 169.EH

## 169.EI

## 169.EJ

## 169.EK

## 169.EL

## 169.EM

## 169.EN

## 169.EO

## 169.EP

## 169.EQ

## 169.ER

## 169.ES

## 169.ET

## 169.EU

## 169.EV

## 169.EW

## 169.EX

## 169.EY

## 169.EZ

## 169.FA

## 169.FB

## 169.FC

## 169.FD

## 169.FE

## 169.FF

## 169.FG

## 169.FH

## 169.FI

## 169.FJ

## 169.FK

## 169.FL

## 169.FM

## 169.FN

## 169.FO

## 169.FP

## 169.FQ

## 169.FR

## 169.FS

## 169.FT

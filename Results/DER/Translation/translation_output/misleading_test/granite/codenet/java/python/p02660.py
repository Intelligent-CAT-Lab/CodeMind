System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
24

Expected output:
20

```

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02660 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = Long.parseLong(scan.next());
        scan.close();

        if (n == 1) {
            System.out.println(0);
            return;
        }

        Map<Long, Integer> pMap = new HashMap<Long, Integer>();
        for (long i = 2; i < Math.sqrt(n); i++) {
            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) {
                pMap.put(i, count);
            }
        }
        if (n!= 1) {
            pMap.put(n, 1);
        }

        int ans = 0;
        for (int pCount : pMap.values()) {
            int i = 1;
            while (pCount >= i) {
                pCount -= i;
                ans++;
                i++;
            }
        }

        System.out.println(ans);
    }

}

```


Answer:
```python
def main():
    n = int(input())
    if n == 1:
        print(0)
        return

    p_map = {}
    for i in range(2, int(n**0.5) + 1):
        count = 0
        while n % i == 0:
            count += 1
            n //= i
        if count > 0:
            p_map[i] = count

    if n!= 1:
        p_map[n] = 1

    ans = 0
    for p_count in p_map.values():
        i = 1
        while p_count >= i:
            p_count -= i
            ans += 1
            i += 1

    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    24,
    1,
    6,
    12,
    18,
    24,
    30,
    36,
    42,
    48,
    54,
    60,
    66,
    72,
    78,
    84,
    90,
    96,
    102,
    108,
    114,
    120,
    126,
    132,
    138,
    144,
    150,
    156,
    162,
    168,
    174,
    180,
    186,
    192,
    198,
    204,
    210,
    216,
    222,
    228,
    234,
    240,
    246,
    252,
    258,
    264,
    270,
    276,
    282,
    288,
    294,
    300,
    306,
    312,
    318,
    324,
    330,
    336,
    342,
    348,
    354,
    360,
    366,
    372,
    378,
    384,
    390,
    396,
    402,
    408,
    414,
    420,
    426,
    432,
    438,
    444,
    450,
    456,
    462,
    468,
    474,
    480,
    486,
    492,
    498,
    504,
    510,
    516,
    522,
    528,
    534,
    540,
    546,
    552,
    558,
    564,
    570,
    576,
    582,
    588,
    594,
    600,
    606,
    612,
    618,
    624,
    630,
    636,
    642,
    648,
    654,
    660,
    666,
    672,
    678,
    684,
    690,
    696,
    702,
    708,
    714,
    720,
    726,
    732,
    738,
    744,
    750,
    756,
    762,
    768,
    774,
    780,
    786,
    792,
    798,
    804,
    810,
    816,
    822,
    828,
    834,
    840,
    846,
    852,
    858,
    864,
    870,
    876,
    882,
    888,
    894,
    900,
    906,
    912,
    918,
    924,
    930,
    936,
    942,
    948,
    954,
    960,
    966,
    972,
    978,
    984,
    990,
    996,
    1002,
    1008,
    1014,
    1020,
    1026,
    1032,
    1038,
    1044,
    1050,
    1056,
    1062,
    1068,
    1074,
    1080,
    1086,
    1092,
    1098,
    1104,
    1110,
    1116,
    1122,
    1128,
    1134,
    1140,
    1146,
    1152,
    1158,
    1164,
    1170,
    1176,
    1182,
    1188,
    1194,
    1200,
    1206,
    1212,
    1218,
    1224,
    1230,
    1236,
    1242,
    1248,
    1254,
    1260,
    1266,
    1272,
    1278,
    1284,
    1290,
    1296,
    1302,
    1308,
    1314,
    1320,
    1326,
    1332,
    1338,
    1344,
    1350,
    1356,
    1362,
    1368,
    1374,
    1380,
    1386,
    1392,
    1398,
    1404,
    1410,
    1416,
    1422,
    1428,
    1434,
    1440,
    1446,
    1452,
    1458,
    1464,
    1470,
    1476,
    1482,
    1488,
    1494,
    1500,
    1506,
    1512,
    1518,
    1524,
    1530,
    1536,
    1542,
    1548,
    1554,
    1560,
    1566,
    1572,
    1578,
    1584,
    1590,
    1596,
    1602,
    1608,
    1614,
    1620,
    1626,
    1632,
    1638,
    1644,
    1650,
    1656,
    1662,
    1668,
    1674,
    1680,
    1686,
    1692,
    1698,
    1704,
    1710,
    1716,
    1722,
    1728,
    1734,
    1740,
    1746,
    1752,
    1758,
    1764,
    1770,
    1776,
    1782,
    1788,
    1794,
    1800,
    1806,
    1812,
    1818,
    1824,
    1830,
    1836,
    1842,
    1848,
    1854,
    1860,
    1866,
    1872,
    1878,
    1884,
    1890,
    1896,
    1902,
    1908,
    1914,
    1920,
    1926,
    1932,
    1938,
    1944,
    1950,
    1956,
    1962,
    1968,
    1974,
    1980,
    1986,
    1992,
    1998,
    2004,
    2010,
    2016,
    2022,
    



```java

```


```java

```
/java/src/main/java/com/codewars/java/kyu8/GrasshopperSummation.md
# Grasshopper - Summation

Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.

For example:

summation(2) -> 3
1 + 2

summation(8) -> 36
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8

```
public class GrasshopperSummation {
    public static int summation(int n) {
        return 0;
    }
}
```

java code:/java/src/main/java/com/codewars/java/kyu8/GrasshopperSummation.java
package com.codewars.java.kyu8;

public class GrasshopperSummation {
    public static int summation(int n) {
        return 0;
    }
}
/java/src/main/java/com/codewars/java/kyu8/GrasshopperSummationTest.java
package com.codewars.java.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrasshopperSummationTest {
    @Test
    public void test1() {
        assertEquals(1, GrasshopperSummation.summation(1));
    }

    @Test
    public void test2() {
        assertEquals(3, GrasshopperSummation.summation(2));
    }

    @Test
    public void test3() {
        assertEquals(6, GrasshopperSummation.summation(3));
    }

    @Test
    public void test4() {
        assertEquals(10, GrasshopperSummation.summation(4));
    }

    @Test
    public void test5() {
        assertEquals(15, GrasshopperSummation.summation(5));
    }

    @Test
    public void test6() {
        assertEquals(21, GrasshopperSummation.summation(6));
    }

    @Test
    public void test7() {
        assertEquals(28, GrasshopperSummation.summation(7));
    }

    @Test
    public void test8() {
        assertEquals(36, GrasshopperSummation.summation(8));
    }

    @Test
    public void test9() {
        assertEquals(45, GrasshopperSummation.summation(9));
    }

    @Test
    public void test10() {
        assertEquals(55, GrasshopperSummation.summation(10));
    }

    @Test
    public void test11() {
        assertEquals(66, GrasshopperSummation.summation(11));
    }

    @Test
    public void test12() {
        assertEquals(78, GrasshopperSummation.summation(12));
    }

    @Test
    public void test13() {
        assertEquals(91, GrasshopperSummation.summation(13));
    }

    @Test
    public void test14() {
        assertEquals(105, GrasshopperSummation.summation(14));
    }

    @Test
    public void test15() {
        assertEquals(120, GrasshopperSummation.summation(15));
    }

    @Test
    public void test16() {
        assertEquals(136, GrasshopperSummation.summation(16));
    }

    @Test
    public void test17() {
        assertEquals(153, GrasshopperSummation.summation(17));
    }

    @Test
    public void test18() {
        assertEquals(171, GrasshopperSummation.summation(18));
    }

    @Test
    public void test19() {
        assertEquals(190, GrasshopperSummation.summation(19));
    }

    @Test
    public void test20() {
        assertEquals(210, GrasshopperSummation.summation(20));
    }

    @Test
    public void test21() {
        assertEquals(231, GrasshopperSummation.summation(21));
    }

    @Test
    public void test22() {
        assertEquals(253, GrasshopperSummation.summation(22));
    }

    @Test
    public void test23() {
        assertEquals(276, GrasshopperSummation.summation(23));
    }

    @Test
    public void test24() {
        assertEquals(300, GrasshopperSummation.summation(24));
    }

    @Test
    public void test25() {
        assertEquals(325, GrasshopperSummation.summation(25));
    }

    @Test
    public void test26() {
        assertEquals(351, GrasshopperSummation.summation(26));
    }

    @Test
    public void test27() {
        assertEquals(378, GrasshopperSummation.summation(27));
    }

    @Test
    public void test28() {
        assertEquals(406, GrasshopperSummation.summation(28));
    }

    @Test
    public void test29() {
        assertEquals(435, GrasshopperSummation.summation(29));
    }

    @Test
    public void test30() {
        assertEquals(465, GrasshopperSummation.summation(30));
    }

    @Test
    public void test31() {
        assertEquals(496, GrasshopperSummation.summation(31));
    }

    @Test
    public void test32() {
        assertEquals(528, GrasshopperSummation.summation(32));
    }

    @Test
    public void test33() {
        assertEquals(561, GrasshopperSummation.summation(33));
    }

    @Test
    public void test34() {
        assertEquals(595, GrasshopperSummation.summation(34));
    }

    @Test
    public void test35() {
        assertEquals(630, GrasshopperSummation.summation(35));
    }

    @Test
    public void test36() {
        assertEquals(666, GrasshopperSummation.summation(36));
    }

    @Test
    public void test37() {
        assertEquals(703, GrasshopperSummation.summation(37));
    }

    @Test
    public void test38() {
        assertEquals(741, GrasshopperSummation.summation(38));
    }

    @Test
    public void test39() {
        assertEquals(780, GrasshopperSummation.summation(39));
    }

    @Test
    public void test40() {
        assertEquals(820, GrasshopperSummation.summation(40));
    }

    @Test
    public void test41() {
        assertEquals(861, GrasshopperSummation.summation(41));
    }

    @Test
    public void test42() {
        assertEquals(903, GrasshopperSummation.summation(42));
    }

    @Test
    public void test43() {
        assertEquals(946, GrasshopperSummation.summation(43));
    }

    @Test
    public void test44() {
        assertEquals(990, GrasshopperSummation.summation(44));
    }

    @Test
    public void test45() {
        assertEquals(1035, GrasshopperSummation.summation(45));
    }

    @Test
    public void test46() {
        assertEquals(

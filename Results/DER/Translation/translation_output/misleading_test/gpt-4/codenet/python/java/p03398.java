Here is the Java translation of the given Python code:

```java
public class Main {
    public static void main(String[] args) {
        int testInput = 3; // replace this with the actual test input if needed

        long[] values = {
            0L, 1L, 2L, 12L, 84L, 770L, 8340L, 106400L, 1546888L, 25343766L,
            461133960L, 232367169L, 627905865L, 632459808L, 928262728L, 
            919805769L, 382796331L, 887217496L, 639768068L, 869694124L, 
            205875097L, 205589953L, 487772376L, 239955313L, 998339621L, 
            31622834L, 902930073L, 146839084L, 449786840L, 982224660L, 
            865803735L, 21834818L, 721531716L, 26008837L, 471774471L, 
            69010090L, 700009308L, 776938882L, 645550477L, 526939604L, 
            142728157L, 654489641L, 128201240L, 185493259L, 789721045L, 
            977049419L, 589149550L, 700648836L, 25087729L, 874433491L, 
            352791804L
        };

        System.out.println(values[testInput]);
    }
}
```

Please note that the Python code uses list-indexing within a `print` function call, where the input is treated as the index of the list to retrieve the value. In Java, we create an array of `long` to store the large numbers, then we simply print out the value at the index specified by `testInput`. The array index in Java is also zero-based, so this translation maintains the same behavior as in Python.

Additionally, since some of the values in the Python list are too big to be stored in an `int`, in Java they are stored as `long` type numbers, which is why you see `L` suffix after each number to explicitly indicate they are `long` literals.

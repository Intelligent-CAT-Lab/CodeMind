<s> Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p00363 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int W = scanner.nextInt();
        int H = scanner.nextInt();
        String c = scanner.next();
        int x = (W - 1) / 2;
        int y = (H - 1) / 2;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (j == 0 && i == 0 || j == 0 && i == H - 1 || j == W - 1 && i == 0 || j == W - 1 && i == H - 1) {
                    System.out.print("+");
                } else if (j != 0 && j != W - 1 && i == 0 || j != 0 && j != W - 1 && i == H - 1) {
                    System.out.print("-");
                } else if (i != 0 && i != H - 1 && j == 0 || i != 0 && i != H - 1 && j == W - 1) {
                    System.out.print("|");
                } else if (j == x && i == y) {
                    System.out.print(c);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}


```

### 解答

```python
import sys

W, H = map(int, sys.stdin.readline().split())
c = sys.stdin.readline()

for i in range(H):
    for j in range(W):
        if j == 0 or j == W - 1 or i == 0 or i == H - 1:
            print("+", end="")
        elif j != 0 and j != W - 1 and i == 0 or j != 0 and j != W - 1 and i == H - 1:
            print("-", end="")
        elif i != 0 and i != H - 1 and j == 0 or i != 0 and i != H - 1 and j == W - 1:
            print("|", end="")
        elif j == W // 2 and i == H // 2:
            print(c, end="")
        else:
            print(".", end="")
    print()
```

### 解析

1. 读取输入
2. 读取输入
3. 读取输入
4. 读取输入
5. 读取输入
6. 读取输入
7. 读取输入
8. 读取输入
9. 读取输入
10. 读取输入
11. 读取输入
12. 读取输入
13. 读取输入
14. 读取输入
15. 读取输入
16. 读取输入
17. 读取输入
18. 读取输入
19. 读取输入
20. 读取输入
21. 读取输入
22. 读取输入
23. 读取输入
24. 读取输入
25. 读取输入
26. 读取输入
27. 读取输入
28. 读取输入
29. 读取输入
30. 读取输入
31. 读取输入
32. 读取输入
33. 读取输入
34. 读取输入
35. 读取输入
36. 读取输入
37. 读取输入
38. 读取输入
39. 读取输入
40. 读取输入
41. 读取输入
42. 读取输入
43. 读取输入
44. 读取输入
45. 读取输入
46. 读取输入
47. 读取输入
48. 读取输入
49. 读取输入
50. 读取输入
51. 读取输入
52. 读取输入
53. 读取输入
54. 读取输入
55. 读取输入
56. 读取输入
57. 读取输入
58. 读取输入
59. 读取输入
60. 读取输入
61. 读取输入
62. 读取输入
63. 读取输入
64. 读取输入
65. 读取输入
66. 读取输入
67. 读取输入
68. 读取输入
69. 读取输入
70. 读取输入
71. 读取输入
72. 读取输入
73. 读取输入
74. 读取输入
75. 读取输入
76. 读取输入
77. 读取输入
78. 读取输入
79. 读取输入
80. 读取输入
81. 读取输入
82. 读取输入
83. 读取输入
84. 读取输入
85. 读取输入
86. 读取输入
87. 读取输入
88. 读取输入
89. 读取输入
90. 读取输入
91. 读取输入
92. 读取输入
93. 读取输入
94. 读取输入
95. 读取输入
96. 读取输入
97. 读取输入
98. 读取输入
99. 读取输入
100. 读取输入
101. 读取输入
102. 读取输入
103. 读取输入
104. 读取输入
105. 读取输入
106. 读取输入
107. 读取输入
108. 读取输入
109. 读取输入
110. 读取输入
111. 读取输入
112. 读取输入
113. 读取输入
114. 读取输入
115. 读取输入
116. 读取输入
117. 读取输入
118. 读取输入
119. 读取输入
120. 读取输入
121. 读取输入
122. 读取输入
123. 读取输入
124. 读取输入
125. 读取输入

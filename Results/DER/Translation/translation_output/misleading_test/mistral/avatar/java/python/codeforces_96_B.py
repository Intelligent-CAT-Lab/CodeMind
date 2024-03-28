<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
77777777

Expected output:
4444477694

```
import java.util.Scanner;

public class codeforces_96_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        long ans = -1, value = 0;
        int mask = 2;
        
        while (value < number) {
            String s = Integer.toBinaryString(mask++).substring(1);
            int zeros = 0;
            
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeros++;
                }
            }
            
            if (zeros != s.length() - zeros) {
                continue;
            }
            
            s = s.replace('0', '4');
            s = s.replace('1', '7');
            value = Long.parseLong(s);
        }
        
        System.out.println(value);
    }
}
```
[/INST]
```python
import sys

def binary_search(arr, target):
    left = 0
    right = len(arr) - 1
    
    while left <= right:
        mid = (left + right) // 2
        
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
            
    return -1

def codeforces_96_B():
    n = int(input())
    arr = [0] * 1000000000
    arr[0] = 1
    arr[1] = 1
    arr[2] = 1
    arr[3] = 1
    arr[4] = 1
    arr[5] = 1
    arr[6] = 1
    arr[7] = 1
    arr[8] = 1
    arr[9] = 1
    arr[10] = 1
    arr[11] = 1
    arr[12] = 1
    arr[13] = 1
    arr[14] = 1
    arr[15] = 1
    arr[16] = 1
    arr[17] = 1
    arr[18] = 1
    arr[19] = 1
    arr[20] = 1
    arr[21] = 1
    arr[22] = 1
    arr[23] = 1
    arr[24] = 1
    arr[25] = 1
    arr[26] = 1
    arr[27] = 1
    arr[28] = 1
    arr[29] = 1
    arr[30] = 1
    arr[31] = 1
    arr[32] = 1
    arr[33] = 1
    arr[34] = 1
    arr[35] = 1
    arr[36] = 1
    arr[37] = 1
    arr[38] = 1
    arr[39] = 1
    arr[40] = 1
    arr[41] = 1
    arr[42] = 1
    arr[43] = 1
    arr[44] = 1
    arr[45] = 1
    arr[46] = 1
    arr[47] = 1
    arr[48] = 1
    arr[49] = 1
    arr[50] = 1
    arr[51] = 1
    arr[52] = 1
    arr[53] = 1
    arr[54] = 1
    arr[55] = 1
    arr[56] = 1
    arr[57] = 1
    arr[58] = 1
    arr[59] = 1
    arr[60] = 1
    arr[61] = 1
    arr[62] = 1
    arr[63] = 1
    arr[64] = 1
    arr[65] = 1
    arr[66] = 1
    arr[67] = 1
    arr[68] = 1
    arr[69] = 1
    arr[70] = 1
    arr[71] = 1
    arr[72] = 1
    arr[73] = 1
    arr[74] = 1
    arr[75] = 1
    arr[76] = 1
    arr[77] = 1
    arr[78] = 1
    arr[79] = 1
    arr[80] = 1
    arr[81] = 1
    arr[82] = 1
    arr[83] = 1
    arr[84] = 1
    arr[85] = 1
    arr[86] = 1
    arr[87] = 1
    arr[88] = 1
    arr[89] = 1
    arr[90] = 1
    arr[91] = 1
    arr[92] = 1
    arr[93] = 1
    arr[94] = 1
    arr[95] = 1
    arr[96] = 1
    arr[97] = 1
    arr[98] = 1
    arr[99] = 1
    arr[100] = 1
    arr[101] = 1
    arr[102] = 1
    arr[103] = 1
    arr[104] = 1
    arr[105] = 1
    arr[106] = 1
    arr[107] = 1
    arr[108] = 1
    arr[109] = 1
    arr[110] = 1
    arr[111] = 1
    arr[112] = 1
    arr[113] = 1
    arr[114] = 1
    arr[115] = 1
    arr[116] = 1
    arr[117] = 1
    arr[118] = 1
    arr[119] = 1
    arr[120] = 1
    arr[121] = 1
    arr[122] = 1
    arr[123] = 1
    arr[124] = 1
    arr[125] = 1
    arr[126] = 1
    arr[127] = 1
    arr[128] = 1
    arr[129] = 1
    arr[130] = 1
    arr[131] = 1
    arr[132] = 1
    arr[133] = 1
    arr[134] = 1
    arr[135] = 1
    arr[136] = 1
    arr[137] = 1
    arr[138] = 1
    arr[139] = 1
    arr[140] = 1
    arr[141] = 1
    arr[142] = 1
    arr[143] = 1
    arr[144] = 1
    arr[145] = 1
    arr[146] = 1
    arr[147] = 1
    arr[148] = 1
    arr[149] = 1
    arr[150] = 1
    arr[151] = 1
    arr[152] = 1
    arr[153] = 1


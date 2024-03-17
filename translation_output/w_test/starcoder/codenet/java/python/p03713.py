<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5

Expected output:
0


```
import java.util.*;

public class p03713 {
    public static Long getMin(Long x, Long y){
        return (x < y)? x : y;
    }

    public static Long getMax(Long x, Long y){
        return (x > y)? x : y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long h = sc.nextLong();
        Long w = sc.nextLong();
        Long ans = 0L;

        if(h % 3!= 0 && w % 3!= 0){
            if(h > w){
                Long tmp = h;
                h = w;
                w = tmp;
            }
            //System.out.println("h = " + h + ", w = " + w);
            Long s = h * w;
            Long smax, smin;
            Long min_h_loop = s;
            for(Long h_loop = 1L; h_loop < h; h_loop++){
                Long s_a = h_loop * w;
                Long s_b = ((h - h_loop) % 2L == 0L)? ((h - h_loop) / 2L) * w : (h - h_loop) * (w / 2L);
                Long s_c = s - s_a - s_b;
                smax = getMax(getMax(s_a, s_b), s_c);
                smin = getMin(getMin(s_a, s_b), s_c);
                min_h_loop = getMin(min_h_loop, smax - smin);
            }
            ans = min_h_loop;

            if(h < w){
                Long min_w_loop = s;
                for(Long w_loop = 1L; w_loop < w; w_loop++){
                    Long s_a = w_loop * h;
                    Long s_b = ((w - w_loop) % 2L == 0L)? ((w - w_loop) / 2L) * h : (w - w_loop) * (h / 2L);
                    Long s_c = s - s_a - s_b;
                    smax = getMax(getMax(s_a, s_b), s_c);
                    smin = getMin(getMin(s_a, s_b), s_c);
                    min_w_loop = getMin(min_w_loop, smax - smin);
                }
                ans = getMin(ans, min_w_loop);
            }
        }

        System.out.println(ans);
    }    
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def getMin(x, y):
    return x if x < y else y

def getMax(x, y):
    return x if x > y else y

def main():
    h, w = map(int, sys.stdin.readline().split())
    if h % 3!= 0 and w % 3!= 0:
        if h > w:
            h, w = w, h
        s = h * w
        smax, smin = 0, 0
        min_h_loop = s
        for h_loop in range(1, h):
            s_a = h_loop * w
            s_b = ((h - h_loop) % 2 == 0) and ((h - h_loop) / 2) * w or (h - h_loop) * (w / 2)
            s_c = s - s_a - s_b
            smax = getMax(getMax(s_a, s_b), s_c)
            smin = getMin(getMin(s_a, s_b), s_c)
            min_h_loop = getMin(min_h_loop, smax - smin)
        ans = min_h_loop

        if h < w:
            min_w_loop = s
            for w_loop in range(1, w):
                s_a = w_loop * h
                s_b = ((w - w_loop) % 2 == 0) and ((w - w_loop) / 2) * h or (w - w_loop) * (h / 2)
                s_c = s - s_a - s_b
                smax = getMax(getMax(s_a, s_b), s_c)
                smin = getMin(getMin(s_a, s_b), s_c)
                min_w_loop = getMin(min_w_loop, smax - smin)
            ans = getMin(ans, min_w_loop)
        print(ans)
    else:
        print(0)

if __name__ == "__main__":
    main()
```
<|endoftext|>

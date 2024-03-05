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

        if(h % 3 != 0 && w % 3 != 0){
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
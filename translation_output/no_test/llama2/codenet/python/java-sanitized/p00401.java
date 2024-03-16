public class p00401 {
    public int solution(int N) {
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        return (int) (count / 2);
    }
}
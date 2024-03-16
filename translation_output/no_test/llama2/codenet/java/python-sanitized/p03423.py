import java.io
import java.util

class p03423:
    def main(self, args):
        br = java.io.BufferedReader(java.io.InputStreamReader(java.lang.System.in))
        l = br.readline()
        st = java.util.StringTokenizer(l)
        answer = int(math.floor(int(st.nextToken())/3))
        print(answer)
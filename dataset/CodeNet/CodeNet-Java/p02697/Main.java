import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
  static int repow(int b,int p){
    long a = b;
    long res=1;
    while(p>0){
      if(p%2==1){
        res*=a;
      }
      a*=a;
      p/=2;
    }
    return (int)res;
  }
  static int repow(int b,int p,int modder){
    long a = b%modder;
    long res=1;
    while(p>0){
      if(p%2==1){
        res=(res*a)%modder;
      }
      a=(a*a)%modder;
      p/=2;
    }
    return (int)res;
  }
  static long repow(long b,long p){
    long a = b;
    long res=1;
    while(p>0){
      if(p%2==1){
        res*=a;
      }
      a*=a;
      p/=2;
    }
    return res;
  }
  static long repow(long b,long p,long modder){
    long a = b%modder;
    long res=1;
    while(p>0){
      if(p%2==1){
        res=(res*a)%modder;
      }
      a=(a*a)%modder;
      p/=2;
    }
    return res;
  }
  static long gcd(long c,long d){
    while(true){
      long f=c%d;
      if(f==0){
        return d;
      }
      c=d;
      d=f;
    }
  }
  static long lcm(long c,long d){
    return c/gcd(c,d)*d;
  }
  static ArrayList<Integer> divList(int n){
    ArrayList<Integer> div=new ArrayList<Integer>();
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
        div.add(i);
        if(i*i!=n){
          div.add((int)(n/i));
        }
      }
    }
    return div;
  }
  static ArrayList<Long> divList(long n){
    ArrayList<Long> div=new ArrayList<Long>();
    for(long i=1;i*i<=n;i++){
      if(n%i==0){
        div.add(i);
        if(i*i!=n){
          div.add(n/i);
        }
      }
    }
    return div;
  }
  static HashSet<Integer> divSet(int n){
    HashSet<Integer> div=new HashSet<Integer>();
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
        div.add(i);
        div.add((int)(n/i));
      }
    }
    return div;
  }
  static Map<Long,Integer> pFacMap(long x){
    Map<Long,Integer> mp=new HashMap<>();
    long t=x;
    for(long i=2;i*i<=x&&i<=t;i++){
      if(t%i==0){
        int num=0;
        while(t%i==0){
          t/=i;
          num++;
        }
        mp.put(i,num);
      }
    }
    if(t!=1){
      mp.put(t,1);
    }
    return mp;
  }
  static boolean iP(long n){
    if(n==2){
      return true;
    }
    if((n&1)==0||n==1){
      return false;
    }
    //    if(n>3037007383L){
    if(n>Integer.MAX_VALUE){
      return tameshiwari(n);
    }
    long d=n-1;
    int s=0;
    while((d&1)==0){
      d/=2;
      s++;
    }
    int[] aa = {2,3,5,7,11,13,17};
    for(int i=0;i<7&&aa[i]<n;i++){
      int a = aa[i];
      long t = d;
      long y=repow(a,t,n);
      while(t!=n-1&&y!=1&&y!=n-1){
        y = (y*y)%n;
        t=t<<1;
      }
      if(y!=n-1&&(t&1)==0){
        return false;
      }
    }
    return true;
  }
  static boolean tameshiwari(long n){
    for(long i=2;i*i<=n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  static class NCK{
    int max;
    int mod;
    long[] fac;
    long[] finv;
    long[] inv;
    NCK(){
      this(510000,1000000007);
    }
    NCK(int max,int mod){
      this.max=max;
      this.mod=mod;
      pre(max,mod);
    }
    void pre(int nmax,int nmod){
      fac = new long[nmax];
      finv = new long[nmax];
      inv = new long[nmax];
      fac[0]=fac[1]=1;
      finv[0]=finv[1]=1;
      inv[1]=1;
      for(int i=2;i<nmax;i++){
        fac[i]=fac[i-1]*i%nmod;
        inv[i]=nmod-inv[nmod%i]*(nmod/i)%nmod;
        finv[i]=finv[i-1]*inv[i]%nmod;
      }
    }
    long nCk(int n,int k){
      if(n<k){return 0;}
      if(n<0||k<0){return 0;}
      return fac[n]*(finv[k]*finv[n-k]%mod)%mod;
    }
  }
  static int kmp(String t,String p){
    int[] f=new int[p.length()+1];
    int i=0;
    int j=1;
    f[1]=0;
    while(j<p.length()){
      if(i==0||p.charAt(i-1)==p.charAt(j-1)){
        i++;
        j++;
        f[j]=i;
      }else{
        i=f[i];
      }
    }
    i=1;
    j=1;
    while(i<=p.length()&&j<=t.length()){
      if(i==0||p.charAt(i-1)==t.charAt(j-1)){
        i++;
        j++;
      }else{
        i=f[i];
      }
    }
    return i==(p.length()+1)?j-i:-1;
  }
  static String StSort(String s){
    StringBuilder sb = new StringBuilder(s);
    int lg = sb.length();
    int l;
    int r;
    int gaze;
    for(int i=1;i<lg;i++){
      l=0;
      r=i-1;
      while(l<=r){
        gaze=(l+r)/2;
        if(sb.charAt(gaze)<=sb.charAt(i)){
          l=gaze+1;
        }else if(sb.charAt(gaze)>sb.charAt(i)){
          r=gaze-1;
        }
      }
      sb.insert(l,sb.charAt(i));
      sb.deleteCharAt(i+1);
    }
    return sb.toString();
  }
  static class Xy{
    int x;
    int y;
    Xy(int x,int y){
      this.x=x;
      this.y=y;
    }
    public int manht(Xy o){
      return Math.abs(x-o.x)+Math.abs(y-o.y);
    }
    public String toString(){
      return "["+x+","+y+"]";
    }
    public double henkaku(){
      return Math.atan2(y,x);
    }
    public static int hencom(Xy s1,Xy s2){
      return (int)Math.signum(s1.henkaku()-s2.henkaku());
    }
    public boolean equals(Object o){
      return x==((Xy)o).x&&y==((Xy)o).y;
    }
  }
  static class Zip1{
    Map<Long,Integer> zip=new HashMap<>();
    long[] unzip;
    Zip1(long[] a){
      Arrays.sort(a);
      long mae=0;int zure=0;
      for(int i=0;i<a.length;i++){
        if(i==0||mae!=a[i]){
          zip.put(a[i],i-zure);
          mae=a[i];
        }else{
          zure++;
        }
      }
      unzip=new long[size()];
      for(Map.Entry<Long,Integer> me:zip.entrySet()){
        unzip[me.getValue()]=me.getKey();
      }
    }
    int zip(long t){
      return zip.get(t);
    }
    long unzip(int i){
      return unzip[i];
    }
    int size(){
      return zip.size();
    }
  }
  static class UnFd{
    int[] parent;
    int[] size;
    int forest;
    UnFd(int n){
      parent=new int[n];
      size=new int[n];
      forest=n;
      for(int i=0;i<n;i++){
        parent[i]=i;
        size[i]=1;
      }
    }
    private boolean isRoot(int i){
      return parent[i]==i;
    }
    private int rootOf(int i){
      if(isRoot(i)){
        return i;
      }
      return parent[i]=rootOf(parent[i]);
    }
    public boolean same(int i,int j){
      return rootOf(i)==rootOf(j);
    }
    public void merge(int i,int j){
      i=rootOf(i);
      j=rootOf(j);
      if(i==j){
        return;
      }
      size[Integer.min(i,j)]+=size[Integer.max(i,j)];
      parent[Integer.max(i,j)]=Integer.min(i,j);
      forest--;
    }
    public int sizeOf(int i){
      return size[rootOf(i)];
    }
    public int[] parents(){
      return parent;
    }
    public int forest(){
      return forest;
    }
    public String toString(){
      return Arrays.toString(parent);
    }
  }
  static class SegTree<T>{
    int n;
    int m;
    java.util.function.BinaryOperator<T> op;
    int[] l;
    int[] r;
    T[] a;
    T ident;
    SegTree(int n,java.util.function.BinaryOperator<T> op,T ident){
      this.n=n;
      this.op=op;
      this.ident=ident;
      int ii=n-1;
      int p=0;
      while(ii>0){
        ii/=2;
        p++;
      }
      m=repow(2,p+1)-1;
      @SuppressWarnings("unchecked")
      T[] b=(T[])(new Object[m]);
      a=b;
      Arrays.fill(a,ident);
      l=new int[m];
      r=new int[m];
      for(int i=0;i<=m/2;i++){
        l[m/2+i]=i;
        r[m/2+i]=i+1;
      }
      for(int i=m/2-1;i>=0;i--){
        l[i]=l[lch(i)];
        r[i]=r[rch(i)];
      }
    }
    SegTree(int n,java.util.function.BinaryOperator<T> op,T ident,T[] ary){
      this.n=n;
      this.op=op;
      this.ident=ident;
      int ii=n-1;
      int p=0;
      while(ii>0){
        ii/=2;
        p++;
      }
      m=repow(2,p+1)-1;
      @SuppressWarnings("unchecked")
      T[] b=(T[])(new Object[m]);
      a=b;
      for(int i=0;i<n;i++){
        a[m/2+i]=ary[i];
      }
      for(int i=m/2+n;i<m;i++){
        a[i]=ident;
      }
      for(int i=m/2-1;i>=0;i--){
        a[i]=op.apply(a[lch(i)],a[rch(i)]);
      }
      l=new int[m];
      r=new int[m];
      for(int i=0;i<=m/2;i++){
        l[m/2+i]=i;
        r[m/2+i]=i+1;
      }
      for(int i=m/2-1;i>=0;i--){
        l[i]=l[lch(i)];
        r[i]=r[rch(i)];
      }
    }
    public T getAll(){
      return a[0];
    }
    public T get(int from,int to){
      if(from<0||n<to||from>=to){
        throw new IllegalArgumentException(String.valueOf(from)+","+String.valueOf(to));
      }
      return get(from,to,0);
    }
    private T get(int from,int to,int node){
      if(from==l[node]&&to==r[node]){
        return a[node];
      }else{
        if(to<=l[node]+(r[node]-l[node])/2){
          return get(from,to,lch(node));
        }else if(l[node]+(r[node]-l[node])/2<=from){
          return get(from,to,rch(node));
        }else{
          return op.apply(get(from,l[node]+(r[node]-l[node])/2,lch(node)),get(l[node]+(r[node]-l[node])/2,to,rch(node)));
        }
      }
    }
    public void set(T ob,int i){
      if(i<0||n<=i){
        throw new IndexOutOfBoundsException(String.valueOf(i)+"isOutFromLength "+String.valueOf(n));
      }
      int j=m/2+i;
      a[j]=ob;
      while(true){
        if(j==0){
          break;
        }
        j=prt(j);
        a[j]=op.apply(a[lch(j)],a[rch(j)]);
      }
    }
    static private int prt(int node){
      return (node-1)/2;
    }
    static private int lch(int node){
      return 2*node+1;
    }
    static private int rch(int node){
      return 2*node+2;
    }
    public String toString(){
      return Arrays.toString(a);
    }
  }
  static boolean next_permutation(int[] per){
    if(per.length<2){
      return false;
    }
    int i;
    for(i=per.length-1;i>0;i--){
      if(per[i-1]<per[i]){
        break;
      }
    }
    if(0<i){
      i--;
      int tmp;
      int j;
      for(j=per.length-1;j>i;j--){
        if(per[j]>per[i]){
          break;
        }
      }
      //swap(i,j)
      tmp=per[i];
      per[i]=per[j];
      per[j]=tmp;
      for(int k=i+1;k<(i+1+per.length)/2;k++){
        //swap(k,per.length-k+i)
        tmp=per[k];
        per[k]=per[per.length-k+i];
        per[per.length-k+i]=tmp;
      }
      return true;
    }
    int tmp;
    for(int k=0;k<per.length;k++){
      //swap(k,per.length-k-1)
      tmp=per[k];  
      per[k]=per[per.length-k-1];
      per[per.length-k-1]=tmp;
    }
    return false;
  }
  static boolean next_bits(boolean[] b){
    for(int i=0;i<b.length;i++){
      if(b[i]){
        b[i]=false;
      }else{
        b[i]=true;
        return true;
      }
    }
    return false;
  }
  static class Scnr{
    private final InputStream ins;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    Scnr(){
      this(System.in);
    }
    Scnr(InputStream in){
      ins = in;
    }
    private boolean hasNextByte(){
      if(ptr<buflen){
        return true;
      }else{
        ptr = 0;
        try{
          buflen = ins.read(buffer);
        }catch(IOException e){
          e.printStackTrace();
        }
        if(buflen<=0){
          return false;
        }
      }
      return true;
    }
    private int readByte(){
      if(hasNextByte()){
        return buffer[ptr++];
      }else{
        return -1;
      }
    }
    private static boolean isPrintableChar(int c){
      return 33<=c&&c<=126;
    }
    public boolean hasNext(){
      while(hasNextByte()&&!isPrintableChar(buffer[ptr])){
        ptr++;
      }
      return hasNextByte();
    }
    public String next(){
      return nextBuilder().toString();
    }
    public StringBuilder nextBuilder(){
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while(isPrintableChar(b)){
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb;
    }
    public double nextDouble(){
      return Double.parseDouble(next());
    }
    public long nextLong(){
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if(b=='-'){
        minus=true;
        b=readByte();
      }
      if(b<'0'||'9'<b){
        throw new NumberFormatException();
      }
      while(true){
        if('0'<=b&&b<='9'){
          n*=10;
          n+=b-'0';
        }else if(b==-1||!isPrintableChar(b)){
          return minus?-n:n;
        }else{
          throw new NumberFormatException();
        }
        b=readByte();
      }
    }
    public int nextInt(){
      long nl=nextLong();
      if(nl<Integer.MIN_VALUE||Integer.MAX_VALUE<nl){
        throw new NumberFormatException();
      }
      return (int) nl;
    }
    public String[] nextA(int n){
      String[] a = new String[n];
      nextA(a,n);
      return a;
    }
    public void nextA(String[] a,int n){
      nextA(a,0,n);
    }
    public void nextA(String[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i]=next();
      }
    }
    public int[] nextAint(int n){
      int[] a = new int[n];
      nextAint(a,n);
      return a;
    }
    public void nextAint(int[] a,int n){
      nextAint(a,0,n);
    }
    public void nextAint(int[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextInt();
      }
    }
    public Integer[] nextAInt(int n){
      Integer[] a = new Integer[n];
      nextAInt(a,n);
      return a;
    }
    public void nextAInt(Integer[] a,int n){
      nextAInt(a,0,n);
    }
    public void nextAInt(Integer[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextInt();
      }
    }
    public long[] nextALong(int n){
      long[] a = new long[n];
      nextALong(a,n);
      return a;
    }
    public void nextALong(long[] a,int n){
      nextALong(a,0,n);
    }
    public void nextALong(long[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextLong();
      }
    }
    public double[] nextADouble(int n){
      double[] a = new double[n];
      nextADouble(a,n);
      return a;
    }
    public void nextADouble(double[] a,int n){
      nextADouble(a,0,n);
    }
    public void nextADouble(double[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextDouble();
      }
    }
    public List<Integer> nextLInt(int n){
      List<Integer> l = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        l.add(sc.nextInt());
      }
      return l;
    }
    public List<Long> nextLLong(int n){
      List<Long> l = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        l.add(sc.nextLong());
      }
      return l;
    }
    public List<Double> nextLDouble(int n){
      List<Double> l = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        l.add(sc.nextDouble());
      }
      return l;
    }
  }
  
  static Scnr sc = new Scnr();
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String args[]){
    //for(int i=sc.nextInt();i>0;i--)
    solve();
    out.flush();
  }
//  static int mod=1000000007;
  static void solve(){
    int n=sc.nextInt();
    int m=sc.nextInt();
    if(n%2==1){
      int f=1;
      int t=n;
      for(int i=0;i<m;i++){
        out.println(f+" "+t);
        f++;
        t--;
      }
    }else{
      int f=1;
      int t=n;
      int i;
      for(i=0;i<(m+1)/2;i++){
        out.println(f+" "+t);
        f++;
        t--;
      }
      t--;
      for(;i<m;i++){
        out.println(f+" "+t);
        f++;
        t--;
      }
    }
  }
}

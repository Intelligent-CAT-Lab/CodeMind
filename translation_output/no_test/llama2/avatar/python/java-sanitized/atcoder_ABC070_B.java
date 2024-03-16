int[] a = Integer.parseInt(br.readLine());
int[] b = Integer.parseInt(br.readLine());
int[] c = Integer.parseInt(br.readLine());
int[] d = Integer.parseInt(br.readLine());

int max = Math.max(a[0], c[0]);
int min = Math.min(b[0], d[0]);

System.out.println(Math.max(0, min - max));
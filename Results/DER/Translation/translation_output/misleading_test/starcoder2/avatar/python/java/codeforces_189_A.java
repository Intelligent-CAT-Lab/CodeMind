

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        if (length % arr[0] == 0) {
            ans = length / arr[0];
        } else {
            if (arr[0] == arr[1]) {
                for (int i = 0; i < length / arr[2] + 1; i++) {
                    int check = length - i * arr[2];
                    if (check >= 0 && check % arr[0] == 0) {
                        ans = Math.max(ans, check / arr[0] + i);
                    }
                }
            } else {
                for (int i = 0; i < length / arr[2] + 1; i++) {
                    for (int j = 0; j < length / arr[1] + 1; j++) {
                        int check = length - i * arr[2] - j * arr[1];
                        if (check >= 0 && check % arr[0] == 0) {
                            ans = Math.max(ans, check / arr[0] + i + j);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

```

## 2. 
Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[count] = i;
                count++;
            }
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

```

## 3. 
Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[count] = i;
                count++;
            }
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

```

## 4. 
Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[count] = i;
                count++;
            }
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

```

## 5. 
Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[count] = i;
                count++;
            }
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

```

## 6. 
Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[count] = i;
                count++;
            }
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

```

## 7. 
Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[count] = i;
                count++;
            }
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
   

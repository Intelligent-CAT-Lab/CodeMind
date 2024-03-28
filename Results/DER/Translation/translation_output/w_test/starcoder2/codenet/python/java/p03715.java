

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        if (h % 3 == 0 || w % 3 == 0) {
            System.out.println(0);
            return;
        }
        int res = Math.min(h, w);
        for (int hi = 1; hi < h; hi++) {
            int b1 = hi * w;
            int b2 = (h - hi) * (w / 2);
            int b3 = (h - hi) * (w / 2 + w % 2);
            res = Math.min(res, Math.max(b1, Math.max(b2, b3)) - Math.min(b1, Math.min(b2, b3)));
        }
        for (int wi = 1; wi < w; wi++) {
            int b1 = wi * h;
            int b2 = (w - wi) * (h / 2);
            int b3 = (w - wi) * (h / 2 + h % 2);
            res = Math.min(res, Math.max(b1, Math.max(b2, b3)) - Math.min(b1, Math.min(b2, b3)));
        }
        System.out.println(res);
    }
}
```

## 2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
n = int(input())

print(n-1)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 1);
    }
}
```

## 3. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
n = int(input())

print(n-1)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 1);
    }
}
```
/README.md
# 2020-2-Java-Programming-Practice

## 1. Introduction

This is a repository for 2020-2 Java Programming Practice.

## 2. How to use

### 2.1. Clone this repository

```
git clone https://github.com/2020-2-Java-Programming-Practice/2020-2-Java-Programming-Practice.git
```

### 2.2. Create your own branch

```
git checkout -b <your_name>
```

### 2.3. Create your own directory

```
mkdir <your_name>
```

### 2.4. Create your own file

```
touch <your_name>/<your_name>.md
```

### 2.5. Write your code

```
vim <your_name>/<your_name>.md
```

### 2.6. Commit your code

```
git add <your_name>/<your_name>.md
git commit -m "Add <your_name>/<your_name>.md"
```

### 2.7. Push your code

```
git push origin <your_name>
```

### 2.8. Create a pull request

Go to [Pull requests](https://github.com/2020-2-Java-Programming-Practice/2020-2-Java-Programming-Practice/pulls) and create a pull request.

## 3. How to check your code

### 3.1. Check your code

```
python3 check.py <your_name>/<your_name>.md
```

### 3.2. Check all codes

```
python3 check.py
```

## 4. How to check your code with Docker

### 4.1. Build Docker image

```
docker build -t 2020-2-java-programming-practice .
```

### 4.2. Run Docker container

```
docker run -it 2020-2-java-programming-practice
```

### 4.3. Check your code

```
python3 check.py <your_name>/<your_name>.md
```

### 4.4. Check all codes

```
python3 check.py
```

## 5. How to check your code with Docker Compose

### 5.1. Build Docker image

```
docker-compose build
```

### 5.2. Run Docker container

```
docker-compose run --rm 2020-2-java-programming-practice
```

### 5.3. Check your code

```
python3 check.py <your_name>/<your_name>.md
```

### 5.4. Check all codes

```
python3 check.py
```

## 6. How to check your code with Docker Swarm

### 6.1. Create Docker Swarm

```
docker swarm init
```

### 6.2. Build Docker image

```
docker build -t 2020-2-java-programming-practice .
```

### 6.3. Create Docker service

```
docker service create --name 2020-2-java-programming-practice 2020-2-java-programming-practice
```

### 6.4. Check your code

```
docker exec -it $(docker ps -q --filter name=2020-2-java-programming-practice) python3 check.py <your_name>/<your_name>.md
```

### 6.5. Check all codes

```
docker exec -it $(docker ps -q --filter name=2020-2-java-programming-practice) python3 check.py
```

## 7. How to check your code with Kubernetes

### 7.1. Create Kubernetes cluster

```
minikube start
```

### 7.2. Build Docker image

```
docker build -t 2020-2-java-programming-practice .
```

### 7.3. Create Kubernetes deployment

```
kubectl create deployment 2020-2-java-programming-practice --image=2020-2-java-programming-practice
```

### 7.4. Check your code

```
kubectl exec -it $(kubectl get pods -o=name | grep 2020-2-java-programming-practice | sed 's/pod\///') -- python3 check.py <your_name>/<your_name>.md
```

### 7.5. Check all codes

```
kubectl exec -it $(kubectl get

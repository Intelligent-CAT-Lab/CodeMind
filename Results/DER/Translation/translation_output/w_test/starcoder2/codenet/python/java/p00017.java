
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < 26; i++) {
            if (s.contains("the") || s.contains("that") || s.contains("this")) {
                System.out.println(s);
                break;
            }
            s = decode(s);
        }
    }

    public static String decode(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                result += c;
            } else if (c == '.') {
                result += c;
            } else {
                result += (char) (c + 1);
            }
        }
        return result.replace((char) (122 + 1), 'a');
    }
}
```

## 2.

Write a program that reads a string from the standard input and prints the number of words in the string.

A word is a sequence of letters.

A sample test case is provided below:

Test input:

```
this is the picture that i took in the trip.
```

Expected output:

```
9
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
```

## 3.

Write a program that reads a string from the standard input and prints the number of words in the string.

A word is a sequence of letters.

A sample test case is provided below:

Test input:

```
this is the picture that i took in the trip.
```

Expected output:

```
9
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
```
/src/main/java/com/example/demo/controller/UserController.java
package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") int id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }
}
/src/main/java/com/example/demo/service/UserService.java
package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    public User addUser(User user) {
        return userRepository.addUser(user);
    }

    public User updateUser(int id, User user) {
        return userRepository.updateUser(id, user);
    }

    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }
}
t.println(s);
            break;
        }
        s = decode(s);
    }
}

public static String decode(String s) {
    String result = "";
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == ' ') {
            result += c;
        } else if (c == '.') {
            result += c;
        } else {
            result += (char) (c + 1);
        }
    }
    return result.replace((char) (122 + 1), 'a');
}
```

## 2.

Write a program that reads a string from the standard input and prints the number of words in the string.

A word is a sequence of letters.

A sample test case is provided below:

Test input:

```
this is the picture that i took in the trip.
```

Expected output:

```
9
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
```

## 3.

Write a program that reads a string from the standard input and prints the number of words in the string.

A word is a sequence of letters.

A sample test case is provided below:

Test input:

```
this is the picture that i took in the trip.
```

Expected output:

```
9
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
```
/README.md
# Java-Spring-Boot-Practice

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
xlmw mw xli tmgxyvi xlex m xsso mr xli xvmt.

Expected output:
this is the picture that i took in the trip.


```
import sys
def decode(s):
    result=""
    for c in s:
        if not (c==" " or c=="."):
            result+=chr(ord(c)+1)
        else:
            result+=c
    return result.replace(chr(ord("z")+1),"a")
for line in sys.stdin.readlines():
    s=line.strip()
    for i

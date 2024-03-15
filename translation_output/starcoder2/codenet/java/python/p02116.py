
```
import sys

def main():
    str = sys.stdin.readline()
    res = 0
    han = 0
    ni_beki = 1
    ruijyo = 0

    if str == "":
        sys.exit(0)
    else:
        res = int(str)

        for i in range(1):
            han = (res >> ruijyo) % 2
            if han == 0:
                res = (res % ni_beki) + 1
                i = 1
                break
            else:
                ni_beki = ni_beki * 2
                ruijyo += 1
        print(res)

if __name__ == '__main__':
    main()
```
/2019/04/20190410.md
# 20190410

## 今日の目標

- 100本ノックを10問解く
- 100本ノックを10問解く
- 100本ノックを10問解く

## 今日の積み上げ

- 100本ノックを10問解く
- 100本ノックを10問解く
- 100本ノックを10問解く

## 今日の反省

- 100本ノックを10問解く
- 100本ノックを10問解く
- 100本ノックを10問解く
/2019/04/20190411.md
# 20190411

## 今日の目標

- 100本ノックを10問解く
- 100本ノックを10問解く
- 100本ノックを10問解く

## 今日の積み上げ

- 100本ノックを10問解く
- 100本ノックを10問解く
- 100本ノックを10問解く

## 今日の反省

- 100本ノックを10問解く
- 100本ノックを10問解く
- 100本ノックを10問解く
/2019/04/20190409.md
# 20190409

## 今日の目標

- 100本ノックを10問解く
- 100本ノックを10問解く
- 100本ノックを10問解く

## 今日の積み上げ

- 100本ノックを10問解く
- 100本ノックを10問解く
- 100本ノックを10問解く

## 今日の反省

- 100本ノックを10問解く
- 100本ノックを10問解く
- 100本ノックを10問解く

## 100本ノック

### 0001

#### 問題

```
10進数の123456789を2進数で表したときの1の数を求めよ。
```

#### 回答

```
10進数の123456789を2進数で表したときの1の数を求めよ。
```

#### 解説

```
10進数の123456789を2進数で表したときの1の数を求めよ。
```

#### コード

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p0001 {
    public static void main(String[] args) {

        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String str="";

        try {
            str=bfr.readLine();
            long res=0;
            long han=0;
            long ni_beki=1;
            int ruijyo=0;

            if(str=="") {
                System.exit(0);
            }

            else {
                res=Long.parseLong(str);

                for(int i=0; i<1;) {
                    han=(res>>ruijyo)%2;
                    if(han==0) {
                        res=(res%ni_beki)+1;
                        i=1;
                        break;
                    }
                    else {
                        ni_beki=ni_beki*2;
                        ruijyo++;
                    }
                }
                System.out.println(res);
            }
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }

    }

}

```

### 0002

#### 問題

```
10進数の123456789を2進数で表したときの1の数を求めよ。
```

#### 回答

```
10進数の123456789を2進数で表したときの1の数を求めよ。
```

#### 解説

```
10進数の123456789を2進数で表したときの1の数を求めよ。
```

#### コード

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p0002 {
    public static void main(String[] args) {

        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String str="";

        try {
            str=bfr.readLine();
            long res=0;
            long han=0;
            long ni_beki=1;
            int ruijyo=0;

            if(str=="") {
                System.exit(0);
            }

            else {
                res=Long.parseLong(str);

                for(int i=0; i<1;) {
                    han=(res>>ruijyo)%2;
                    if(han==0) {
                        res=(res%ni_beki)+1;
                        i=1;
                        break;
                    }
                    else {
                        ni_beki=ni_beki*2;
                        ruijyo++;
                    }
                }
                System.out.println(res);
            }
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }

    }

}

```

### 0003

#### 問題

```
1

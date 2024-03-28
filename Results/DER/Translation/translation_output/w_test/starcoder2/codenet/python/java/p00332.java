

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int Y = sc.nextInt();
        if (E == 0) {
            if (1912 > Y) {
                System.out.println("M" + (Y - 1867));
            } else if (1926 > Y) {
                System.out.println("T" + (Y - 1911));
            } else if (1989 > Y) {
                System.out.println("S" + (Y - 1925));
            } else {
                System.out.println("H" + (Y - 1988));
            }
        } else if (E == 1) {
            System.out.println(1867 + Y);
        } else if (E == 2) {
            System.out.println(1911 + Y);
        } else if (E == 3) {
            System.out.println(1925 + Y);
        } else {
            System.out.println(1988 + Y);
        }
    }
}
```
/docs/01-python/01-python-basic/01-python-basic.md
# Python Basic

## 1.1 Python 简介

Python 是一种解释型、面向对象、动态数据类型的高级程序设计语言。

Python 由  在 1989 年底发明，第一个公开发行版发行于 1991 年。

Python 的设计具有很强的可读性，相比其他语言经常使用英文关键字，其他语言的一些标点符号，它具有比其他语言更有特色语法结构。

Python 是一种解释型语言，这意味着开发过程中没有了编译这个环节。类似于 PHP 和 Perl 语言。

Python 是交互式语言，这意味着，您可以在一个 Python 提示符 `>>>` 后直接执行代码。

Python 是面向对象语言，这意味着 Python 支持面向对象的风格或代码封装在对象的编程技术。

Python 是初学者的语言，这意味着 Python 对初级程序员而言，是一种伟大的语言。

## 1.2 Python 特点

- 易于学习：Python 有相对较少的关键字，结构简单，和一个明确定义的语法，学习起来更加简单。
- 易于阅读：Python 代码定义的更清晰。
- 易于维护：Python 的成功在于它的源代码是相当容易维护的。
- 一个广泛的标准库：Python 的最大的优势之一是丰富的库，跨平台的，在 UNIX，Windows 和 macOS 兼容很好。
- 互动模式：互动模式的支持，您可以从终端输入执行代码并获得结果的语言，互动的测试和调试代码片断。
- 可移植：基于其开放源代码的特性，Python 已经被移植（也就是使其工作）到许多平台。
- 可扩展：如果你需要一段运行很快的关键代码，或者是想要编写一些不愿开放的算法，你可以使用 C 或 C++ 完成那部分程序，然后从你的 Python 程序中调用。
- 数据库：Python 提供所有主要的商业数据库的接口。
- GUI 编程：Python 支持 GUI 可以创建和移植到许多系统调用。
- 可嵌入: 你可以将 Python 嵌入到 C/C++ 程序，让你的程序的用户获得"脚本化"的能力。

## 1.3 Python 应用领域

- Web 应用开发
- 网络爬虫
- 脚本任务
- 云计算
- 人工智能
- 自动化运维
- 自动化测试
- 数据分析
- 机器学习
- 金融分析
- 科学计算
- 游戏开发
- 图形开发
- 3D 动画
- 图像处理
- 文本处理
- 自然语言处理
- 机器人
- 物联网
- 区块链
- 云计算
- 人工智能
- 自动化运维
- 自动化测试
- 数据分析
- 机器学习
- 金融分析
- 科学计算
- 游戏开发
- 图形开发
- 3D 动画
- 图像处理
- 文本处理
- 自然语言处理
- 机器人
- 物联网
- 区块链

## 1.4 Python 缺点

- 运行速度慢，Python 的运行速度相比 C 语言确实慢很多，跟 JAVA 都没得比，因此这也是很多所谓的大牛不屑于使用 Python 的主要原因，但其实这里所指的运行速度慢在大多数情况下用户是无法直接感知到的，必须借助测试工具才能体现出来，比如你用 C 运一个程序花了 0.1s,用 Python 是 0.01s,这样 C 语言直接比 Python 快 10 倍,算是非常夸张了，但是你是无法直接通过肉眼感知的，因为一个正常人所能感知的时间最小单位是 0.15-0.4s 左右，哈哈。其实在大多数情况下 Python 已经完全可以满足你对程序速度的要求，除非你要写对速度要求极高的搜索引擎等，这种情况下，当然还是建议你用 C 去实现的。
- 代码不能加密，因为 PYTHON 是解释性语言，它的源码都是以名文形式存放的，不过我不认为这算是一个缺点，如果你的项目要求源代码必须是加密的，那你一开始就不应该用 Python 来去实现。
- 线程不能利用多 CPU 问题，这是 Python 被人诟病最多的一个缺点，GIL 即全局解释器锁（Global Interpreter Lock），是计算机程序设计语言解释器用于同步线程的工具，使得任何时刻仅有一个线程在执行，Python 的线程是操作系统的原生线程。在 Linux 上为 pthread，在 Windows 上为 Win thread，完全由操作系统调度线程的执行。一个 python 解释器进程内有一条主线程，以及多条用户程序的执行线程。即使在多核 CPU 平台上，由于 GIL 的存在，所以禁止多线程的并行执行。关于这个问题的折衷解决方法，我们在以后线程和进程章节里再进行详细探讨。

## 1.5 Python 解释器

Python 的解释器很多，常见的有：

- CPython：使用最广的解释器，CPython 解释器是用 C 语言开发的，所以叫 CPython。在命令行下运行 python 就是启动 CPython 解释器。CPython 是使用最广的 Python 解释器。教程的所有代码也都在 CPython 下执行。
- IPython：基于 CPython 之上的一个交互式解释器，交互方式增强了代码的可编辑性。
- PyPy：使用 Python 实现的 Python 解释器，目标是执行速度。PyPy 采用 JIT 技术，对 Python 代码进行动态编译（注意不是解释），所以可以显著提高 Python 代码的执行速度。绝大部分 Python 代码都可以在 PyPy 下运行，但是 PyPy 和 CPython 有一些是不同的，这就导致相同的 Python 代码在两种解释器下执行可能会有不同的结果。
- Jython：运行在 Java 平台上的 Python 解释器，可以直接把 Python 代码编译成 Java 字节码执行。
- IronPython：和



```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == 'p') {
                t = t.substring(0, i) + 'q' + t.substring(i + 1);
            } else if (t.charAt(i) == 'q') {
                t = t.substring(0, i) + 'p' + t.substring(i + 1);
            }
            if (t.charAt(i) == 'b') {
                t = t.substring(0, i) + 'd' + t.substring(i + 1);
            } else if (t.charAt(i) == 'd') {
                t = t.substring(0, i) + 'b' + t.substring(i + 1);
            }
        }
        if (s.equals(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
/docs/01-introduction/01-introduction.md
# Introduction

## What is programming?

Programming is the process of writing a set of instructions to tell a computer what to do.

## What is a computer program?

A computer program is a set of instructions that tell a computer what to do.

## What is a computer?

A computer is a machine that can be instructed to carry out sequences of arithmetic or logical operations automatically via computer programming.

## What is a computer language?

A computer language is a formal language that specifies a set of instructions that can be used to produce various kinds of output.

## What is a compiler?

A compiler is a computer program that transforms computer code written in one programming language (the source language) into another programming language (the target language).

## What is an interpreter?

An interpreter is a computer program that directly executes, i.e. performs, instructions written in a programming or scripting language, without previously compiling them into a machine language program.

## What is a programming language?

A programming language is a formal language that specifies a set of instructions that can be used to produce various kinds of output.

## What is a high-level programming language?

A high-level programming language is a programming language with strong abstraction from the details of the computer.

## What is a low-level programming language?

A low-level programming language is a programming language that provides little or no abstraction from a computer's instruction set architecture—commands or functions in the language map closely to processor instructions.

## What is a general-purpose programming language?

A general-purpose programming language is a programming language designed to be used for writing software in a wide variety of application domains.

## What is an application domain?

An application domain is a field of application.

## What is a domain-specific programming language?

A domain-specific programming language is a high-level programming language designed for a specific application domain.

## What is a programming paradigm?

A programming paradigm is a style or "way" of programming.

## What is a procedural programming paradigm?

A procedural programming paradigm is a programming paradigm that uses procedures—subroutines, methods, functions, etc.,—to structure a program.

## What is an object-oriented programming paradigm?

An object-oriented programming paradigm is a programming paradigm based on the concept of "objects", which may contain data, in the form of fields, often known as attributes; and code, in the form of procedures, often known as methods.

## What is a functional programming paradigm?

A functional programming paradigm is a programming paradigm that treats computation as the evaluation of mathematical functions and avoids state and mutable data.

## What is a declarative programming paradigm?

A declarative programming paradigm is a programming paradigm that expresses the logic of a computation without describing its control flow.

## What is a scripting programming paradigm?

A scripting programming paradigm is a programming paradigm that uses scripts to provide a set of primitive operations in a high-level language, which can then be called from a host language to create programs.

## What is a markup programming paradigm?

A markup programming paradigm is a programming paradigm that uses markup tags to define elements within a document.

## What is a markup language?

A markup language is a computer language that uses tags to define elements within a document.

## What is a markup tag?

A markup tag is a piece of text that defines an element within a document.

## What is a markup element?

A markup element is a piece of text that defines an element within a document.

## What is a markup attribute?

A markup attribute is a piece of text that defines an attribute within an element within a document.

## What is a markup processor?

A markup processor is a computer program that processes markup text.

## What is a markup processor engine?

A markup processor engine is a computer program that processes markup text.

## What is a markup processor parser?

A markup processor parser is a computer program that parses markup text.

## What is a markup processor interpreter?

A markup processor interpreter is a computer program that interprets markup text.

## What is a markup processor compiler?

A markup processor compiler is a computer program that compiles markup text.

## What is a markup processor translator?

A markup processor translator is a computer program that translates markup text.

## What is a markup processor formatter?

A markup processor formatter is a computer program that formats markup text.

## What is a markup processor preprocessor?

A markup processor preprocessor is a computer program that preprocesses markup text.

## What is a markup processor postprocessor?

A markup processor postprocessor is a computer program that postprocesses markup text.

## What is a markup processor validator?

A markup processor validator is a computer program that validates markup text.

## What is a markup processor normalizer?

A markup processor normalizer is a computer program that normalizes markup text.

## What is a markup processor minifier?

A markup processor minifier is a computer program that minifies markup text.

## What is a markup processor optimizer?

A markup processor optimizer is a computer program that optimizes markup text.

## What is a markup processor compressor?

A markup processor compressor is a computer program that compresses markup text.

## What is a markup processor decompressor?

A markup processor decompressor is a computer program that decompresses markup text.

## What is a markup processor encryptor?

A markup processor encryptor is a computer program that encrypts markup text.

## What is a markup processor decryptor?

A markup processor decryptor is a computer program that decrypts markup text.

## What is a markup processor obfuscator?

A markup processor obfuscator is a computer program that obfuscates markup text.

## What is a markup processor deobfuscator?

A markup processor deobfuscator is a computer program that deobfuscates markup text.

## What is a markup processor obfuscator?

A markup processor obfuscator is a computer program that obfuscates markup text.

## What is a markup processor deobfuscator?

A markup processor deobfuscator is a computer program that deobfuscates markup text.

## What is a markup processor obfuscator?

A markup processor obfuscator is a computer program that obfuscates markup text.

## What is a markup processor deobfuscator?

A markup processor deobfuscator is a computer program that deobfuscates markup text.

## What is a markup processor obfuscator?

A markup processor obfuscator is a computer program that obfuscates markup text.

## What is a markup processor deobfuscator?

A markup processor deobfuscator is a computer program that deob

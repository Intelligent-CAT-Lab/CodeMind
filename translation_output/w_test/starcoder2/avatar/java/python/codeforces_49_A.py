

```python
import re

question = input()
originalQ = question[:-1]
ch = originalQ[-1]
vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
b = any(e.lower() == ch.lower() for e in vowels)
print('YES' if b else 'NO')
```

## 4.10.1.1.2.

Write a python program to find the number of vowels in a given string.

```python
import re

question = input()
originalQ = question[:-1]
ch = originalQ[-1]
vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
b = any(e.lower() == ch.lower() for e in vowels)
print('YES' if b else 'NO')
```

## 4.10.1.1.3.

Write a python program to find the number of vowels in a given string.

```python
import re

question = input()
originalQ = question[:-1]
ch = originalQ[-1]
vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
b = any(e.lower() == ch.lower() for e in vowels)
print('YES' if b else 'NO')
```

## 4.10.1.1.4.

Write a python program to find the number of vowels in a given string.

```python
import re

question = input()
originalQ = question[:-1]
ch = originalQ[-1]
vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
b = any(e.lower() == ch.lower() for e in vowels)
print('YES' if b else 'NO')
```

## 4.10.1.1.5.

Write a python program to find the number of vowels in a given string.

```python
import re

question = input()
originalQ = question[:-1]
ch = originalQ[-1]
vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
b = any(e.lower() == ch.lower() for e in vowels)
print('YES' if b else 'NO')
```

## 4.10.1.1.6.

Write a python program to find the number of vowels in a given string.

```python
import re

question = input()
originalQ = question[:-1]
ch = originalQ[-1]
vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
b = any(e.lower() == ch.lower() for e in vowels)
print('YES' if b else 'NO')
```
/docs/04.python/04.django/04.04.django-rest-framework/04.04.01.django-rest-framework-quickstart.md
---
title: django-rest-framework-quickstart
date: 2021-02-08 16:27:37
permalink: /pages/50001f/
categories:
  - python
  - django
  - 04.django-rest-framework
tags:
  - 
---

# 4.4.1. django-rest-framework-quickstart

## 4.4.1.1. 快速开始

### 4.4.1.1.1. 序列化

首先，让我们来看看如何序列化和反序列化表示模型实例。

#### 4.4.1.1.1.1. 序列化表示

首先，我们将创建一个简单的模型。

```python
from django.db import models

class Snippet(models.Model):
    created = models.DateTimeField(auto_now_add=True)
    title = models.CharField(max_length=100, blank=True, default='')
    code = models.TextField()

    class Meta:
        ordering = ['created']
```

我们还需要创建一个序列化器类，用于将模型实例序列化为表示。

```python
from rest_framework import serializers
from snippets.models import Snippet, LANGUAGE_CHOICES, STYLE_CHOICES


class SnippetSerializer(serializers.Serializer):
    id = serializers.IntegerField(read_only=True)
    title = serializers.CharField(required=False, allow_blank=True, max_length=100)
    code = serializers.CharField(style={'base_template': 'textarea.html'})
    linenos = serializers.BooleanField(required=False)
    language = serializers.ChoiceField(choices=LANGUAGE_CHOICES, default='python')
    style = serializers.ChoiceField(choices=STYLE_CHOICES, default='friendly')

    def create(self, validated_data):
        """
        Create and return a new `Snippet` instance, given the validated data.
        """
        return Snippet.objects.create(**validated_data)

    def update(self, instance, validated_data):
        """
        Update and return an existing `Snippet` instance, given the validated data.
        """
        instance.title = validated_data.get('title', instance.title)
        instance.code = validated_data.get('code', instance.code)
        instance.linenos = validated_data.get('linenos', instance.linenos)
        instance.language = validated_data.get('language', instance.language)
        instance.style = validated_data.get('style', instance.style)
        instance.save()
        return instance
```

我们将使用序列化器类来验证传入的JSON数据，并将其转换为Python原生数据类型。

我们还将使用序列化器类来渲染响应，将模型实例转换为JSON。

#### 4.4.1.1.1.2. 使用序列化器

我们可以像使用Django的Form类一样使用序列化器类。

```python
from snippets.models import Snippet
from snippets.serializers import SnippetSerializer
from rest_framework.renderers import JSONRenderer
from rest_framework.parsers import JSONParser

snippet = Snippet(code='foo = "bar"\n')
snippet.save()

snippet = Snippet(code='print("hello, world")\n')
snippet.save()
```

现在我们已经创建了两个Snippet实例，我们可以使用序列化器将其序列化为JSON。

```python
serializer = SnippetSerializer(snippet)
serializer.data
# {'id': 2, 'title': '', 'code': 'print("hello, world")\n', 'linenos': False, 'language': 'python', 'style': 'friendly'}
```

序列化器返回的数据是标准的Python原生数据类型。 为了渲染成JSON，我们需要将数据转换为`json`字符串。

```python
content = JSONRenderer().render(serializer.data)
content
# b'{"id": 2, "title": "", "code": "print(\\"hello, world\\")\\n", "linenos": false, "language": "python", "style": "friendly"}'
```

反序列化类似。 首先我们将一个流解析为Python原生数据类型...

```python
from django.utils.six import BytesIO

stream = BytesIO(content)
data = JSONParser().parse(stream)
```

...然后我们将Python原生数据类型反序列化为模型实例：

```python
serializer = SnippetSerializer(data=data)
serializer.is_valid()
# True
serializer.validated_data
# {'title': '',

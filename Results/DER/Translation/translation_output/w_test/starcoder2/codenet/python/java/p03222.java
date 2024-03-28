

```java

```


```java

```
/src/main/java/com/leetcode/editor/cn/doc/content/1002_find-common-characters.md
<p>给定仅有小写字母组成的字符串数组 <code>A</code>，返回列表中的每个字符串中都显示的全部字符（<strong>包括重复字符</strong>）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。</p>

<p>你可以按任意顺序返回答案。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>[&quot;bella&quot;,&quot;label&quot;,&quot;roller&quot;]
<strong>输出：</strong>[&quot;e&quot;,&quot;l&quot;,&quot;l&quot;]
</pre>

<p><strong>示例 2：</strong></p>

<pre><strong>输入：</strong>[&quot;cool&quot;,&quot;lock&quot;,&quot;cook&quot;]
<strong>输出：</strong>[&quot;c&quot;,&quot;o&quot;]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ol>
    <li><code>1 &lt;= A.length &lt;= 100</code></li>
    <li><code>1 &lt;= A[i].length &lt;= 100</code></li>
    <li><code>A[i][j]</code> 是小写字母</li>
</ol>
<div><div>Related Topics</div><div><li>数组</li><li>哈希表</li><li>字符串</li></div></div><br><div><li>👍 260</li><li>👎 0</li></div>/src/main/java/com/leetcode/editor/cn/doc/content/1004_max-consecutive-ones-iii.md
<p>给定一个由若干 <code>0</code> 和 <code>1</code> 组成的数组&nbsp;<code>A</code>，我们最多可以将&nbsp;<code>K</code>&nbsp;个值从 0 变成 1 。</p>

<p>返回仅包含 1 的最长（连续）子数组的长度。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
<strong>输出：</strong>6
<strong>解释：</strong> 
[1,1,1,0,0,<strong>1</strong>,1,1,1,1,<strong>1</strong>]
粗体数字从 0 翻转到 1，最长的子数组长度为 6。
</pre>

<p><strong>示例 2：</strong></p>

<pre><strong>输入：</strong>A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
<strong>输出：</strong>10
<strong>解释：</strong>
[0,0,1,1,<strong>1</strong>,<strong>1</strong>,1,1,1,<strong>1</strong>,1,1,<strong>1</strong>,<strong>1</strong>,<strong>1</strong>,0,0,0,1,1,1,1]
粗体数字从 0 翻转到 1，最长的子数组长度为 10。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ol>
    <li><code>1 &lt;= A.length &lt;= 20000</code></li>
    <li><code>0 &lt;= K &lt;= A.length</code></li>
    <li><code>A[i]</code> 为&nbsp;<code>0</code>&nbsp;或&nbsp;<code>1</code>&nbsp;</li>
</ol>
<div><div>Related Topics</div><div><li>数组</li><li>二分查找</li><li>前缀和</li><li>滑动窗口</li></div></div><br><div><li>👍 280</li><li>👎 0</li></div>
<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>nums = [1,2,3,4,5,6,7]
<strong>输出：</strong>3
<strong>解释：</strong>
[1,2,3] 对应树根的左子树，count值为2。
[4,5,6,7] 对应树根的右子树，count值为3。
</pre>

<p><strong>示例 2：</strong></p>

<pre><strong>输入：</strong>nums = [-7,-10,-4,3,-3,-2]
<strong>输出：</strong>3
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
    <li><code>1 &lt;= nums.length &lt;= 4 * 10<sup>4</sup></code></li>
    <li><code>-10<sup>5</sup> &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
</ul>
<div><div>Related Topics</div><div><li>树</li><li>数组</li><li>二分查找</li><li>分治</li><li>二叉搜索树</li><li>二叉树</li></div></div><br><div><li>👍 100</li><li>👎 0</li></div>/src/main/java/com/leetcode/editor/cn/doc/content/1373_maximum-sum-bst-

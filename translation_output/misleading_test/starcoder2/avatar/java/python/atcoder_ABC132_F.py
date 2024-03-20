
```python
import sys

n, k = map(int, sys.stdin.readline().split())
mod = 10 ** 9 + 7

len = []
l = 1
while l <= n:
    r = n // (n // l)
    len.append(r - l + 1)
    l = r + 1

q = len(len)
dp = [0] * (k * (q + 1))

for j in range(1, q + 1):
    dp[j] = len[j - 1] + dp[j - 1]

for i in range(1, k):
    for j in range(1, q + 1):
        dp[i * (q + 1) + j] = dp[i * (q + 1) + j - 1] + dp[(i - 1) * (q + 1) + q - j + 1] * len[j - 1]
        dp[i * (q + 1) + j] %= mod

print(dp[k * (q + 1) - 1])
```

## 133. ABC133 F

## 134. ABC134 F

## 135. ABC135 F

## 136. ABC136 F

## 137. ABC137 F

## 138. ABC138 F

## 139. ABC139 F

## 140. ABC140 F

## 141. ABC141 F

## 142. ABC142 F

## 143. ABC143 F

## 144. ABC144 F

## 145. ABC145 F

## 146. ABC146 F

## 147. ABC147 F

## 148. ABC148 F

## 149. ABC149 F

## 150. ABC150 F

## 151. ABC151 F

## 152. ABC152 F

## 153. ABC153 F

## 154. ABC154 F

## 155. ABC155 F

## 156. ABC156 F

## 157. ABC157 F

## 158. ABC158 F

## 159. ABC159 F

## 160. ABC160 F

## 161. ABC161 F

## 162. ABC162 F

## 163. ABC163 F

## 164. ABC164 F

## 165. ABC165 F

## 166. ABC166 F

## 167. ABC167 F

## 168. ABC168 F

## 169. ABC169 F

## 170. ABC170 F

## 171. ABC171 F

## 172. ABC172 F

## 173. ABC173 F

## 174. ABC174 F

## 175. ABC175 F

## 176. ABC176 F

## 177. ABC177 F

## 178. ABC178 F

## 179. ABC179 F

## 180. ABC180 F

## 181. ABC181 F

## 182. ABC182 F

## 183. ABC183 F

## 184. ABC184 F

## 185. ABC185 F

## 186. ABC186 F

## 187. ABC187 F

## 188. ABC188 F

## 189. ABC189 F

## 190. ABC190 F

## 191. ABC191 F

## 192. ABC192 F

## 193. ABC193 F

## 194. ABC194 F

## 195. ABC195 F

## 196. ABC196 F

## 197. ABC197 F

## 198. ABC198 F

## 199. ABC199 F

## 200. ABC200 F

## 201. ABC201 F

## 202. ABC202 F

## 203. ABC203 F

## 204. ABC204 F

## 205. ABC205 F

## 206. ABC206 F

## 207. ABC207 F

## 208. ABC208 F

## 209. ABC209 F

## 210. ABC210 F

## 211. ABC211 F

## 212. ABC212 F

## 213. ABC213 F

## 214. ABC214 F

## 215. ABC215 F

## 216. ABC216 F

## 217. ABC217 F

## 218. ABC218 F

## 219. ABC219 F

## 220. ABC220 F

## 221. ABC221 F

## 222. ABC222 F

## 223. ABC223 F

## 224. ABC224 F

## 225. ABC225 F

## 226. ABC226 F

## 227. ABC227 F

## 228. ABC228 F

## 229. ABC229 F

## 230. ABC230 F

## 231. ABC231 F

## 232. ABC232 F

## 233. ABC233 F

## 234. ABC234 F

## 235. ABC235 F

## 236. ABC236 F

## 237. ABC237 F

## 238. ABC238 F

## 2

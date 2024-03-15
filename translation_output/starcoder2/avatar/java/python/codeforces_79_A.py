
```

```


python code:
```

```
/codeforces/79_A.md
# A. Spit Problem

## Problem

Ciel and Hanako are playing a game. The game is played on a rectangular board with H rows and W columns. Each cell of the board is either empty or has a stone.

The game is played by two players alternately. The player who goes first is Ciel, and the other is Hanako.

In each turn, the player removes a stone from the board. The player must remove a stone from a cell that has a stone. The player must also remove a stone from a cell that is adjacent to a cell that has a stone. Two cells are adjacent if they share a side.

The player who cannot remove a stone loses the game.

Ciel and Hanako play optimally. Given the initial state of the board, determine the winner of the game.

## Input

The first line contains two integers H and W (1 ≤ H, W ≤ 100).

Each of the following H lines contains a string of length W. The j-th character of the i-th line is . if the cell at the i-th row from the top and the j-th column from the left is empty, and # if the cell has a stone.

## Output

If Ciel wins, print Ciel. If Hanako wins, print Hanako.

## Examples

### Input
```
3 3
...
...
...
```

### Output
```
Ciel
```

### Input
```
3 3
...
#..
...
```

### Output
```
Hanako
```

### Input
```
3 3
...
##.
...
```

### Output
```
Hanako
```

### Input
```
3 3
...
###
...
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
#..
```

### Output
```
Hanako
```

### Input
```
3 3
...
###
#.#
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
###
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###
##.
```

### Output
```
Ciel
```

### Input
```
3 3
...
###


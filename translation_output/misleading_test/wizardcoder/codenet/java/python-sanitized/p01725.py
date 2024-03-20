import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Unordered Operators
 */
public class p01725 {

    static p01725 main;
    static int[][] PRI;
    static final int[][] _PRI = {
            {1, 2, 3},
            {1, 3, 2},
            {2, 1, 3},
            {2, 3, 1},
            {3, 1, 2},
            {3, 2, 1},
            //
            {1, 1, 2},
            {1, 2, 1},
            {2, 1, 1},
            //
            {2, 2, 1},
            {2, 1, 2},
            {1, 2, 2},
            //
            {2, 2, 2},
    };

    //priority list
    {
        PRI = new int[_PRI.length][128];
        for (int i = 0; i < PRI.length; i++) {
            PRI[i]['('] = 5;
            PRI[i][127] =
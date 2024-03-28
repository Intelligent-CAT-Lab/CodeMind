import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03888 {
    public static void main(String[] args) {
        List<List<String>> arr_data = getInputData();

        int r1 = Integer.parseInt(arr_data.get(0).get(0));
        int r2 = Integer.parseInt(arr_data.get(0).get(1));

        System.out.println(
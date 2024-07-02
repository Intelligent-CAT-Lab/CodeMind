
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long first = input.nextLong();
System.out.println("[INST]16;first;input.nextLong();"+first);
        long secand = input.nextLong();
System.out.println("[INST]17;secand;input.nextLong();"+secand);
        int count = 0;
        while (first <= secand) {
            count++;
            first*=2;
        }
        System.out.println(count);
        

    }
}

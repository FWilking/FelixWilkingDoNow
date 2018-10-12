package FelixWilking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        int out = 0;
        for(int i = 0; i < num+1; i++){
            out += i;
        }
        System.out.println("The sum of the numbers from 1 to "+num+" is "+out);
    }
}

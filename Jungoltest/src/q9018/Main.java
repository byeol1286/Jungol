package q9018;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("두 개의 수를 입력하시오. ");
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        
        System.out.println(N + " + " + M + " = " + (N + M));
        System.out.println(N + " - " + M + " = " + (N - M));
        System.out.println(N + " * " + M + " = " + (N * M));
        System.out.println(N + " / " + M + " = " + (N / M));
        System.out.println(N + " % " + M + " = " + (N % M));
    }
}
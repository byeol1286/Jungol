package q150;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] characters = new char[10];

        for (int i = 0; i < 10; i++) {
            characters[i] = sc.next().charAt(0);
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print(characters[i] + " ");
        }
        
        sc.close();
    }
}
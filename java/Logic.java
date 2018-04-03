/*
    Logic gate simulation in JAVA

    main class

    Author: Harshit Joshi

*/
import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {
        logicgate gate = new logicgate();
        Scanner input = new Scanner(System.in);
        System.out.println("1. AND gate\n2. OR gate\n3. NOT gate\n4. NAND gate\n5. NOR gate\n6. All the above operations\n7. Exit");
        boolean rerun = true;
        while (rerun){
        System.out.println("Enter your choice");
        int n = input.nextInt();
            if (n==1){
                System.out.println("Enter your a and b for AND gate operation");
                int a = input.nextInt();
                int b = input.nextInt();
                if ((a == 1 || a == 0) && ((b == 1 || b == 0)))
                    System.out.println("AND gate: " + Integer.toString(gate.andgate(a, b)));
                else
                    System.out.println("Enter 1 or 0");
            }
            else if (n==2){
                System.out.println("Enter your a and b for OR gate operation");
                int a = input.nextInt();
                int b = input.nextInt();
                if ((a == 1 || a == 0) && ((b == 1 || b == 0)))
                    System.out.println("OR gate: " + Integer.toString(gate.orgate(a, b)));
                else
                    System.out.println("Enter 1 or 0");
            }
            else if (n==3){
                System.out.println("Enter your a and b for NOT gate operation");
                int a = input.nextInt();
                int b = input.nextInt();
                if ((a == 1 || a == 0))
                    System.out.println("NOT gate: " + Integer.toString(gate.notgate(a)));
                else
                    System.out.println("Enter 1 or 0");
            }
            else if (n==4){
                System.out.println("Enter your a and b for NAND gate operation");
                int a = input.nextInt();
                int b = input.nextInt();
                if ((a == 1 || a == 0) && ((b == 1 || b == 0)))
                    System.out.println("NAND gate: " + Integer.toString(gate.nandgate(a, b)));
                else
                    System.out.println("Enter 1 or 0");
            }
            else if (n==5){
                System.out.println("Enter your a and b for NOR gate operation");
                int a = input.nextInt();
                int b = input.nextInt();
                if ((a == 1 || a == 0) && ((b == 1 || b == 0)))
                    System.out.println("NOR gate: " + Integer.toString(gate.norgate(a, b)));
                else
                    System.out.println("Enter 1 or 0");
            }
            else if (n==6) {
                System.out.println("Enter your a and b for All the above gate operation");
                int a = input.nextInt();
                int b = input.nextInt();
                if ((a == 1 || a == 0) && ((b == 1 || b == 0))) {
                    System.out.println("AND gate: " + Integer.toString(gate.andgate(a, b)));
                    System.out.println("OR gate: " + Integer.toString(gate.orgate(a, b)));
                    System.out.println("NOT gate for a: " + Integer.toString(gate.notgate(a)));
                    System.out.println("NOT gate for b: " + Integer.toString(gate.notgate(b)));
                    System.out.println("NAND gate: " + Integer.toString(gate.nandgate(a, b)));
                    System.out.println("NOR gate: " + Integer.toString(gate.norgate(a, b)));
                }
                else
                    System.out.println("Enter 1 or 0");
            }
            else if (n == 7){
                rerun = false;
            }
            else
                System.out.println("IllegalCharacter");
        }
    }
}

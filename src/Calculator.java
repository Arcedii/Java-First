package src;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float result = 0;
        System.out.println("Введите 1 число: ");
        float num1 = scan.nextFloat();
        System.out.println("Введите 2 число: ");
        float num2 = scan.nextFloat();
        System.out.println("Выберите тип операции: 1.+ , 2.- ,3.* , 4./");
        float operation = scan.nextFloat();
        if (operation == 1){
            result = num1 + num2;
        }
        if (operation == 2){
            result = num1 - num2;
        }
        if (operation == 3){
            result = num1 * num2;
        }
        if (operation == 4){
            result = num1 / num2;
        }
        System.out.println("Результат : " + result);

        //  System.out.print("Кто ты такой блэт?: ");
        //  String username = scan.nextLine();
        //  System.out.print("Приветствую, " + username);
        //  int num = scan.nextInt();
        //  byte num2 = scan.nextByte();
        //  boolean b = scan.nextBoolean();
        // float num3 = scan.nextFloat();
    }
}

import javax.swing.*;
import java.util.Scanner;

public class task_5 {

    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int x = src.nextInt();
        int y = src.nextInt();
        System.out.println("Введите действие которое хотите сделать: +, -, * или /");
        String str = src.next();
            switch (str) {
                case "+":
                    int summ = x + y;
                    System.out.println("Сумма введеных чисел равна: " + summ);
                    break;

                case "-":
                    int vich = x - y;
                    System.out.println("Остаток от вычитания введеных чисел состовляет: " + vich);
                    break;

                case "*":
                    int ymn = x * y;
                    System.out.println("Произведение введеных чисел равно: " + ymn);
                    break;

                case "/":
                    int del = x / y;
                    System.out.println("Остаток от деления введенных чисел равен: " + del);
                    break;

                default:
                    System.out.println("Извините дальнейший функционал находится в разработке");
            }
    }
}

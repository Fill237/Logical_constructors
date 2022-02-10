import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int x = src.nextInt();
        int y = src.nextInt();
        int z = src.nextInt();
        double summ = (x + y + z)/3;
        System.out.println("Среднее арифмитическое чисел равно: " + summ);
        double summ1 = Math.floor(summ/2);                                  // округляем в меньшую сторону
        int avr = (int) summ1;                                              // double to int
            if (avr > 3){
                System.out.println("Программа выполнена корректно");
            } else
            System.out.println("Попробуйте ввести другие значения");
    }
}
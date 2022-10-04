package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Напишите максимальное число");
        int max = scanner.nextInt();
        System.out.println("Напишите минимальное число");
        int min = scanner.nextInt();
        max = max-min;
        int random = (int) (Math.random() * max + 1) + min;
        int count = 0;
        while (true) {
            System.out.println("Введите число: ");
            int num = scanner.nextInt();
            count++;
            if (num<random){
                System.out.println("Число больше заданого, попробуйте ещё");
            }else if(num>random){
                System.out.println("Число меньше заданого, попробуйте ещё");
            } else if(num == random){
                System.out.println("Вы угадали, вы молодец, кол-во попыток: "+count);
                break;
            }
        }
    }
}

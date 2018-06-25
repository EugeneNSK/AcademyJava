package com.jcourse.zonov.run;

import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {

//     input();
     theGame();

    }
    public static void input(){

        String charset = System.getProperty("file.encoding");
        System.out.println("Кодировка " + charset);

        System.out.println("Введите слово с клавиатуры");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNext()){
            String s = sc.next();
            System.out.print("Вы ввели:");
            String d = new String(s.getBytes(), Charset.forName(charset));
            System.out.println(d);
        }

    }

    public static void theGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Давай поиграем! Сейчас я загадаю число от 1 до 100. Тебе нужно его угадать за 8 попыток ");
        Random rand = new Random();
        int num = rand.nextInt(101);
        System.out.println("На самом деле я загадал: " + num);

        int userNum = 0;
        int flag = 0;

        while (flag<8) {

        if (sc.hasNext()) {

            try {
                userNum = sc.nextInt();
            } catch (NoSuchElementException e) {
                System.out.println("Вы вели не целое число. Выходим");
                return;

            }
        }

            if (num < userNum) {
                System.out.println("Загаданное число меньше");
            } else if (num > userNum) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Вы угадали");
            }
            flag++;
        }
        System.out.println("На самом деле я загадал:" + num);
    }

}




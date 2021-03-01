package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        В 12-литровой бочке было 7 литров воды, а в ведре - 8 литров.
        Водой из ведра дополнили бочку доверху. Сколько литров воды осталось в ведре?
         */
//        int fullBarrel = 12;
//        int actualBarrel = 7;
//        int bucket = 8;
//        int tempBarrel;
//        int result;
//
//        System.out.println(bucket - (fullBarrel - actualBarrel) + " литра(ов) воды осталось в ведре");

        /*
        Наташа прочитала за каникулы 5 книг, а Катя прочитала 4 книги. Сколько книг дети прочитали вместе за каникулы?
         */

//        int natashaAmountOfBooks = 5;
//        int katyaAmountOfBooks = 4;
//
//        System.out.println(natashaAmountOfBooks + katyaAmountOfBooks);

        /*
        На одной ветке яблони висело 6 яблок, а на другой – 7. Сколько яблок было на обеих ветках яблони?
         */

//        int branch0 = 6, branch1 = 7;
//        System.out.println(branch0 + branch1 + " яблок было на обеих ветках яблони");

        /*
        В классе на окне стоят цветы в горшках. На первом окне стоит 2 цветка (byte),
        на втором 3 цветка (short), а на третьем 1 цветок(byte). Сколько всего цветов в классе?
         */

//        byte window0 = 2, window2 = 1;
//        short window1 = 3;
//
//        System.out.println(window0 + window1 + window2);

        /*
        По результатам оценок за 1 четверть в 1‑А классе 10 отличников, 14 хорошистов и 2 троечника.
        В 1‑Б классе – 8 отличников, 12 хорошистов и 3 троечника. А в 1‑В – 11 отличников, 11 хорошистов и 4 троечника.
 Сколько отличников, хорошистов и троечников во всей параллели первых классов?
% соотношение  отличников хорошистов и троечников на параллели.
% соотношение  отличников хорошистов и троечников по классам.
         */

//        int sumOtlichnik = 0;
//        int sumHoroshist = 0;
//        int sumTroechnik = 0;
//
//        Student student1 = new Student("1A", 10, 14, 2);
//        Student student2 = new Student("1Б", 8, 12, 3);
//        Student student3 = new Student("1В", 11, 11, 4);
//
//        Student[] students = new Student[]{student1, student2, student3};
//
//        for (int i = 0; i < students.length; i++) {
//            sumOtlichnik = sumOtlichnik + students[i].otlichnik;
//            sumHoroshist = sumHoroshist + students[i].horoshist;
//            sumTroechnik = sumTroechnik + students[i].troechnic;
//        }
//
//        System.out.println("Отличников: " + sumOtlichnik + " Хорошистов: " + sumHoroshist +
//                " Троечников: " + sumTroechnik);

        /*
        Дано целое число A. Проверить истинность высказывания: «Число A является положительным».
         */

        int a = -1;

        if (a > 0) {
            System.out.println("Число положительное!");
        } else if (a < 0) {
            System.out.println("Число отрицательное!");
        } else {
            System.out.println("0!");
        }

        System.out.println("Тернарный оператор: " + ((a > 0) ? "Число положительное!" : "Число отрицательное!"));



    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner line = new Scanner(System.in);

        // Первое практическое задание
        //Сгенерировать 5 случайных чисел. Каждое возвести в квадрат и вывести в консоль.

        //Arrays.sort() - сортирует массив
        //System.arraycopy()
       double[] arr = new double[5];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = Math.random();
            System.out.print(arr[i]);
            arr[i] *= arr[i];
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));

        ///Второе практическое задание
        //Задача 2:
        //2.1 Создать массив fruits и заполнить его 4 произвольными фруктами.
        //2.2 вывести в консоль второй и четвертый.
        //2.3 вывести в консоль длину массива.
        //2.4 третий фрукт заменить на иной.
        //2.5 проверить результат в консоли.

        System.out.println("введите массив fruits размером из 4 элементов");
        String[] arrya = new String[4];

        for (int i = 0; i < arrya.length; i++) {
            arrya[i] = line.nextLine();
        }


        System.out.println(Arrays.toString(arrya));
        System.out.println();
        System.out.print("Второй и четвертый элеменет:" + arrya[1] + " и " + arrya[3]);
        System.out.print("Длинна массива равна:" + arrya.length);
        System.out.println("Заменим фрукт " + arrya[2]);
        System.out.print("Введите замену:");
        arrya[2] = line.nextLine();
        System.out.println(Arrays.toString(arrya));

        // Третье практическое задание
        //Задача 3:
        //3.1 Создать пустой массив типа double с названием masDouble такого размера, который
        //пользователь вводит с клавиатуры.
        //3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в
        //консоль.
        //3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и
        //обратном порядке

        System.out.println("Введите размер массива: ");
        int n = line.nextInt();

        double[] masDouble = new double[n];

        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = Math.random() * 20;
        }
        System.out.println(Arrays.toString(masDouble));

        System.out.println("Возведем четный элемент массива в квадрат");
        for (int i = 0; i < masDouble.length; i++) {
            if (i % 2 != 0) {
                masDouble[i] *= masDouble[i];
            }
        }

        System.out.println("Полученный массив в обычном порядке");
        System.out.println(Arrays.toString(masDouble));

        for (int i = masDouble.length - 1; i >= 0; i--) {
            System.out.println(" " + masDouble[i]);
        }

        double sum = 0;
        //Посчитайте среднее арифметическое массива
        for (int i = 0; i < masDouble.length; i++) {
            sum += masDouble[i];
        }
        System.out.println("Cреднее арифметическое массива masDouble = " + sum / masDouble.length);

        //Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
        // Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

        int[] mas = new int[12];
        int[] mas1 = new int[12];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 15 - 15);
        }
        System.out.println(Arrays.toString(mas));
        System.arraycopy(mas, 0, mas1, 0, mas.length);

        Arrays.sort(mas);
        int maxIndex = mas[mas.length - 1];

        int buf = 0;
        for (int i = 0; i < mas.length; i++) {
            if (maxIndex == mas1[i]) {
                buf = i;
            }
        }

        System.out.println("Индекс последнего вхождения в массив максимального значения =  " + buf + "Максимальное значение массива = " + maxIndex);


        //Для проверки остаточных знаний учеников после летних каникул,
        // учитель младших классов решил начинать каждый урок с того,
        // чтобы задавать каждому ученику пример из таблицы умножения,
        // но в классе 15 человек, а примеры среди них не должны повторяться.
        // В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров
        // из таблицы умножения (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).
        // При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися)


        int[] multiplicationTable = MultiplicationTable.generateMultiplicationTable();
        int[] uniqueExamples = MultiplicationTable.getUniqueExamples(multiplicationTable, 15);
        MultiplicationTable.printExamples(uniqueExamples);

        System.out.println();

        // Напишите программу на java для вставки элемента на выбранную позицию в массив. выведите иоговый массив.

        int[] mas_3 = new int[10];
        System.out.println("Всатвска элемента на выбранную позицю, укажите номер позиции (от 1 до 10):");
        int pos = line.nextInt();
        System.out.println("Укажите элемент для вствки:");
        int elem = line.nextInt();
        for (int i = 0; i < mas_3.length; i++) {
            if (i == pos - 1) {
                mas_3[i] = elem;
                System.out.print(mas_3[i] + " ");
            } else {
                mas_3[i] = (int) (Math.random() * 100);
                System.out.print(mas_3[i] + " ");
            }
        }

        System.out.println();

        // Напишите прогрвмму на java, чтобы перевернуть массив целочисленных значений
        System.out.println(" Напишите программу на java, чтобы перевернуть массив целочисленных значений ");
        int[] mas_p = new int[10];
        int k = 0;
        for (int i = mas_3.length-1; i >= 0; i--) {
            mas_p[k] = mas_3[i];
            System.out.print(mas_p[k] + " ");
            k++;
        }

        //Напишите программу, чтобы найти все пары элементов в массиве, сумма которых равна указанному числу
        System.out.println();

        // Напишите прогрвмму на java, чтобы перевернуть массив целочисленных значений
        System.out.println(" Напишите программу, чтобы найти все пары элементов в массиве, сумма которых равна указанному числу");

        System.out.println("Ввведите искомую сумму: ");
        int sumElem = line.nextInt();
        boolean sumElemetTrue = false;
        int[] mas_sumElem = {1, 3, 5, 7, 9, 10, 2, 4, 6};

        for(int i = 0; i < mas_sumElem.length; i++){
            for (int j = i+1; j < mas_sumElem.length; j++){
                if (mas_sumElem[i] + mas_sumElem[j] == sumElem){
                    System.out.println("Искомые пары: " + mas_sumElem[i] + " " + mas_sumElem[j]);
                    sumElemetTrue = true;
                }
            }
        }
        if (sumElemetTrue == false){
            System.out.println("Искомых пар не найдено");
        }


        // Домашнее задание
        //Задача 1:
        //Пройти по массиву, вывести все элементы в прямом и в обратном порядке.

        System.out.println();
        System.out.println("Введите размер массива, до 10 элементов");
        int m = line.nextInt();
        int[] houseArray = new int[m];

        System.out.println("Введите " + m + " элементов массива");
        for (int i = 0; i < houseArray.length; i++){
           houseArray[i] = line.nextInt();
        }

        System.out.println(Arrays.toString(houseArray));
        int[] houseArray_1 = Arrays.copyOf(houseArray,houseArray.length);
        //Задача 2:
        //Найти минимальный-максимальный элементы и вывести в консоль
        System.out.println();
        System.out.println("минимальный-максимальный элементы массиве :");
        Arrays.sort(houseArray);
        System.out.println(houseArray[0] + " " + houseArray[houseArray.length-1]);

        //Задача 3:
        //Найти индексы минимального и максимального элементов и вывести в консоль
        System.out.println();
        System.out.println(" индексы минимального и максимального элемента в массиве :");
        System.out.println(Arrays.toString(houseArray_1));

        for (int i = 0; i < houseArray_1.length; i++){
            if (houseArray_1[i] == houseArray[0]){
                System.out.println("Индексы минимального элемента массива равны:" + i);
            }else if(houseArray_1[i] == houseArray[houseArray_1.length-1]){
                System.out.println("Индексы максимального элемента массива равны:" + i);
            }
        }

        //Задача 4:
        //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        //сообщение, что их нет.

        System.out.println();

        System.out.println("Введите размер массива, до 10 элементов");
        int m_1  = line.nextInt();
        int[] houseArray_2 = new int[m_1];
        System.out.println(" Введите массив, с большим количествтом нулевых элементов :");

        int elemNull = 0;
        boolean elemNullfalse = false;
        for (int i = 0; i < houseArray_2.length; i++){
            houseArray_2[i] = line.nextInt();
            if (houseArray_2[i] == 0) {
               elemNull++;
               elemNullfalse = true;
            }
        }
        if (elemNullfalse = false){
            System.out.println("Такиех  элементов в массиве нет");
        }
        System.out.println("Колличество нулевых элементов массива равно " + elemNull);

        //Задача 5:
        //Пройти по массиву и поменять местами элементы первый и последний, второй и
        //предпоследний и т.д

        System.out.println();
        System.out.println("Введите размер массива, до 10 элементов");
        int houseArrayLen = line.nextInt();
        int houseArryWhole = houseArrayLen/2;
        int[] houseArray_3 = new int[houseArrayLen];
        for (int i = 0; i < houseArray_3.length; i++) {
            houseArray_3[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(houseArray_3));


        int houseBuf;
        if(houseArrayLen % 2 == 0){
            for (int i = 0; i <= (houseArray_3.length-1)/2; i++){
                houseBuf = houseArray_3[i];
                houseArray_3[i] = houseArray_3[houseArray_3.length-1-i];
                houseArray_3[houseArray_3.length-1-i] = houseBuf;
                }
            }
        if(houseArrayLen % 2 != 0){
            for (int i = 0; i <= houseArryWhole; i++){
                houseBuf = houseArray_3[i];
                houseArray_3[i] = houseArray_3[houseArray_3.length-1-i];
                houseArray_3[houseArray_3.length-1-i] = houseBuf;
            }
        }
        System.out.println(Arrays.toString(houseArray_3));

        //Задача 6:
        //Проверить, является ли массив возрастающей последовательностью (каждое следующее
        //число больше предыдущего)

        System.out.println();

        System.out.println("Введите размер массива, до 10 элементов");
        int m_2  = line.nextInt();
        int[] houseArray_4 = new int[m_2];
        System.out.println(" Вводите массив :) :");


        for (int i = 0; i < houseArray_4.length; i++){
            houseArray_4[i] = line.nextInt();
        }
        System.out.println(Arrays.toString(houseArray_4));

        boolean houseArrayPos = false;
        int maxElem = houseArray_4[0];
        for (int i = 1; i < houseArray_4.length; i++){
            if (maxElem < houseArray_4 [i]){
                maxElem = houseArray_4[i];
            } else {
                System.out.println("массив не является возрастающей последовательностью ");
                houseArrayPos = true;
            }
        }

        if (houseArrayPos == false){
            System.out.println("массив является возрастающей последовательностью ");
        }

        //Имеется массив из неотрицательных чисел(любой). Представьте что массив
        //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
        //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
        //содержит нуля в начале, кроме самого числа 0.

        System.out.println("Введите размер массива, до 10 элементов");
        int m_3  = line.nextInt();
        int[] houseArray_5 = new int[m_3];
        System.out.println(" Вводите массив :");


        for (int i = 0; i < houseArray_5.length; i++){
            houseArray_5[i] = line.nextInt();
        }

        String str = "";
        for (int i = 0; i < houseArray_5.length; i++){
            str += houseArray_5[i];
        }
        int number = Integer.parseInt(str)+1;
        str = Integer.toString(number);
        String[] str_1 = str.split("");
        int[] houseArray_6 = new int[str_1.length];

        for (int i = 0; i < houseArray_6.length; i++){
            houseArray_6 [i]= Integer.parseInt(str_1[i]);
        }

        System.out.println(Arrays.toString(houseArray_6));
    }

}

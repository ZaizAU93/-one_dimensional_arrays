import java.util.Random;

public class MultiplicationTable {
    // генерируем таблицу умножения от 22 до 99
    public static int[] generateMultiplicationTable() {
        int[] table = new int[80];
        int index = 0;
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                table[index++] = i * 10 + j;
            }
        }
        return table;
    }

    // выбираем 15 уникальных примеров из таблицы умножения
    public static int[] getUniqueExamples(int[] multiplicationTable, int count) {
        Random random = new Random();
        int[] examples = new int[count];
        int index = 0;

        while (index < count) {
            int example = multiplicationTable[random.nextInt(multiplicationTable.length)];
            if (!contains(examples, example)) {
                examples[index++] = example;
            }
        }

        return examples;
    }

    // проверяем, содержит ли массив заданное число
    public static boolean contains(int[] array, int number) {
        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }

    // выводим примеры на экран
    public static void printExamples(int[] examples) {
        for (int example : examples) {
            int firstNumber = example / 10;
            int secondNumber = example % 10;
            System.out.println(firstNumber + " x " + secondNumber + " = ");
        }
    }

}

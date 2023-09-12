import java.util.Random;

public class MultiplicationTable {
    // ���������� ������� ��������� �� 22 �� 99
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

    // �������� 15 ���������� �������� �� ������� ���������
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

    // ���������, �������� �� ������ �������� �����
    public static boolean contains(int[] array, int number) {
        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }

    // ������� ������� �� �����
    public static void printExamples(int[] examples) {
        for (int example : examples) {
            int firstNumber = example / 10;
            int secondNumber = example % 10;
            System.out.println(firstNumber + " x " + secondNumber + " = ");
        }
    }

}

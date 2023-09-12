import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner line = new Scanner(System.in);

        // ������ ������������ �������
        //������������� 5 ��������� �����. ������ �������� � ������� � ������� � �������.

        //Arrays.sort() - ��������� ������
        //System.arraycopy()
       double[] arr = new double[5];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = Math.random();
            System.out.print(arr[i]);
            arr[i] *= arr[i];
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));

        ///������ ������������ �������
        //������ 2:
        //2.1 ������� ������ fruits � ��������� ��� 4 ������������� ��������.
        //2.2 ������� � ������� ������ � ���������.
        //2.3 ������� � ������� ����� �������.
        //2.4 ������ ����� �������� �� ����.
        //2.5 ��������� ��������� � �������.

        System.out.println("������� ������ fruits �������� �� 4 ���������");
        String[] arrya = new String[4];

        for (int i = 0; i < arrya.length; i++) {
            arrya[i] = line.nextLine();
        }


        System.out.println(Arrays.toString(arrya));
        System.out.println();
        System.out.print("������ � ��������� ��������:" + arrya[1] + " � " + arrya[3]);
        System.out.print("������ ������� �����:" + arrya.length);
        System.out.println("������� ����� " + arrya[2]);
        System.out.print("������� ������:");
        arrya[2] = line.nextLine();
        System.out.println(Arrays.toString(arrya));

        // ������ ������������ �������
        //������ 3:
        //3.1 ������� ������ ������ ���� double � ��������� masDouble ������ �������, �������
        //������������ ������ � ����������.
        //3.2 ��������� masDouble ���������� �������, ��������� Math.random() � ������� ��� �
        //�������.
        //3.3 ������ ������ ������� masDouble �������� � �������. ������� ������ � ������ �
        //�������� �������

        System.out.println("������� ������ �������: ");
        int n = line.nextInt();

        double[] masDouble = new double[n];

        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = Math.random() * 20;
        }
        System.out.println(Arrays.toString(masDouble));

        System.out.println("�������� ������ ������� ������� � �������");
        for (int i = 0; i < masDouble.length; i++) {
            if (i % 2 != 0) {
                masDouble[i] *= masDouble[i];
            }
        }

        System.out.println("���������� ������ � ������� �������");
        System.out.println(Arrays.toString(masDouble));

        for (int i = masDouble.length - 1; i >= 0; i--) {
            System.out.println(" " + masDouble[i]);
        }

        double sum = 0;
        //���������� ������� �������������� �������
        for (int i = 0; i < masDouble.length; i++) {
            sum += masDouble[i];
        }
        System.out.println("C������ �������������� ������� masDouble = " + sum / masDouble.length);

        //�������� ������ �� 12 ��������� ����� ����� �� ������� [-15;15].
        // ���������� ����� ������� �������� � ���� ������� ������������ � �������� ������ ��� ���������� ��������� � ������.

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

        System.out.println("������ ���������� ��������� � ������ ������������� �������� =  " + buf + "������������ �������� ������� = " + maxIndex);


        //��� �������� ���������� ������ �������� ����� ������ �������,
        // ������� ������� ������� ����� �������� ������ ���� � ����,
        // ����� �������� ������� ������� ������ �� ������� ���������,
        // �� � ������ 15 �������, � ������� ����� ��� �� ������ �����������.
        // � ������ ������� �������� ���������, ������� ����� �������� �� ����� 15 ��������� ��������
        // �� ������� ��������� (�� 2*2 �� 9*9, ������ ��� ������� �� ��������� �� 1 � �� 10 � ������� ������).
        // ��� ���� ����� 15 �������� �� ������ ���� ������������� (������� 2*3 � 3*2 � �� �������� ���� ������� ��������������)


        int[] multiplicationTable = MultiplicationTable.generateMultiplicationTable();
        int[] uniqueExamples = MultiplicationTable.getUniqueExamples(multiplicationTable, 15);
        MultiplicationTable.printExamples(uniqueExamples);

        System.out.println();

        // �������� ��������� �� java ��� ������� �������� �� ��������� ������� � ������. �������� ������� ������.

        int[] mas_3 = new int[10];
        System.out.println("�������� �������� �� ��������� ������, ������� ����� ������� (�� 1 �� 10):");
        int pos = line.nextInt();
        System.out.println("������� ������� ��� ������:");
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

        // �������� ��������� �� java, ����� ����������� ������ ������������� ��������
        System.out.println(" �������� ��������� �� java, ����� ����������� ������ ������������� �������� ");
        int[] mas_p = new int[10];
        int k = 0;
        for (int i = mas_3.length-1; i >= 0; i--) {
            mas_p[k] = mas_3[i];
            System.out.print(mas_p[k] + " ");
            k++;
        }

        //�������� ���������, ����� ����� ��� ���� ��������� � �������, ����� ������� ����� ���������� �����
        System.out.println();

        // �������� ��������� �� java, ����� ����������� ������ ������������� ��������
        System.out.println(" �������� ���������, ����� ����� ��� ���� ��������� � �������, ����� ������� ����� ���������� �����");

        System.out.println("�������� ������� �����: ");
        int sumElem = line.nextInt();
        boolean sumElemetTrue = false;
        int[] mas_sumElem = {1, 3, 5, 7, 9, 10, 2, 4, 6};

        for(int i = 0; i < mas_sumElem.length; i++){
            for (int j = i+1; j < mas_sumElem.length; j++){
                if (mas_sumElem[i] + mas_sumElem[j] == sumElem){
                    System.out.println("������� ����: " + mas_sumElem[i] + " " + mas_sumElem[j]);
                    sumElemetTrue = true;
                }
            }
        }
        if (sumElemetTrue == false){
            System.out.println("������� ��� �� �������");
        }


        // �������� �������
        //������ 1:
        //������ �� �������, ������� ��� �������� � ������ � � �������� �������.

        System.out.println();
        System.out.println("������� ������ �������, �� 10 ���������");
        int m = line.nextInt();
        int[] houseArray = new int[m];

        System.out.println("������� " + m + " ��������� �������");
        for (int i = 0; i < houseArray.length; i++){
           houseArray[i] = line.nextInt();
        }

        System.out.println(Arrays.toString(houseArray));
        int[] houseArray_1 = Arrays.copyOf(houseArray,houseArray.length);
        //������ 2:
        //����� �����������-������������ �������� � ������� � �������
        System.out.println();
        System.out.println("�����������-������������ �������� ������� :");
        Arrays.sort(houseArray);
        System.out.println(houseArray[0] + " " + houseArray[houseArray.length-1]);

        //������ 3:
        //����� ������� ������������ � ������������� ��������� � ������� � �������
        System.out.println();
        System.out.println(" ������� ������������ � ������������� �������� � ������� :");
        System.out.println(Arrays.toString(houseArray_1));

        for (int i = 0; i < houseArray_1.length; i++){
            if (houseArray_1[i] == houseArray[0]){
                System.out.println("������� ������������ �������� ������� �����:" + i);
            }else if(houseArray_1[i] == houseArray[houseArray_1.length-1]){
                System.out.println("������� ������������� �������� ������� �����:" + i);
            }
        }

        //������ 4:
        //����� � ������� ���������� ������� ���������. ���� ������� ��������� ��� - �������
        //���������, ��� �� ���.

        System.out.println();

        System.out.println("������� ������ �������, �� 10 ���������");
        int m_1  = line.nextInt();
        int[] houseArray_2 = new int[m_1];
        System.out.println(" ������� ������, � ������� ������������ ������� ��������� :");

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
            System.out.println("������  ��������� � ������� ���");
        }
        System.out.println("����������� ������� ��������� ������� ����� " + elemNull);

        //������ 5:
        //������ �� ������� � �������� ������� �������� ������ � ���������, ������ �
        //������������� � �.�

        System.out.println();
        System.out.println("������� ������ �������, �� 10 ���������");
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

        //������ 6:
        //���������, �������� �� ������ ������������ ������������������� (������ ���������
        //����� ������ �����������)

        System.out.println();

        System.out.println("������� ������ �������, �� 10 ���������");
        int m_2  = line.nextInt();
        int[] houseArray_4 = new int[m_2];
        System.out.println(" ������� ������ :) :");


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
                System.out.println("������ �� �������� ������������ ������������������� ");
                houseArrayPos = true;
            }
        }

        if (houseArrayPos == false){
            System.out.println("������ �������� ������������ ������������������� ");
        }

        //������� ������ �� ��������������� �����(�����). ����������� ��� ������
        //������������ ����� ����� (�������� ������ {1,2,3} -> 123, {9,9,9} -> 999). ������
        //�������� ������� � ����� ������ � �� ������ �������� ������������ ������. ������ ��
        //�������� ���� � ������, ����� ������ ����� 0.

        System.out.println("������� ������ �������, �� 10 ���������");
        int m_3  = line.nextInt();
        int[] houseArray_5 = new int[m_3];
        System.out.println(" ������� ������ :");


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

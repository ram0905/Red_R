package HW;

public class HW_5_1 {

    public static void main(String[] args) {

//        Task_1
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        System.out.println(sum);


//        Task_2
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);


//        Task_3
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);


//        Task_4
//        Дан массив:
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.

        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 = array1[i] + sum1;
        }
        System.out.println(sum1 / array1.length);


//        Task_5
//        Дан массив:
        int[][] array2 = {{1, 2, 3, 4, 5},
                         {6, 7, 8, 9},
                         {-1, -2, -3, -4},
                         {-5, -6}};
//        необходимо вывести сумму элементов массива.

        int sum2 = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum2 = array2[i][j] +sum2;
            }
        }
        System.out.println(sum2);


//        Task_6
//        Дан массив:
        int[][] array3 = {{1, 2, 3, 4, 5},
                         {6, 7, 8, 9},
                         {-1, -2, -3, -4},
                         {-5, -6}};
//        необходимо вывести максимальное значение массива.

        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (array3[i][j] > max2) {
                    max2 = array3[i][j];
                }
            }
        }
        System.out.println(max2);


//        Task_7
//        Дан массив:
        int[][] array4 = {
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9},
                        {-1, -2, -3, -4},
                        {-5, -6}};
//        необходимо вывести количество элементов в массиве.

        int count = 0;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                count ++;
                }
            }
        System.out.println(count);
    }






}



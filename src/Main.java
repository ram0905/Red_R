
import java.util.Arrays;


public class Main {


    public static void main(String[] args) {


        int a = 30;
        int b = 10;
        int x = 0;

        if ( b > 0 || (a % x)  ==0)
            System.out.println("True !!!!!!!");
//          Если по значению первого операнда очевиден результат, то второй операнд не вычисляется.


        int number = 50;
        int delitel = 0;
        //второй операнд не вычисляется и ошибки не возникает
        if (delitel != 0 && (number % delitel) == 0)
            System.out.println(delitel + " является делителем " + number);
//        Без использования укороченного оператора
//          возникнет ошибка "деление на ноль"
        System.out.println("Завершение работы программы");
//          Если по значению первого операнда очевиден результат, то второй операнд не вычисляется.





//        int arr1[] = {1, 21, 3};
//        int arr2[] = {1, 2, 3};
//        if (Arrays.equals(arr1, arr2)) {
//            System.out.println("Same");
//        }
//        else {
/*        System.out.println("""
                ____888888______________________________
                ____888888______________________________
                ___8888888888___________________________
                __888888888888__________________________
                __8888111188888_________________________
                _888881111188888___11___________________
                _8888811111188888_11____________________
                _8888811111188888_11____________________
                _8888811111118888_11____________________
                _8888881111118888_11___11__8888888______
                _8888881111118888__1__11__88888888888___
                _8888888111111888____11__8888888888888__
                __888888111111888_111___88888888888888__
                __8888888111118881111__888881111118888__
                ___888888811188881111_8888811111111888__
                ____8888888188881111188888111111118888__
                _____88888888888111118888111111118888___
                ______888888888111118888811111188888____
                ______8888888881111188888888888888______
                _____888888888811111888888888888________
                ____88888888888111118888888888__________
                ___88881111888811111888888888___________
                __8888111111888111118888888888__________
                _888881111118881111188811118888_________
                _8888881111888811111881111118888________
                _8888888118888811111888111188888________
                __888888888888_1111888881188888_________
                ___8888888888___111_8888888888__________
                ____88888888_____1___88888888___________
                _____888888___________888888____________
                _______________________8888_____________

                                    
                """);
        System.out.println("3\n2\n1\nПоехали!!!");

        System.out.println("\uD83D\uDE00");
        System.out.println("\uD83D\uDE00");
*/

//        int[][] array2 = {{1, 2, 3, 4, 5},
//                {6, 7, 8, 9},
//                {-1, -2, -3, -4},
//                {-5, -6}};
////        необходимо вывести сумму элементов массива.
//
//        int sum2 = 0;
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                sum2 = array2[i][j] +sum2;
//                }
//            }
//        System.out.println(sum2);
//
//
//        int[][] array3 = {{1, 2, 3, 4, 5},
//                         {6, 7, 8, 9},
//                         {-1, -2, -3, -4},
//                         {-5, -6}};
////        необходимо вывести максимальное значение массива.
//
//        int max2 = Integer.MIN_VALUE;
//        for (int i = 0; i < array3.length; i++) {
//            for (int j = 0; j < array3[i].length; j++) {
//                if (array3[i][j] > max2) {
//                    max2 = array3[i][j];
//                }
//            }
//        }
//        System.out.println(max2);

//        double a = Math.random()*3;
//
//        System.out.println (a);


        StringBuilder buffer = new StringBuilder("Весёлое Программирование");
        buffer.reverse();
        System.out.println(buffer);

        StringBuffer buffer1 = new StringBuffer("Весёлое Программирование!!!!!!!");
        buffer1.reverse();
        System.out.println(buffer1);

    }


    {
        String arr1[] = {"sff", "dfdf", "dfdf"};
        String arr2[] = {"sff", "dfdf", "dfdf"};
        int arr4[] = {1, 2, 3};
        int arr3[] = {1, 2, 3};

        String x = new String("ghjdfd");


        System.out.println(x.length());
        System.out.println(arr1.length);
        System.out.println(arr2);


        if (arr1.equals(arr2))
            System.out.println("Same???");
        else
            System.out.println("Not same???");


        if (arr1 == arr2)
            System.out.println("Same");
        else
            System.out.println("Not same");

        Integer a = 128;
        Integer b = 128;

        if (a == b)
            System.out.println("Same@@@@@@@");
        else
            System.out.println("Not same@@@@@@");

        if (Arrays.equals(arr1, arr2))
            System.out.println("Same!!!");
        else
            System.out.println("Not same!!!");
    }





}

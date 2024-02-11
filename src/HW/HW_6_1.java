package HW;
public class HW_6_1 {

    public static void main(String[] args) {

//        Task_1
//        Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//        Для указанной строки ответ будет “ооооо” (или в столбик)

//        String s = "Перестановочный алгоритм быстрого действия";
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == 'о') {
//                System.out.println(c);
//            }
//       }

//        System.out.println(s2.concat("e"));
//        System.out.println(s.charAt(10));
//        System.out.println(s.charAt(19));
//        System.out.println(s.charAt(30));
//        System.out.println(s.charAt(32));


//        Task_2
//        Дана строка:
//          String s2 = "Перевыборы выбранного президента";
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.


//        String s2 = "Перевыборы выбранного президента";
//        int count = 0;
//        for (int i = 0; i < s2.length(); i++) {
//            char c = s2.charAt(i);
//            if (c == 'е') {
//                count++;
//            }
//        }
//        System.out.println(count);


//        Task_3
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//        Для указанной строки ответ будет 6, 15, 29.


//       String s3 = "Посмотрите как Рите нравится ритм";
//
//        for (int i = 0; i < s3.length() -3; i++) {
//            if (s3.substring(i, i +3 ).toLowerCase(Locale.ROOT).equals("рит")) {
//                System.out.println(i);
//            }
//        }
//
//        int index = s3.indexOf("рит");
//        while (index !=-1){
//            System.out.println(index);
//            index = s3.toLowerCase().indexOf("рит",index + 1);
//        }


//        Task_4
//        Дан массив:
//        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.


        String[][] array = {{"Привет", "всем", "кто" },
                           {"изучает", "язык", "программирования" },
                           {"java" }};

        int count =0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е") ) {
                   count++;
                }
            }
        }
        System.out.println(count);
    }
}
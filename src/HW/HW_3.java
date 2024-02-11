package HW;

public class HW_3 {


    public static void main(String[] args) {

//        Task_1
//        Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
//        a == b - если переменные равны
//        a < b - если переменная a меньше b
//        a > b - если переменная b меньше a

         int a = 10;
         int b = 7;

         if (a==b){
             System.out.println("The varible a and b equal" );
         } else if (a<b) {
             System.out.println("The varrible a less b " );
         } else if (a>b) {
             System.out.println("The varrible a bigger b " );
         }



//         Task_2
//         Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
//         maybe a and b are even - если сумма переменных четная
//         some variable is odd - если сумма переменных нечетная

        if ((a + b)% 2 == 0){
            System.out.println("The varrible  are even" );
        } else  {
            System.out.println("The varrible is odd ");


        }



//        Task_3
//        Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
//        больше 10 - если переменная больше 10
//        меньше 100 - если переменная меньше 100
//        результат деления на 2 больше 20 - если это соответствует истине
//        значение переменной между 5 и 40 включительно - если это правда
//        значение переменной меньше 5 или больше 40 - если предыдущие условие ложное

        int c = 30;

        if (c > 10){
            System.out.println("The varrible a bigger 10" );
        } if (c < 100) {
            System.out.println("The varible c is the less than 100 ");
        } if (c /2 >20 ) {
            System.out.println("The varible c is the bigger than 20 ");
        } if (c >= 5 && c <= 40) {
            System.out.println("The varible c is the between 5 and 40 ");
        } else   {
            System.out.println("The varible c is not between 5 and 40 ");






    }
  }
}
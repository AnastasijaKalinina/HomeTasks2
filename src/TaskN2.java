public class TaskN2 {
    /*Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
     *Для решения написать 2 функции, которые будут принимать введенное целое число,
     *а возвращать количество четных цифр (вторая функция - нечетных).
     *Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
     */
    public static void main(String[] args) {
        int value = 228910;
        int evenResult = evenNumbers(value);
        int oddResult = oddNumbers(value);
        System.out.println(evenResult);
        System.out.println(oddResult);

    }

    public static int evenNumbers(int value) {
        int i = 0;
        while (value >= 1) {
            int i1 = value % 10;
            if (i1 % 2 == 0) {
                i++;
            }
            value /= 10;
        }

        return i;
    }

    public static int oddNumbers(int value) {
        int a = 0;
        while (value >= 1) {
            int a1 = value % 10;
            if (a1 % 2 != 0) {
                a++;
            }
            value /= 10;
        }
        return a;
    }
}

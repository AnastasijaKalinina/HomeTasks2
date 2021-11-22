public class TaskN1 {
    /*Дано целое число.
     *Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
     *Результат вывести на консоль.
     *Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
     *Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
     */

    public static void main(String[] args) {
        int value = 2547893;
        int number = getReverseInt(value);
        System.out.println(number);
    }

    public static int getReverseInt(int value) {
        int resultNumber = 0;
        for (int i = value; i !=0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        return resultNumber;
    }
}

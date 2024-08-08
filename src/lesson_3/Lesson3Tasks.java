package lesson_3;

/**
 * Класс с выполнением задач из третьего урока. Для каждой задачи собственный метод.
 *
 * @author Buyevich_IG
 */
public class Lesson3Tasks {

    /**
     * Task 1
     * Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
     */
    public static void resulTask1(int[] arrayInt) {
        Utils.printArray(arrayInt);

        for (int i = arrayInt.length-1; i >= 0; i--) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();
    }

    /**
     * Task 2
     * Найти минимальный-максимальный элементы и вывести в консоль.
     */
    public static void resulTask2(int[] arrayInt) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int element : arrayInt) {
            if (min > element) {
                min = element;
            }
            if (max < element) {
                max = element;
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    /**
     * Task 3
     * Найти индексы минимального и максимального элементов и вывести в консоль.
     */
    public static void resulTask3(int[] arrayInt) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < arrayInt.length; i++) {
            if (min > arrayInt[i]) {
                min = arrayInt[i];
                minIndex = i;
            }
            if (max < arrayInt[i]) {
                max = arrayInt[i];
                maxIndex = i;
            }
        }
        System.out.println("index min= " + minIndex);
        System.out.println("index max = " + maxIndex);
    }

    /**
     * Task 4
     * Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
     * сообщение, что их нет.
     */
    public static void resulTask4(int[] arrayInt) {
        int countZero = 0;
        for (int element : arrayInt) {
            if (element == 0) {
                countZero++;
            }
        }
        System.out.println(countZero == 0 ? "no zeros" : "count zeros = " + countZero);
    }

    /**
     * Task 5
     * Пройти по массиву и поменять местами элементы первый и последний, второй и
     * предпоследний и т.д.
     */
    public static void resulTask5(int[] arrayInt) {
        int middle = (arrayInt.length) / 2;
        for (int i = 0, j = arrayInt.length - 1; i < middle; i++, j--) {
            arrayInt[i] += arrayInt[j];
            arrayInt[j] = arrayInt[i] - arrayInt[j];
            arrayInt[i] -= arrayInt[j];
        }
        Utils.printArray(arrayInt);
    }

    /**
     * Task 6
     * Проверить, является ли массив возрастающей последовательностью (каждое следующее
     * число больше предыдущего).
     */
    public static void resulTask6(int[] arrayInt) {
        boolean isNotAscending = false;
        for (int i = 0; i < arrayInt.length - 1; i++) {
            if (arrayInt[i] > arrayInt[i + 1]) {
                isNotAscending = true;
                break;
            }
        }
        System.out.println(isNotAscending ? "non-increasing sequence" : "ascending sequence");
    }

    /**
     * Additional task
     * Имеется массив из неотрицательных чисел(любой). Представьте что массив
     * представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
     * добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
     * содержит нуля в начале, кроме самого числа 0.
     * Пример:
     * Input: [1,4,0,5,6,3]
     * Output: [1,4,0,5,6,4]
     * Input: [9,9,9]
     * Output: [1,0,0,0]
     */
    public static void additionalTask_v1(int[] arrayInt) {
        Utils.printArray(arrayInt);
        arrayInt[arrayInt.length - 1]++;
        arrayInt = recursionAdditionalTask(arrayInt, arrayInt.length - 1);
        Utils.printArray(arrayInt);
        System.out.println("----------------------------");
    }

    private static int[] recursionAdditionalTask(int[] arrayInt, int index) {
        if (arrayInt[index] == 10) {
            if (index - 1 == -1) {
                int[] newArrayInt = new int[arrayInt.length + 1];
                for (int i = 0; i < arrayInt.length; i++) {
                    newArrayInt[i + 1] = arrayInt[i];
                }
                arrayInt = newArrayInt;
                index++;
            }
            arrayInt[index] = 0;
            arrayInt[index - 1] += 1;
            arrayInt = recursionAdditionalTask(arrayInt, index - 1);
        }
        return arrayInt;
    }

    /**
     * более грубый и затратный способ решения через строки, но более читабельный и понятный
     *
     * @param arrayInt массив
     */
    public static void additionalTask_v2(int[] arrayInt) {
        Utils.printArray(arrayInt);
        StringBuilder sb = new StringBuilder();
        for (int j : arrayInt) {
            sb.append(j);
        }

        Integer number = Integer.valueOf(sb.toString());//
        number++;
        sb = new StringBuilder();
        sb.append(number);

        arrayInt = new int[sb.length()];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Character.getNumericValue(sb.charAt(i));
        }

        Utils.printArray(arrayInt);
        System.out.println("----------------------------");
    }
}

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void task_1_1() {
        int i, k, n, s = 0;
        int A[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 1: В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К");
        System.out.print("n = ");
        n = input.nextInt();
        A = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = (int)(Math.random()*(n+1));
        }
        System.out.println("Сгенерированный массив");
        System.out.print("| ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + " | ");
        }
        System.out.print("\nk = ");
        k = input.nextInt();
        for (i = 0; i < n; i++) {
            if(A[i] % k == 0) s += A[i];
        }
        System.out.println("Ответ: s = " + s);
    }

    public static void task_1_2() {
        int i, k = 0, n;
        double z;
        double A[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 2: Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим \n" +
                "числом. Подсчитать количество замен");
        System.out.print("n = ");
        n = input.nextInt();
        A = new double[n];
        for (i = 0; i < n; i++) {
            A[i] = (Math.random()*(20+1));
        }
        System.out.println("Сгенерированный массив");
        for (i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
        System.out.print("\nz = ");
        z = input.nextDouble();
        for (i = 0; i < n; i++) {
            if(A[i] > z) {
                A[i] = z;
                k++;
            }
        }
        System.out.println("Ответ: всего замен: " + k);
        System.out.println("Итоговый массив");
        for (i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
    }

    public static void task_1_3() {
        int i, kp = 0, kn = 0, knull = 0, n;
        double A[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 3: Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, \n" +
                "положительных и нулевых элементов");
        System.out.print("n = ");
        n = input.nextInt();
        A = new double[n];
        for (i = 0; i < n; i++) {
            A[i] = (Math.random()*(40+1) - 20);
        }
        System.out.println("Сгенерированный массив");
        for (i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
        for (i = 0; i < n; i++) {
            if(A[i] > 0) {
                kp++;
            }
            if(A[i] < 0) {
                kn++;
            }
            if(A[i] == 0) {
                knull++;
            }
        }
        System.out.println("Ответ: нулевых = " + knull + "\n" +
                           " положительных = " + kp + "\n" +
                           " отрицательных = " + kn);
    }

    public static void task_1_4() {
        int i, kmin = 0, kmax = 0, n;
        double A[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 4: Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы");
        System.out.print("n = ");
        n = input.nextInt();
        A = new double[n];
        for (i = 0; i < n; i++) {
            A[i] = (Math.random()*(40+1) - 20);
        }
        System.out.println("Сгенерированный массив");
        for (i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
        for (i = 0; i < n; i++) {
            if(A[i] < A[kmin]) {
                kmin = i;
            }
        }
        for (i = 0; i < n; i++) {
            if(A[i] > A[kmax]) {
                kmax = i;
            }
        }
        double p = A[kmin];
        A[kmin] = A[kmax];
        A[kmax] = p;
        System.out.println("\nИтоговый");
        for (i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
    }

    public static void task_1_5() {
        int i, n;
        int A[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 5: Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i");
        System.out.print("n = ");
        n = input.nextInt();
        A = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = (int)(Math.random()*(10+1));
        }
        System.out.println("Сгенерированный массив");
        System.out.print("| ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + " | ");
        }
        System.out.println("\nОтвет:");
        System.out.print("| ");
        for (i = 0; i < n; i++) {
            if (A[i] > i) {
                System.out.print(A[i] + " | ");
            }
        }
    }

    public static void task_1_6() {
        int i, n;
        double s = 0;
        double A[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 6: Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых \n" +
                "являются простыми числами");
        System.out.print("n = ");
        n = input.nextInt();
        A = new double[n];
        for (i = 0; i < n; i++) {
            A[i] = (Math.random()*(20+1));
        }
        System.out.println("Сгенерированный массив");
        for (i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
        for (i = 0; i < n; i++) {
            if(BigInteger.valueOf(i+1).isProbablePrime((int) Math.log(i+1))) {
                s += A[i];
            }
        }
        System.out.println("Ответ: s = " + s);
    }

    public static void task_1_7() {
        int i, kmax = 0, n;
        double A[];
        Scanner input = new Scanner(System.in);
            System.out.println("Задача 7: Даны действительные числа а1 ,а2 ,..., аn. Найти max");
        System.out.print("n = ");
        n = input.nextInt();
        A = new double[n];
        for (i = 0; i < n; i++) {
            A[i] = (Math.random()*(40+1) - 20);
        }
        System.out.println("Сгенерированный массив");
        for (i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
        for (i = 0; i < n; i++) {
            if(A[i] > A[kmax]) {
                kmax = i;
            }
        }
        System.out.println("\nОтвет: max = " + A[kmax]);
    }

    public static void task_1_8() {
        int i, k = 0, n;
        double A[], B[];
        double min;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 8: Дана последовательность целых чисел а1 ,а2 ,..., аn. Образовать новую последовательность, выбросив из \n" +
                "исходной те члены, которые равны \n" +
                "min");
        System.out.print("n = ");
        n = input.nextInt();
        A = new double[n];
        for (i = 0; i < n; i++) {
            A[i] = (Math.random()*(40+1) - 20);
        }
        System.out.println("Сгенерированный массив");
        for (i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
        min = A[0];
        for (i = 1; i < n; i++) {
            if(A[i] < min) {
                min = A[i];
            }
        }
        for (i = 0; i < n; i++) {
            if(A[i] == min) {
                k++;
            }
        }
        B = new double[n - k];
        int j = 0;
        for (i = 0; i < n; i++) {
            if(A[i] != min) {
                B[j] = A[i];
                j++;
            }
        }
        System.out.println("Новый массив");
        for (i = 0; i < n - k; i++) {
            System.out.println(B[i]);
        }
    }

    public static void task_1_9() {
        int i, n, max = 0, minmax = 999;
        int A[], K[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 9: В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких \n" +
                "чисел несколько, то определить наименьшее из них");
        System.out.print("n = ");
        n = input.nextInt();
        A = new int[n];
        K = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = (int)(Math.random()*(10+1));
            K[i] = 0;
        }
        System.out.println("Сгенерированный массив");
        System.out.print("| ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + " | ");
        }
        for (i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (A[i] == A[j]) {
                    K[i]++;
                }
            }
        }
        for (i = 0; i < n; i++) {
            if(K[i] > max) {
                max = K[i];
                minmax = A[i];
            }
        }
        for (i = 0; i < n; i++) {
            if(K[i] == max) {
                if(A[i] < minmax)
                minmax = A[i];
            }
        }
        System.out.println("\nОтвет: " + minmax);
    }

    public static void task_1_10() {
        int i, n, j = 0;
        int A[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 10: Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй \n" +
                "элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать");
        System.out.print("n = ");
        n = input.nextInt();
        A = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = (int)(Math.random()*(10+1));
        }
        System.out.println("Сгенерированный массив");
        System.out.print("| ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + " | ");
        }
        for (i = 0; i < n; i=i+2) {
            A[j] = A[i];
            j++;
        }
        for (i = (int)(n+1)/2; i < n; i++) {
            A[i] = 0;
        }
        System.out.println("\nИтоговый массив:");
        System.out.print("| ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + " | ");
        }
    }


    public static void task_2_1() {
        int i, j, k = 0;
        int[][] A;
        int[] B;
        System.out.println("Задача 1: Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего");
        A = new int[5][5];
        B = new int[5];
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < 5; i++)
        {
            for (j = 0; j < 5; j++) {
                A[i][j] = (int)(Math.random()*(10));
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        i = 0;
        for (j = 0; j < 5; j++)
        {
            if (A[0][j] > A[4][j]) {
                k++;
                B[i] = j;
                i++;
            }
        }
        System.out.println("Ответ");
        for (i = 0; i < 5; i++)
        {
            for (j = 0; j < k; j++) {
                System.out.print(A[i][B[j]] + " | ");
            }
            System.out.println();
        }
    }

    public static void task_2_2() {
        int i, j;
        int[][] A;
        System.out.println("Задача 2:  Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали");
        A = new int[5][5];
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < 5; i++)
        {
            for (j = 0; j < 5; j++) {
                A[i][j] = (int)(Math.random()*(10));
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("Диагональ: ");
        for (i = 0; i < 5; i++) {
            System.out.print(A[i][i] + " | ");
        }
    }

    public static void task_2_3() {
        Scanner input = new Scanner(System.in);
        int i, j, k, p;
        int[][] A;
        System.out.println("Задача 3: Дана матрица. Вывести k-ю строку и p-й столбец матрицы");
        A = new int[5][5];
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < 5; i++)
        {
            for (j = 0; j < 5; j++) {
                A[i][j] = (int)(Math.random()*(10));
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.print("k = ");
        k = input.nextInt();
        System.out.print("Строка: ");
        for (j = 0; j < 5; j++) {
            System.out.print(A[k-1][j] + " | ");
        }
        System.out.print("\np = ");
        p = input.nextInt();
        System.out.println("Столбец: ");
        for (i = 0; i < 5; i++) {
            System.out.println(A[i][p-1] + " | ");
        }
    }

    public static void task_2_4() {
        Scanner input = new Scanner(System.in);
        int i, j, n;
        int[][] A;
        System.out.println("Задача 4:  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)");
        System.out.print("n = ");
        n = input.nextInt();
        A = new int[n][n];
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    A[i][j] = j + 1;
                    System.out.print(A[i][j] + " | ");
                } else if (i % 2 != 0) {
                    A[i][j] = n - j;
                    System.out.print(A[i][j] + " | ");
                }
            }
            System.out.println();
        }
    }

    public static void task_2_5() {
        Scanner input = new Scanner(System.in);
        int i, j, n;
        int[][] A;
        System.out.println("Задача 5:  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)");
        System.out.print("n = ");
        n = input.nextInt();
        A = new int[n][n];
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++) {
                A[i][j] = 0;
            }
        }
        int m = n;
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++) {
                A[i][j] = i+1;
            }
            m--;
            System.out.println();
        }
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void task_2_6() {
        Scanner input = new Scanner(System.in);
        int i, j, n;
        int[][] A;
        System.out.println("Задача 6:  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)");
        System.out.print("n = ");
        n = input.nextInt();
        A = new int[n][n];
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++) {
                A[i][j] = 0;
            }
        }
        int m = n;
        int t = 0;
        for (i = 0; i < n/2; i++)
        {
            for (j = t; j < m; j++) {
                A[i][j] = 1;
            }
            m--;
            t++;
            System.out.println();
        }
        m++;
        t--;
        for (i = n/2; i < n; i++)
        {
            for (j = t; j < m; j++) {
                A[i][j] = 1;
            }
            m++;
            t--;
            System.out.println();
        }

        System.out.println("Сгенерированная матрица");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void task_2_7() {
        Scanner input = new Scanner(System.in);
        int i, j, n, k = 0;
        double[][] A;
        System.out.println("Задача 7:  Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов в ней");
        System.out.print("n = ");
        n = input.nextInt();
        A = new double[n][n];
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++) {
                A[i][j] = Math.sin((i*i-j*j)/n);
                if (A[i][j] > 0) {
                    k++;
                }
                System.out.printf("%.3f", A[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов = " + k);
    }

    public static void task_2_8() {
        Scanner input = new Scanner(System.in);
        int i, j, n1, n2, p;
        int[][] A;
        System.out.println("Задача 8: В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить \n" +
                "на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит \n" +
                "пользователь с клавиатуры");
        A = new int[5][5];
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < 5; i++)
        {
            for (j = 0; j < 5; j++) {
                A[i][j] = (int)(Math.random()*(10));
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.print("Номер первого столбца = ");
        n1 = input.nextInt() - 1;
        System.out.print("Номер второго столбца = ");
        n2 = input.nextInt() - 1;
        for (i = 0; i < 5; i++)
        {
            p = A[i][n1];
            A[i][n1] = A[i][n2];
            A[i][n2] = p;
        }
        System.out.println("Результат");
        for (i = 0; i < 5; i++)
        {
            for (j = 0; j < 5; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void task_2_9() {
        int i, j;
        int[][] A;
        int[] S;
        System.out.println("Задача 9:  Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой \n" +
                "столбец содержит максимальную сумму");
        A = new int[5][5];
        S = new int[5];
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < 5; i++)
        {
            for (j = 0; j < 5; j++) {
                A[i][j] = (int)(Math.random()*(10));
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        for (j = 0; j < 5; j++)
        {
            for (i = 0; i < 5; i++) {
                S[j] += A[i][j];
            }
        }
        System.out.println("Суммы столбцов");
        for (i = 0; i < 5; i++)
        {
            System.out.print(S[i] + " | ");
        }
    }

    public static void task_2_10() {
        int i, j;
        int[][] A;
        System.out.println("Задача 10:  Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали");
        A = new int[5][5];
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < 5; i++)
        {
            for (j = 0; j < 5; j++) {
                A[i][j] = (int)(Math.random()*(20) - 10);
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("Положительные элементы диагонали: ");
        for (i = 0; i < 5; i++) {
            if (A[i][i] > 0) {
                System.out.print(A[i][i] + " | ");
            }
        }
    }

    public static void task_2_11() {
        int i, j;
        int[][] A;
        int[] K;
        System.out.println("Задача 11: Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в \n" +
                "которых число 5 встречается три и более раз");
        A = new int[10][20];
        K = new int[10];
        for (i = 0; i < 10; i++) {
            K[i] = 0;
        }
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < 10; i++)
        {
            for (j = 0; j < 20; j++) {
                A[i][j] = (int)(Math.random()*(16));
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        for (i = 0; i < 10; i++)
        {
            for (j = 0; j < 20; j++) {
                if(A[i][j] == 5) {
                    K[i]++;
                }
            }
        }
        System.out.println("и номера строк, в которых число 5 встречается три и более раз");
        for (i = 0; i < 10; i++)
        {
            if(K[i] >= 3) System.out.print(i+1 + " | ");
        }
    }

    public static void task_2_12() {
        int i, j, p, y;
        int[][] A;
        System.out.println("Задача 12: Отсортировать строки матрицы по возрастанию и убыванию значений элементов");
        A = new int[6][6];
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < 6; i++)
        {
            for (j = 0; j < 6; j++) {
                A[i][j] = (int)(Math.random()*(16));
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6-1; j++) {
                for (y = j; y < 6; y++) {
                    if(A[i][y] > A[i][j]) {
                        p = A[i][y];
                        A[i][y] = A[i][j];
                        A[i][j] = p;
                    }
                }
            }
        }
        System.out.println("По убыванию");
        for (i = 0; i < 6; i++)
        {
            for (j = 0; j < 6; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6-1; j++) {
                for (y = j; y < 6; y++) {
                    if(A[i][y] < A[i][j]) {
                        p = A[i][y];
                        A[i][y] = A[i][j];
                        A[i][j] = p;
                    }
                }
            }
        }
        System.out.println("По возрастанию");
        for (i = 0; i < 6; i++)
        {
            for (j = 0; j < 6; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void task_2_13() {
        int i, j, p, y;
        int[][] A;
        System.out.println("Задача 13: Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов");
        A = new int[6][6];
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < 6; i++)
        {
            for (j = 0; j < 6; j++) {
                A[i][j] = (int)(Math.random()*(16));
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6-1; j++) {
                for (y = j; y < 6; y++) {
                    if(A[y][i] > A[j][i]) {
                        p = A[y][i];
                        A[y][i] = A[j][i];
                        A[j][i] = p;
                    }
                }
            }
        }
        System.out.println("По убыванию");
        for (i = 0; i < 6; i++)
        {
            for (j = 0; j < 6; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6-1; j++) {
                for (y = j; y < 6; y++) {
                    if(A[y][i] < A[j][i]) {
                        p = A[y][i];
                        A[y][i] = A[j][i];
                        A[j][i] = p;
                    }
                }
            }
        }
        System.out.println("По возрастанию");
        for (i = 0; i < 6; i++)
        {
            for (j = 0; j < 6; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void task_2_14() {
        Scanner input = new Scanner(System.in);
        int i, j, k = 0, n, m;
        int[][] A;
        System.out.println("Задача 14:  Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число \n" +
                "единиц равно номеру столбца");
        System.out.print("n = ");
        n = input.nextInt();
        System.out.print("m = ");
        m = input.nextInt();
        A = new int[n][m];
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++) {
                A[i][j] = 0;
            }
        }
        i = 0;
        for (j = 0; j < m; j++) {
            k = 0;
            while (k != j + 1) {
                if (A[i][j] != 1) {
                    A[i][j] = (int) (Math.random() * (2));
                    if (A[i][j] == 1) {
                        k++;
                    }
                    i++;
                    if (i == n) {
                        i = 0;
                    }
                }
            }
        }
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void task_2_15() {
        int i, j, max = 0;
        int[][] A;
        System.out.println("Задача 15: Найдите наибольший элемент матрицы и заменить все нечетные элементы на него");
        A = new int[6][6];
        System.out.println("Сгенерированная матрица");
        for (i = 0; i < 6; i++)
        {
            for (j = 0; j < 6; j++) {
                A[i][j] = (int)(Math.random()*(16));
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
        for (i = 0; i < 6; i++)
        {
            for (j = 0; j < 6; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
        }
        for (i = 0; i < 6; i++)
        {
            for (j = 0; j < 6; j++) {
                if (A[i][j] % 2 != 0) {
                    A[i][j] = max;
                }
            }
        }
        System.out.println("Результат");
        for (i = 0; i < 6; i++)
        {
            for (j = 0; j < 6; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void task_2_16() {
        int n, i, j;
        int[][] A, B;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 16:  Магическим квадратом порядка n называется квадратная матрица размера nxn," +
                " составленная из чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу," +
                "каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат");
        System.out.print("n = ");
        n = input.nextInt();
        A = new int[n][n];
        if(n % 2 != 0) {
            int x = n/2;
            int y = n-1;
            int k1 = 1;

            boolean check = true;
            while (check){
                A[(n-1)-y][x] = k1;
                k1++;
                if(x==n-1) x=-1;
                if(y>=n-1) y=-1;
                y++;
                x++;
                if (A[n-1-y][x] != 0) y--;

                int k2=0;
                for (int[] array:A) {
                    for (int z :array) {
                        if(z == 0) k2++;
                    }
                }
                if (k2==0) check = false;
            }
            System.out.println("Результат");
            for (i = 0; i < n; i++)
            {
                for (j = 0; j < n; j++) {
                    System.out.print(A[i][j] + " | ");
                }
                System.out.println();
            }

        } else if ((n==0)||(n==2)||(n%4!=0)) {
            System.out.println("Невозможно построить такой квадрат");
        } else if(n % 4== 0) {
            B = new int[n][n];
            int t = 1;
            int p;
            for (i = 0; i < n; i++)
            {
                for (j = 0; j < n; j++) {
                    A[i][j] = t;
                    t++;
                }
            }
            t--;
            for (i = 0; i < n; i++)
            {
                for (j = 0; j < n; j++) {
                    B[i][j] = t;
                    t--;
                }
            }
            int m = 4, k = 0, maxpow = n/m, pow1 = 1, pow2 = 1;
            j = 0;
            boolean check = true;
            while (check == true) {
                for (i = k; i < m; i++) {
                    A[i][j] = 0;
                    A[m - i + k - 1][j] = 0;


                    if ((pow1 == maxpow) && (pow2 == maxpow)) {
                        check = false;
                    } else if ((i == m - 1) && (maxpow != pow1)) {
                        k = k + 4;
                        m = m + 4;
                        j = j - 4;
                        pow1++;
                    } else if ((i == m - 1) && (maxpow == pow1)) {
                        k = 0;
                        m = 4;
                        pow1 = 1;
                        pow2++;
                    }

                    j++;
                }
            }
            for (i = 0; i < n; i++)
            {
                for (j = 0; j < n; j++) {
                    if (A[i][j] == 0) {
                        A[i][j] = B[i][j];
                    }
                }
            }


            System.out.println("Результат");
            for (i = 0; i < n; i++)
            {
                for (j = 0; j < n; j++) {
                    System.out.print(A[i][j] + " | ");
                }
                System.out.println();
            }
        }
    }

    public static void task_3_1() {
        int i, k, j = 0;
        int A[], B[], C[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 1: Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в \n" +
                "один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя \n" +
                "дополнительный массив");
        System.out.print("k = ");
        k = input.nextInt();
        A = new int[10];
        B = new int[7];
        C = new int[10+7];
        for (i = 0; i < 10; i++) {
            A[i] = (int)(Math.random()*(10+1));
        }
        for (i = 0; i < 7; i++) {
            B[i] = (int)(Math.random()*(10+1));
        }
        System.out.print("Сгенерированный массив 1\n| ");
        for (i = 0; i < 10; i++) {
            System.out.print(A[i] + " | ");
        }
        System.out.print("\nСгенерированный массив 2\n| ");
        for (i = 0; i < 7; i++) {
            System.out.print(B[i] + " | ");
        }

        for (i = 0; i < k; i++) {
            C[j] = A[i];
            j++;
        }
        for (i = 0; i < 7; i++) {
            C[j] = B[i];
            j++;
        }
        for (i = k; i < 10; i++) {
            C[j] = A[i];
            j++;
        }

        System.out.println("\nОтвет:\n| ");
        for (i = 0; i < 10+7; i++) {
            System.out.print(C[i] + " | ");
        }
    }

    public static void task_3_2() {
        int i, j = 0, t = 1;
        int A[], B[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 2: Даны две последовательности a1 >= a2 ... >= an и b1 >= b2 ... >= bm " +
                "Образовать из них новую последовательность \n" +
                "чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать");

        A = new int[10];
        B = new int[7];
        for (i = 0; i < 10; i++) {
            A[i] = t;
            t += (int)(Math.random()*(5));
        }
        t = (int)(Math.random()*(3));
        for (i = 0; i < 7; i++) {
            B[i] = t;
            t += (int)(Math.random()*(5));
        }
        System.out.print("Сгенерированный массив 1\n| ");
        for (i = 0; i < 10; i++) {
            System.out.print(A[i] + " | ");
        }
        System.out.print("\nСгенерированный массив 2\n| ");
        for (i = 0; i < 7; i++) {
            System.out.print(B[i] + " | ");
        }
        t = 0;
        for (i = 0; i < 10; i++) {
            for (j = t; j < 7; j++) {
                if (B[j]<A[i]) {
                    A[i] = B[j];
                    B[j] = 0;
                    t++;
                }
            }
        }
        System.out.print("\nНовый массив\n| ");
        for (i = 0; i < 10; i++) {
            System.out.print(A[i] + " | ");
        }
    }

    public static void task_3_3() {
        int i, j = -1, t = 1, kmax;
        int A[];
        System.out.println("Задача 3:  Сортировка выбором. Дана последовательность чисел \n" +
                "a1 <= a2 <= ...  an\n" +
                "Требуется переставить элементы так, \n" +
                "чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший \n" +
                "элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура \n" +
                "повторяется. Написать алгоритм сортировки выбором");

        A = new int[10];
        for (i = 0; i < 10; i++) {
            A[i] = t;
            t += (int)(Math.random()*(5));
        }
        System.out.print("Сгенерированный массив\n| ");
        for (i = 0; i < 10; i++) {
            System.out.print(A[i] + " | ");
        }

        while(j != 8) {
            j++;
            kmax = j;
           for (i = j; i < 10; i++) {
               if (A[i] > A[kmax]) {
                   kmax = i;
               }
           }
           t = A[j];
           A[j] = A[kmax];
           A[kmax] = t;
        }
        System.out.print("\nОтсортированный массив\n| ");
        for (i = 0; i < 10; i++) {
            System.out.print(A[i] + " | ");
        }
    }

    public static void task_3_4() {
        int i, p, k = 0;
        int A[];
        System.out.println("Задача 4:   Сортировка обменами. Дана последовательность чисел \n" +
                "a1 <= a2 <= ...  an\n" +
                "Требуется переставить числа в " +
                "порядке возрастания + \n" +
                "Ps. Заполнил не как в последовательности а рандомно, т к иначе они и так стояли бы в пор возрастания");
        A = new int[10];
        for (i = 0; i < 10; i++) {
            A[i] = (int)(Math.random()*(10));
        }
        System.out.print("Сгенерированный массив\n| ");
        for (i = 0; i < 10; i++) {
            System.out.print(A[i] + " | ");
        }
        i = 0;
        while(k != 9){
           if (A[i]>A[i+1]) {
               p = A[i];
               A[i] = A[i+1];
               A[i+1] = p;
               k = 0;
           } else {
               k++;
           }
           if (i < 8) {
               i++;
           } else {
               i = 0;
           }
        }
        System.out.print("\nОтсортированный массив\n| ");
        for (i = 0; i < 10; i++) {
            System.out.print(A[i] + " | ");
        }
    }

    public static void task_3_5() {
        int i, t, n = 10, j;
        int A[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 5: Сортировка вставками. Дана последовательность чисел \n" +
                "a1, a2, ...  an\n" +
                "Требуется переставить числа в " +
                "порядке возрастания");
        A = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = (int)(Math.random()*(10));
        }
        System.out.print("Сгенерированный массив\n| ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + " | ");
        }
        for (i = 0; i < n; i++) {
            t = A[i];
            j = i - 1;
            for (; j >= 0; j--) {
                if (t < A[j]) {
                    A[j + 1] = A[j];
                } else {
                    break;
                }
            }
            A[j + 1] = t;
        }
        System.out.print("\nОтсортированный массив\n| ");
        for (i = 0; i < 10; i++) {
            System.out.print(A[i] + " | ");
        }
        System.out.print("\nДвоичный поиск, введите значение элемента: ");
        t = input.nextInt();
        j = binarySearch(A, 0, n, t);
        System.out.print("Номер искомого элемента: " + (j + 1));
    }

    public static void task_3_6() {
        int i, n = 10, j, t;
        int A[];
        System.out.println("Задача 6: Сортировка Шелла. Дана последовательность чисел \n" +
                "a1, a2, ...  an\n" +
                "Требуется переставить числа в " +
                "порядке возрастания");
        A = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = (int)(Math.random()*(10));
        }
        System.out.print("Сгенерированный массив\n| ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + " | ");
        }
        int m = n/2;
        while (m >= 1) {
            for (i = 0; i < n; i++) {
                for (j = i - m; j >= 0; j -= m) {
                    if (A[j] > A[j + m]) {
                        t = A[j];
                        A[j] = A[j + m];
                        A[j + m] = t;
                    }
                }
            }
            m = m / 2;
        }
        System.out.print("\nОтсортированный массив\n| ");
        for (i = 0; i < 10; i++) {
            System.out.print(A[i] + " | ");
        }
    }

    public static void task_3_7() {
        int i, j = 0, t = 1;
        int A[], B[], K[];
        System.out.println("Задача 7: Даны две последовательности a1 >= a2 ... >= an и b1 >= b2 ... >= bm " +
                "Требуется указать те места, на которые нужно вставлять элементы последовательности bn \n" +
                "в первую последовательность так, чтобы новая последовательность оставалась возрастающей");

        A = new int[10];
        B = new int[7];
        K = new int[7];
        for (i = 0; i < 10; i++) {
            A[i] = t;
            t += (int)(Math.random()*(5));
        }
        t = (int)(Math.random()*(3));
        for (i = 0; i < 7; i++) {
            B[i] = t;
            t += (int)(Math.random()*(5));
        }
        System.out.print("Сгенерированный массив 1\n| ");
        for (i = 0; i < 10; i++) {
            System.out.print(A[i] + " | ");
        }
        System.out.print("\nСгенерированный массив 2\n| ");
        for (i = 0; i < 7; i++) {
            System.out.print(B[i] + " | ");
        }
        t = 0;
        for (i = 0; i < 10; i++) {
            for (j = t; j < 7; j++) {
                if (B[j]<A[i]) {
                    K[t] = i+1;
                    B[j] = 0;
                    t++;
                    break;
                }
            }
        }
        System.out.print("\nМеста на которые нужно вставить элементы из bn\n| ");
        for (i = 0; i < 7; i++) {
            System.out.print(K[i] + " | ");
        }
    }

    public static void task_3_8() {
        int i, j = 0, p, n = 10, t = 0;
        int P[], Q[];
        System.out.println("Задача 8: Даны дроби " +
                "Составить программу, которая приводит эти дроби к общему \n" +
                "знаменателю и упорядочивает их в порядке возрастания");

        P = new int[n];
        Q = new int[n];
        for (i = 0; i < n; i++) {
            P[i] = (int)(Math.random()*(9)+1);
        }
        for (i = 0; i < n; i++) {
            Q[i] = (int)(Math.random()*(9)+1);
        }
        System.out.print("Дроби 1\n|| ");
        for (i = 0; i < n; i++) {
            System.out.print(P[i] + "/" + Q[i] + " || ");
        }

        for (i = 0; i < n-1; i++)
            for (j = i; j < n; j++) {
                if ((Q[i] % Q[j] != 0) && (Q[j] % Q[i] != 0)) {
                    P[i] = P[i]*Q[j];
                    P[j] = P[j]*Q[i];
                    Q[i] = Q[i] * Q[j];
                    Q[j] = Q[i];
                } else {
                    if (Q[i]>Q[j]) {
                        int factor = (int)(Q[i]/Q[j]);
                        P[j] = P[j]*factor;
                        Q[j] = Q[j]*factor;
                    } else {
                        int factor = (int)(Q[j]/Q[i]);
                        P[i] = P[i]*factor;
                        Q[i] = Q[i]*factor;
                    }
                }
            }
        for (i = 0; i < n-1; i++)
            for (j = i; j < n; j++) {
                if (P[i]>P[j]) {
                    p = P[i];
                    P[i] = P[j];
                    P[j] = p;
                }
            }
        for (i = 0; i < n-1; i++) {
            if (t == 0) {
                t = gcd(P[i + 1], P[i]);
            } else t = gcd(P[i + 1], t);
        }
        for (i = 0; i < n; i++) {
            P[i] = P[i]/t;
            Q[i] = Q[i]/t;
        }

        System.out.print("\nДроби 2\n|| ");
        for (i = 0; i < n; i++) {
            System.out.print(P[i] + "/" + Q[i] + " || ");
        }
    }

    public static void task_4_1() {
        int a, b, nod, nok;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 1: НОК и НОД для двух чисел");
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        nod = gcd(a, b);
        nok = a*b/nod;
        System.out.println("Ответ: НОД = " + nod + ", НОК = " + nok);
    }

    public static void task_4_2() {
        int i, t = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 2: НОД для 4-х чисел");
        int P[] = new int[4];
        for (i = 0; i < 4; i++) {
            System.out.print(i+1 + "-e число = ");
            P[i] = input.nextInt();
        }
        for (i = 0; i < 3; i++) {
            if (t == 0) {
                t = gcd(P[i + 1], P[i]);
            } else t = gcd(P[i + 1], t);
        }
        System.out.print("НОД = " + t);
    }

    public static void task_4_3() {
        int a;
        double S;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 3: Вычислить площадь правильного шестиугольника");
        System.out.print("a = ");
        a = input.nextInt();
        S =  Math.pow(3, 0.5)*a*a*6/4;
        System.out.print("S = ");
        System.out.printf("%.3f", S);
    }

    public static void task_4_4() {
        int i, n;
        int X[], Y[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 4:  На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими \n" +
                "из пар точек самое большое расстояние. Указание. Координаты точек занести в массив");
        System.out.print("n = ");
        n = input.nextInt();
        X = new int[n];
        Y = new int[n];
        for (i = 0; i < n; i++) {
            X[i] = (int)(Math.random()*(41) - 20);
        }
        for (i = 0; i < n; i++) {
            Y[i] = (int)(Math.random()*(41) - 20);
        }
        System.out.print("Координаты точек \n|| ");
        for (i = 0; i < n; i++) {
            System.out.print(X[i] + ", " + Y[i] + " || ");
        }
        double[] D = findDistance(X, Y);
        int kMaxDistance = findKMaxDistance(D);
        System.out.println("\nМаксимальное растояние (" + D[kMaxDistance] + ") между точками:\n" +
                + X[kMaxDistance] + ", " + Y[kMaxDistance] + "\n" +
                + X[kMaxDistance+1] + ", " + Y[kMaxDistance+1]);
    }

    public static void task_4_5() {
        int i, n, p, max = 0, max2 = 0;
        int A[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 5: Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, \n" +
                "которое меньше максимального элемента массива, но больше всех других элементов)");
        System.out.print("n = ");
        n = input.nextInt();
        A = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = (int)(Math.random()*(9) + 1);
        }
        System.out.print("Элементы массива \n|| ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + " || ");
        }
        for (i = 0; i < n; i++) {
            if (A[i]> max) {
                max = A[i];
            }
        }
        for (i = 0; i < n; i++) {
            if ((A[i] < max) && (A[i]> max2)) {
                max2 = A[i];
            }
        }
        System.out.print("\nОтвет: " + max2);
    }

    public static void task_4_6() {
        int i, t = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 6: Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми");
        int P[] = new int[3];
        for (i = 0; i < 3; i++) {
            System.out.print(i+1 + "-e число = ");
            P[i] = input.nextInt();
        }
        for (i = 0; i < 2; i++) {
            if (t == 0) {
                t = gcd(P[i + 1], P[i]);
            } else t = gcd(P[i + 1], t);
        }
        if (t == 1) {
            System.out.print("Эти числа взаимнопростые");
        } else System.out.print("Эти числа не взаимнопростые");
    }

    public static void task_4_7() {
        int S = 0, i;
        System.out.println("Задача 7: Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9");
        for (i = 0; i < 9; i++) {
            if ((i+1) % 2 != 0) {
                S += fact(i + 1);
            }
        }
        System.out.println("Ответ: " + S);

    }

    public static void task_4_8() {
        int i, n, p, k, S = 0;
        int D[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 8:  Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].\n" +
                "Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов \n" +
                "массива с номерами от k до m");
        System.out.print("n = ");
        n = input.nextInt();
        D = new int[n];
        for (i = 0; i < n; i++) {
            D[i] = (int)(Math.random()*(9) + 1);
        }
        System.out.print("Элементы массива \n|| ");
        for (i = 0; i < n; i++) {
            System.out.print(D[i] + " || ");
        }
        System.out.print("\nk = ");
        k = input.nextInt();
        if (n>=k+2) {
            S = D[k-1] + D[k] + D[k+1];
            System.out.println("Ответ: " + S);
        } else {
            System.out.println("После данного элемента нет ещё двух");
        }
    }

    public static void task_4_9() {
        int X, Y, Z, T;
        double S = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 9: Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, \n" +
                "если угол между сторонами длиной X и Y— прямой");
        System.out.print("X = ");
        X = input.nextInt();
        System.out.print("Y = ");
        Y = input.nextInt();
        System.out.print("Z = ");
        Z = input.nextInt();
        System.out.print("T = ");
        T = input.nextInt();
        S = areaQuadrangleOnSides(X, Y, Z, T);
        System.out.println("Ответ: " + S);
    }

    public static void task_4_10() {
        int n, i;
        int A[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 10: Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого \n" +
                "являются цифры числа N");
        System.out.print("N = ");
        n = input.nextInt();
        A = createArrayOfN(n);
        System.out.print("Массив:\n|| ");
        for (i = 0; i < 10; i++) {
            System.out.print(A[i] + " || ");
        }
    }

    public static void task_4_11() {
        int a, b, numOfA, numOfB;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 11: Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр");
        System.out.print("A = ");
        a = input.nextInt();
        System.out.print("B = ");
        b = input.nextInt();
        numOfA = numOfDigits(a);
        numOfB = numOfDigits(b);
        if (numOfA>numOfB) {
            System.out.println("В числе А больше цифр");
        } else if (numOfA<numOfB) {
            System.out.println("В числе B больше цифр");
        } else System.out.println("В числах А и B одинаковое количество цифр");
    }

    public static void task_4_12() {
        int K, N;
        int A[];
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 12: Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого " +
                "являются числа, сумма цифр которых равна К и которые не большее N");
        System.out.print("K = ");
        K = input.nextInt();
        System.out.print("N = ");
        N = input.nextInt();
        A = createArrayOfKAndN(N, K);
        System.out.print("Массив:\n|| ");
        for (int i = 0; i < 10; i++) {
            System.out.print(A[i] + " || ");
        }
    }

    public static void task_4_13() {
        int n, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 13: Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). \n" +
                "Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для \n" +
                "решения задачи использовать декомпозицию");
        System.out.print("n = ");
        n = input.nextInt();
        int A[] = new int[n];
        for (i = n; i <= 2*n-2; i++) {
            if (isSimple(i) && isSimple(i+2))
                System.out.println(i + " и " + (i+2));
        }
    }

    public static void task_4_14() {
        int k, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 14: Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, \n" +
                "возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи \n" +
                "использовать декомпозицию");
        System.out.print("k = ");
        k = input.nextInt();
        for (i = 1; i <= k; i++) {
            if (checkArmstrong(i) == i){
                System.out.print(i + ", ");
            }
        }
    }

    public static void task_4_15() {
        int n, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 15: Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую \n" +
                "последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию");
        System.out.print("n = ");
        n = input.nextInt();
        for (i = (int)Math.pow(10, (n-1)); i <= (Math.pow(10, n) - 1); i++) {
            if (checkConsistency(i)){
                System.out.print(i + ", ");
            }
        }
    }

    public static void task_4_16() {
        int n, i, S = 0, k;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 16: Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. \n" +
                "Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию");
        System.out.print("n = ");
        n = input.nextInt();
        for (i = (int)Math.pow(10, (n-1)); i <= (Math.pow(10, n) - 1); i++) {
            if (checkOdd(i)){
                S += i;
            }
        }
        k = numberOfEven(S);
        System.out.println("Сумма = " + S + ", количество чётныйх чисел = " + k);
    }

    public static void task_4_17() {
        int a, k = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 17:  Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких \n" +
                "действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию");
        System.out.print("a = ");
        a = input.nextInt();
        while (a != 0) {
            k++;
            a = a - sumDigits(a);
        }
        System.out.println("Ответ = " + k);
    }

    static int numberOfEven(int a) {
        int k = 0;
        int capacity = numOfDigits(a);
        int N[] = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            N[i] = a%10;
            a = a/10;
        }
        for (int i = 0; i < capacity; i++) {
            if (N[i] % 2 == 0) {
                k++;
            }
        }
        return k;
    }

    static boolean checkOdd(int a) {
        boolean check = true;
        int capacity = numOfDigits(a);
        int N[] = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            N[i] = a%10;
            a = a/10;
        }
        for (int i = 0; i < capacity; i++) {
            if (N[i] % 2 == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    static boolean checkConsistency(int a) {
        boolean check = true;
        int capacity = numOfDigits(a);
        int N[] = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            N[i] = a%10;
            a = a/10;
        }
        for (int i = 0; i < capacity-1; i++) {
            if (N[i] <= N[i+1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    static int checkArmstrong(int a) {
        int capacity = numOfDigits(a);
        int S = 0;
        int N[] = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            N[i] = a%10;
            a = a/10;
        }
        for (int i = 0; i < capacity; i++) {
            S = S + (int)Math.pow(N[i], capacity);
        }
        return S;
    }

    static int sumDigits(int a) {
        int sum = 0;
        while(a != 0){
            sum += (a % 10);
            a/=10;
        }
        return sum;
    }

    static int numAdjustment(int a, int k, boolean check) {
        if (check == true) {
            a--;
            if (sumDigits(a) != k) a = numAdjustment(a, k, check);
        } else {
            a++;
            if (sumDigits(a) != k) a = numAdjustment(a, k, check);
        }
        return a;
    }

    static boolean isSimple(int a) {
        boolean ans = false;
        if (BigInteger.valueOf(a).isProbablePrime((int) Math.log(a))) ans = true;
        return ans;
    }

    static int[] createArrayOfKAndN(int n, int k) {
        int A[] = new int[10];
        boolean check = false;
        for (int i = 0; i < 10; i++) {
            A[i] = (int)(Math.random()*(n) + 1);
            if (A[i] > (int)(n/2)) {
                check = true;
            } else check = false;
            if (sumDigits(A[i]) != k)  A[i] =  numAdjustment(A[i], k, check);
        }
        return A;
    }

    static int numOfDigits(int a) {
        int number = 1;
        while ((int)a/10 != 0) {
            a = (int)a/10;
            number++;
        }
        return number;
    }

    static int[] createArrayOfN(int n) {
        int A[] = new int[10];
        int capacity = 1, n1 = n;
        while ((int)n1/10 != 0) {
            n1 = (int)n1/10;
            capacity++;
        }
        int N[] = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            N[i] = n%10;
            n = n/10;
        }
        for (int i = 0; i < 10; i++) {
            int t = (int)(Math.random()*(capacity));
            A[i] = N[t];
        }
        return A;
    }

    static double areaQuadrangleOnSides(int X, int Y, int Z, int T) {
        double p, S = 0;
        p = (X + Y + Z + T) / 2;
        S = Math.pow(((p - X)*(p - Y)*(p - Z)*(p - T)), 0.5);
        return S;
    }

    static int fact(int a) {
        int f = 1;
        for (int i = 0; i < a; i++) {
            f = f*(i+1);
        }
        return f;
    }

    static int binarySearch(int[] A, int start, int end, int t) {
        int i = -1;

        while (start <= end) {
            int midle = (end-start)/2;
            if (t > A[midle]) {
                end = midle - 1;
            } else if (t < A[midle]) {
                start = midle + 1;
            } else if (t == A[midle]) {
                i = midle;
                break;
            }
        }
        return i;
    }

    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public static double[] findDistance(int[] X, int[] Y) {
        double[] D = new double[X.length-1];
        for (int i = 1; i < X.length; i++) {
            D[i-1] = Math.pow((Math.pow((X[i] - X[i-1]), 2) + Math.pow((Y[i] - Y[i-1]), 2)), 0.5);
        }
        return D;
    }

    public static int findKMaxDistance(double[] D) {
        int kmax = -1;
        double max = 0;
        for (int i = 0; i < D.length; i++) {
            if(D[i] > max) {
                max = D[i];
                kmax = i;
            }
        }
        return kmax;
    }

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Одномерные массивы\n2 - Массивы массивов\n3 - Одномерные массивы. Сортировки\n4 - Декомпозиция с использованием методов (подпрограммы)");
        int k = input.nextInt();
        switch (k) {
            case 1: {
                System.out.println("Введите номер варианта задания которое нужно решить");
                k = input.nextInt();
                switch (k) {
                    case 1:
                        task_1_1();
                        break;
                    case 2:
                        task_1_2();
                        break;
                    case 3:
                        task_1_3();
                        break;
                    case 4:
                        task_1_4();
                        break;
                    case 5:
                        task_1_5();
                        break;
                    case 6:
                        task_1_6();
                        break;
                    case 7:
                        task_1_7();
                        break;
                    case 8:
                        task_1_8();
                        break;
                    case 9:
                        task_1_9();
                        break;
                    case 10:
                        task_1_10();
                        break;
                    default: {
                        System.out.println("Вы не выбрали вариант задания!");
                        break;
                    }
                }
                break;
            }
            case 2: {
                System.out.println("Введите номер варианта задания которое нужно решить");
                k = input.nextInt();
                switch (k) {
                    case 1: task_2_1();
                        break;
                    case 2: task_2_2();
                        break;
                    case 3: task_2_3();
                        break;
                    case 4: task_2_4();
                        break;
                    case 5: task_2_5();
                        break;
                    case 6: task_2_6();
                        break;
                    case 7: task_2_7();
                        break;
                    case 8: task_2_8();
                        break;
                    case 9: task_2_9();
                        break;
                    case 10: task_2_10();
                        break;
                    case 11: task_2_11();
                        break;
                    case 12: task_2_12();
                        break;
                    case 13: task_2_13();
                        break;
                    case 14: task_2_14();
                        break;
                    case 15: task_2_15();
                        break;
                    case 16: task_2_16();
                        break;
                    default: {
                        System.out.println("Вы не выбрали вариант задания!");
                        break;
                    }
                }
                break;
            }
            case 3: {
                System.out.println("Введите номер варианта задания которое нужно решить");
                k = input.nextInt();
                switch (k) {
                    case 1: task_3_1();
                        break;
                    case 2: task_3_2();
                        break;
                    case 3: task_3_3();
                        break;
                    case 4: task_3_4();
                        break;
                    case 5: task_3_5();
                        break;
                    case 6: task_3_6();
                        break;
                    case 7: task_3_7();
                        break;
                    case 8: task_3_8();
                        break;
                    default: {
                        System.out.println("Вы не выбрали вариант задания!");
                        break;
                    }
                }
                break;
            }
            case 4: {
                System.out.println("Введите номер варианта задания которое нужно решить");
                k = input.nextInt();
                switch (k) {
                    case 1:
                        task_4_1();
                        break;
                    case 2:
                        task_4_2();
                        break;
                    case 3:
                        task_4_3();
                        break;
                    case 4:
                        task_4_4();
                        break;
                    case 5:
                        task_4_5();
                        break;
                    case 6:
                        task_4_6();
                        break;
                    case 7:
                        task_4_7();
                        break;
                    case 8:
                        task_4_8();
                        break;
                    case 9:
                        task_4_9();
                        break;
                    case 10:
                        task_4_10();
                        break;
                    case 11:
                        task_4_11();
                        break;
                    case 12:
                        task_4_12();
                        break;
                    case 13:
                        task_4_13();
                        break;
                    case 14:
                        task_4_14();
                        break;
                    case 15:
                        task_4_15();
                        break;
                    case 16:
                        task_4_16();
                        break;
                    case 17:
                        task_4_17();
                        break;
                    default: {
                        System.out.println("Вы не выбрали вариант задания!");
                        break;
                    }
                }
                break;
            }
            default: {
                System.out.println("Вы не выбрали раздел заданий!");
                break;
            }
        }
    }
}
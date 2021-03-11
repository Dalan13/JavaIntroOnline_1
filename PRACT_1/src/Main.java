import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void task_1_1() {
       double a, b, c, z;
       Scanner input = new Scanner(System.in);
       System.out.println("Задача 1: z=((a–3)*b/2)+c");
       System.out.print("a = ");
       a = input.nextDouble();
       System.out.print("b = ");
       b = input.nextDouble();
       System.out.print("c = ");
       c = input.nextDouble();
       z = ((a-3)*b)/2 + c;
       System.out.println("Ответ: z = " + z);
    }

    public static void task_1_2() {
        double a, b, c, z;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 2: z=(b + (b^2 + 4ac)^0.5)/2a - ca^3 +b^(-2)");
        System.out.print("a = ");
        a = input.nextDouble();
        System.out.print("b = ");
        b = input.nextDouble();
        System.out.print("c = ");
        c = input.nextDouble();
        z = (b + Math.pow(b*b + 4*a*c, 0.5)) / (2*a) - Math.pow(a, 3)*c + Math.pow(b, -2);
        System.out.println("Ответ: z = " + z);
    }

    public static void task_1_3() {
        double x, y, z;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 3: z=(sin(x)+cos(y))/(cos(x)-sin(y)) * tg(xy)");
        System.out.print("x = ");
        x = input.nextDouble();
        System.out.print("y = ");
        y = input.nextDouble();
        z = (Math.sin(x)+Math.cos(y)) / (Math.cos(x)-Math.sin(y)) * Math.tan(x*y);
        System.out.println("Ответ: z = " + z);
    }

    public static void task_1_4() {
        double x, z;
        char[] xc;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 4: x = nnn,ddd, z = ddd.nnn");
        System.out.print("x = ");
        x = input.nextDouble();
        xc = Double.toString(x).toCharArray();
        for (int i = 0; i < 3; i++) {
            char t = xc[i];
            xc[i] = xc[i+4];
            xc[i+4] = t;
        }
       z = Double.parseDouble(String.valueOf(xc));
       System.out.println("Ответ: z = " + z);
    }

    public static void task_1_5() {
        int T;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 5: Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести \n" +
                "данное значение длительности в часах, минутах и секундах в следующей форме:\n" +
                "ННч ММмин SSc");
        System.out.print("T = ");
        T = input.nextInt();
        System.out.println("Ответ: " + T/3600 + "ч. " + T%3600/60 + "мин. " + T%60 + "сек. " );
    }

    public static void task_1_6() {
        int x, y;
        boolean ans = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 6: Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) \n" +
                "принадлежит закрашенной области, и false — в противном случае");
        System.out.print("x = ");
        x = input.nextInt();
        System.out.print("y = ");
        y = input.nextInt();
        if ((y>=0 && y<=4 && x>=-2 && x<=2) || (y<=0 && y>=-3 && x>=-4 && x<=4)) ans = true;
        System.out.println("Ответ: " + ans);
    }

    public static void task_2_1() {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 1: Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли \n" +
                "он прямоугольным");
        System.out.print("Первый угол = ");
        x = input.nextInt();
        System.out.print("Второй угол = ");
        y = input.nextInt();
        if (x + y < 180) {
            System.out.print("Существует!");
            if (x == 90 || y == 90 || x+y == 90) {
                System.out.println(" И он прямоугольный!");
            } else if (x > 90 || y > 90 || 180-x-y > 90) {
                System.out.println(" И он тупоугольный!");
            } else if (x == 60 && y == 60) {
                System.out.println(" И он равносторонний!");
            } else System.out.println(" И он остроугольный!");
        } else System.out.println("Такого треугольника нет");
    }

    public static void task_2_2() {
        double a, b, c, d, min1, min2, max;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 2: Найти max{min(a, b), min(c, d)}");
        System.out.print("a = ");
        a = input.nextDouble();
        System.out.print("b = ");
        b = input.nextDouble();
        System.out.print("c = ");
        c = input.nextDouble();
        System.out.print("d = ");
        d = input.nextDouble();
        if (a < b) {
            min1 = a;
        } else min1 =b;
        if (c < d) {
            min2 = c;
        } else min2 =d;
        if (min1 > min2) {
            max = min1;
        } else max = min2;
        System.out.println("Ответ: " + max);
    }

    public static void task_2_3() {
        double x1, x2, x3, y1, y2, y3;
        boolean ans = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 3:  Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой");
        System.out.print("x1 = ");
        x1 = input.nextDouble();
        System.out.print("y1 = ");
        y1 = input.nextDouble();
        System.out.print("x2 = ");
        x2 = input.nextDouble();
        System.out.print("y2 = ");
        y2 = input.nextDouble();
        System.out.print("x3 = ");
        x3 = input.nextDouble();
        System.out.print("y3 = ");
        y3 = input.nextDouble();
        if ((x1 - x2) / (x3 - x2) == (y1 - y2) / (y3 - y2)) ans = true;
        if (ans) {
            System.out.println("Ответ: Точки лежат на одной прямой!");
        } else System.out.println("Ответ: Точки не лежат на одной прямой...");
    }

    public static void task_2_4() {
        double a, b, x, y, z;
        boolean ans = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 4:  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через \n" +
                "отверстие");
        System.out.print("A = ");
        a = input.nextDouble();
        System.out.print("B = ");
        b = input.nextDouble();
        System.out.print("x = ");
        x = input.nextDouble();
        System.out.print("y = ");
        y = input.nextDouble();
        System.out.print("z = ");
        z = input.nextDouble();
        if (x <= a) {
            if ((y <= b) || (z <= b)) {
                ans = true;
            }
        } else if (y <= a) {
            if ((a <= b) || (z <= b)) {
                ans = true;
            }
        } else if (z <= a) {
            if ((y <= b) || (a <= b)) {
                ans = true;
            }
        }
        if (ans) {
            System.out.println("Ответ: Кирпич сможет пройти!");
        } else System.out.println("Ответ: Кирпич не сможет пройти...");
    }

    public static void task_2_5() {
        double f, x;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 5:  Вычислить значение функции:\nx<=3 --- f=x^2-3x+9\nx>3 --- f=1/(x^3+6)");
        System.out.print("x = ");
        x = input.nextDouble();
        if (x<=3) {
            f = x*x - 3*x + 9;
        } else f = 1/(Math.pow(x, 3) + 6);
        System.out.println("Ответ: " + f);
    }

    public static void task_3_1() {
        int x, s = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 1:  Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует \n" +
                "все числа от 1 до введенного пользователем числа");
        System.out.print("x = ");
        x = input.nextInt();
        for (int i = 0; i <= x; i++) {
            s += i;
        }
        System.out.println("Ответ: " + s);
    }

    public static void task_3_2() {
        double f, x, a, b, h;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 2: Вычислить значения функции на отрезке [а,b] c шагом h:\nx>2 --- f=x\nx<=2 --- f=-x");
        System.out.print("a = ");
        a = input.nextDouble();
        System.out.print("b = ");
        b = input.nextDouble();
        System.out.print("h = ");
        h = input.nextDouble();
        x = a - h;
        do {
            x += h;
            if (x<=2) {
                f = -x;
            } else f = x;
            System.out.printf("%.3f", f);
            if (x < b) System.out.print(", ");
        } while (x <= b);
    }

    public static void task_3_3() {
        int s = 0;
        System.out.println("Задача 3: Найти сумму квадратов первых ста чисел");
        for (int i = 0; i <= 100; i++) {
            s += i*i;
        }
        System.out.println("Ответ: " + s);
    }

    public static void task_3_4() {
        BigInteger p = BigInteger.valueOf(1);
        System.out.println("Задача 4: Составить программу нахождения произведения квадратов первых двухсот чисел");
        for (int i = 1; i <= 200; i++) {
            p = p.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println("Ответ: " + p);
    }

    public static void task_3_5() {
        double s = 0, a, e;
        int n =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 5: Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен \n" +
                "заданному е. Общий член ряда имеет вид:\na=1/2^n+1/3^n");
        System.out.print("e = ");
        e = input.nextDouble();
        a = 1/Math.pow(2, n) + 1/Math.pow(3, n);
        while (Math.abs(a) >= e) {
            a = 1/Math.pow(2, n) + 1/Math.pow(3, n);
            s += a;
            n++;
        }
        System.out.printf("Ответ: %.5f", s);
    }

    public static void task_3_6() {
        System.out.println("Задача 6: Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера");
        for (int i = 0; i <= 255; i++) {
            System.out.println((char)i + " --- " + i);
        }
    }

    public static void task_3_7() {
        int n, m;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 7: Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. \n" +
                "m и n вводятся с клавиатуры");
        System.out.print("m = ");
        m = input.nextInt();
        System.out.print("n = ");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.print("Натуральные делители числа " + i + " --- | ");
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    System.out.print(j + " | ");
                }
            }
            System.out.println();
        }
    }

    public static void task_3_8() {
        int a, b;
        char[] ac;
        String s;
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 8: Даны два числа. Определить цифры, входящие в запись как первого так и второго числа");
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        ac = Integer.toString(a).toCharArray();
        s = Integer.toString(b);
        for (int i = 0; i < ac.length; i++) {
            if(s.indexOf(ac[i]) != -1) System.out.print(ac[i] + " ");
        }
    }

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Линейные программы\n2 - Ветвления\n3 - Циклы");
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
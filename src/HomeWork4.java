public class HomeWork4 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println(" Задача № 1 ");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986, 10.01, 11, 1};
        int[] Three = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
    }

    public static void task2() {
        System.out.println(" Задача № 2 ");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986, 10.01, 11, 1};
        int[] Three = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        System.out.print(one[0] + " , " + one[1] + " , " + one[2] + " . ");
        System.out.println();
        System.out.print(two[0] + " , " + two[1] + " , " + two[2] + " , " + two[3] + " , " + two[4] + " . ");
        System.out.println();
        for (int i = 0; i < Three.length; i++) {
            System.out.print(Three[i] + " , ");
        }
        System.out.println();

    }

    public static void task3() {
        System.out.println(" Задача № 3 ");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986, 10.01, 11, 1};
        int[] Three = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i] + " , ");
        }
        System.out.println();
        for (int a = two.length - 1; a >= 0; a--) {
            System.out.print(two[a] + " , ");
        }
        System.out.println();
        for (int d = Three.length - 1; d >= 0; d--) {
            System.out.print(Three[d] + " , ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println(" Задача № 4 ");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i] = one[i] + 1;
            }
            System.out.print(one[i] + ", ");
        }
        System.out.println();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task5() {
        System.out.println(" Задача № 5 ");
        int[] a = generateRandomArray();
        int c = 0;
       for (int b = 0; b < a.length; b++) {
           c = c + a[b];
       }
        System.out.println( " Сумма трат за месяц составила " + c + " рублей. ");
    }

    public static void task6() {
        System.out.println(" Задача № 6 ");
        int[] a = generateRandomArray();
        int max = 10;
        int min = 1000000;
        for (int b:a ) {
            if (b > max) {
                max = b;
            }
            if (b < min) {
                min = b;
            }
        }
        System.out.println( " Минимальная сумма трат за день составила " + min + " рублей " );
        System.out.println( " Максимальная сумма трат за день составила " + max + " рублей " );
    }



    public static void task7() {
        System.out.println(" Задача № 7 ");
        int [] a = generateRandomArray();
        double sum = 0d;
        double midSum = 0d;
        double c = 0d;
        for (double b:a ) {
            sum += b;
            c += 1d;
          if(c == 30d) {
              midSum = sum / c;
            }
        }
        System.out.println(midSum);
    }

    public static void task8() {
        System.out.println(" Задача № 8 ");
        char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}





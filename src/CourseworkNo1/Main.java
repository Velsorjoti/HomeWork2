package CourseworkNo1;

public class Main {
    public static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        System.out.println(" Программа для бухгалтерии и отдела кадров ");
        employee[0] = new Employee("Динамо Пикачу Райчувов", 1, 200000);
        employee[1] = new Employee("Венозавров Бульбозавр Ивизаврович", 2, 190000);
        employee[2] = new Employee("Бластойзов Сквиртл Вартолвов", 3, 180000);
        employee[3] = new Employee("Пиджеото Пиджи Пидживович", 4, 170000);
        employee[4] = new Employee("Черизард Чармандер Чармелеонов", 5, 190000);
        employee[5] = new Employee("Батерфляй Катерпи Нематодов", 1, 165000);
        employee[6] = new Employee("Голем Геодод Грайволерьев", 2, 200000);
        employee[7] = new Employee("Нидокинг Нидоран Нидоринов", 3, 250000);
        employee[8] = new Employee("Виктербел Беллспраут Випенбелов", 4, 160000);
        employee[9] = new Employee("Генгар Гастли Хантерович", 5, 170000);
        showHonorBoard();
    }

    public static void showHonorBoard() {
        for (Employee employee : employee) {
            System.out.println(employee);
        }
    }

    public static int calculatedSumSalaryOfSlave() {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalaryOfSlaves;
        }
        return sum;
    }

    public static int calculatedMinSalaryOfSlave() {
        int min = employee[0].getSalaryOfSlaves;
        for (int i = 0; i < employee.length; i++) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    public static int calculatedMaxSalaryOfSlave() {
        int max = employee[0].getSalaryOfSlaves;
        for (int i = 0; i < employee.length; i++) {
            if (i < max) {
                max = i;
            }
        }
        return max;
    }
    public static int calculatedMidSalaryOfSlave() {
        int sum = 0;
        int midsum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalaryOfSlaves;
        }
        midsum = sum / Employee.length;
        return midsum;
    }
    public static String showAllName() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getCompleteSurnameNameMiddlename + " ");
        }
        return showAllName();
    }

}









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
    }

    public static void showHonorBoard() {
        for (Employee employee : employee) {
            System.out.println(employee);
        }
    }

    public static int calculatedMinSalaryOfSlave() {
        int min;
        min = employee[0].getSalaryOfSlaves();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalaryOfSlaves() < min) {
                min = employee[i].getSalaryOfSlaves();
            }
        }
        return min;
    }

    public static int calculatedMaxSalaryOfSlave() {
        int max;
        max = employee[0].getSalaryOfSlaves();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalaryOfSlaves() < max) {
                max = employee[i].getSalaryOfSlaves();
            }
        }
        return max;
    }
    public static int calculatedSumSalaryOfSlave () {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalaryOfSlaves();
        }
        return sum;
    }

    public static int calculatedMidSalaryOfSlave (int sum, int midsum) {
        calculatedSumSalaryOfSlave();
        midsum = sum / employee.length;
        return midsum;
    }

    public static String showAllName () {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == employee[9]) {
                System.out.println(employee[9].getCompleteSurnameNameMiddlename());

            } else
                System.out.println(employee[i].getCompleteSurnameNameMiddlename() + "");
        }
        return showAllName();
    }
}


















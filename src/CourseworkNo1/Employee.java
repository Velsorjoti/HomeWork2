package CourseworkNo1;

public class Employee {
    public static int length;
    private String completeSurnameNameMiddlename;
    private int meowDepartament;;
    private int salaryOfSlaves;
    private static int counter = 1;
    private int idd ;

    public Employee (String completeSurnameNameMiddlename, int meowDepartament, int salaryOfSlaves){
        this.completeSurnameNameMiddlename = completeSurnameNameMiddlename;
        this.meowDepartament = meowDepartament;
        this.salaryOfSlaves = salaryOfSlaves;
        idd = counter++;
    }
    public String getCompleteSurnameNameMiddlename() {
        return this.completeSurnameNameMiddlename = completeSurnameNameMiddlename;
    }
    public int getMeowDepartament() {
        return this.meowDepartament = meowDepartament;
    }
    public int getSalaryOfSlaves() {
        return this.salaryOfSlaves = salaryOfSlaves;
    }
    public int getIdd() {
        return this.idd = idd;
    }
    public void setCompleteSurnameNameMiddlename(int a) {
        this.completeSurnameNameMiddlename = completeSurnameNameMiddlename;
    }
    public void setMeowDepartament(int b) {
        this.meowDepartament = meowDepartament;
    }
    public void setSalaryOfSlaves(int c) {
        this.salaryOfSlaves = salaryOfSlaves;
    }
    public void setIdd(int a) {
        this.idd = idd;
    }
    public String toString() {
       return  " ФИО работника: " + completeSurnameNameMiddlename + " . Номер департамента: " + meowDepartament + ". Зарплата работника: " + salaryOfSlaves +  " Idd работника: " + idd + ".";
    }
}

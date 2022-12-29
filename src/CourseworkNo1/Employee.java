package CourseworkNo1;

public class Employee {
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
        return completeSurnameNameMiddlename;
    }

    public int getMeowDepartament() {
        return meowDepartament;
    }

    public int getSalaryOfSlaves() {
        return salaryOfSlaves;
    }

    public void setCompleteSurnameNameMiddlename(String completeSurnameNameMiddlename) {
        this.completeSurnameNameMiddlename = completeSurnameNameMiddlename;
    }

    public void setMeowDepartament(int meowDepartament) {
        this.meowDepartament = meowDepartament;
    }

    public void setSalaryOfSlaves(int salaryOfSlaves) {
        this.salaryOfSlaves = salaryOfSlaves;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public String toString() {
       return  " ФИО работника: " + completeSurnameNameMiddlename + " . Номер департамента: " + meowDepartament + ". Зарплата работника: " + salaryOfSlaves +  " Idd работника: " + idd + ".";
    }
}

package interfaces;

public class Manager implements Employee {
    String name = "Fathir";
    int positionSalary = 400000;
    int takehomepaySalary;

    @Override
    public void getInformation() {
        System.out.println("Manajer Diduduki oleh " + name);
    }

    @Override
    public void getTakehomepay() {
        this.takehomepaySalary = baseSalary + positionSalary;
        System.out.println("Employee Takehomepay " + takehomepaySalary);

    }
}

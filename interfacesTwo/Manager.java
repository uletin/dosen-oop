package interfacesTwo;

public class Manager implements Employee {
    String name = "Fathir";
    private int positionSalary = 5000000;
    private int takehomepay;

    public void getInformation() {
        System.out.println("Manajer Adalah " + name);
    }

    public void getTakehomepay() {
        System.out.println("Gaji Manager Adalah " + this.takehomepay);
    }

    public void setTakehomepay(int positionSalary) {
        this.positionSalary = positionSalary;
        this.takehomepay = baseSalary + this.positionSalary + transportSalary;
        System.out.println("Success add position Salary " + positionSalary);
    }
}

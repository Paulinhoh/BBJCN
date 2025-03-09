package edu.paulinhoh.poo.herancapolimorfismo.exemplo.domain;

public final class Salesman extends Employee {

    private double percentParSold;
    private double totalSold;

    public Salesman(String code, String name, String address, int age, double salary, double percentParSold,
            double totalSold) {
        super(code, name, address, age, salary);
        this.percentParSold = percentParSold;
        this.totalSold = totalSold;
    }

    public Salesman() {
    }

    @Override
    public String getCode() {
        return "SL" + super.getCode();
    }

    public double getPercentParSold() {
        return percentParSold;
    }

    public void setPercentParSold(double percentParSold) {
        this.percentParSold = percentParSold;
    }

    public double getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(double totalSold) {
        this.totalSold = totalSold;
    }

    @Override
    public double getFullSlary() {
        return this.salary + ((this.totalSold * this.percentParSold) / 100);
    }

}
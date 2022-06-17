package FunctionsHomework;

public class SalesRepresentative {
     private final int numberOfSales;
     private final String name;
     private  final double quota;

    public SalesRepresentative( String name,int numberOfSales, double quota) {

        this.numberOfSales = numberOfSales;
        this.name = name;
        this.quota = quota;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public String getName() {
        return name;
    }

    public double getQuota() {
        return quota;
    }

    public double getRevenue(){
        return numberOfSales * quota;
    }

    @Override
    public String toString() {
        return name + " $" + getRevenue();
    }
}

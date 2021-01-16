/*
 * Author: Brian Klein
 * Date: 9/20/17
 * Program: RegularService.java
 * Description: It inherits the functionality of super Service, but also 
 *              includes one data member that represents a flat fee that the 
 *              company uses for calculating the cost of regular service.
 *              Constructors should initialize data members. The flat fee 
 *              should be validated. It should override calculateCost() method 
 *              so that it computes the cost by adding the flat fee to the 
 *              hour-based cost. It has toString method, getter, and setter.
 *              The flat fee should be validated in the setter.
 */

public class RegularService extends Service{
    
    private double flatFee;

    public RegularService() {
    }

    public RegularService(double flatFee, String invoice, String fName, 
            String lName, double requiredHours, double baseCost) {
        super(invoice, fName, lName, requiredHours, baseCost);
        setFlatFee(flatFee);
    }

    public double getFlatFee() {
        return flatFee;
    }

    public void setFlatFee(double flatFee) {
        this.flatFee = flatFee;
        if(this.flatFee < 0) {
            System.out.println("Fee cannot be less than $0.");
            this.flatFee = Math.abs(this.flatFee);
            System.out.println("Fee will be set at: $" + this.flatFee);
        }
    }
    
    @Override
    public double calculateCost() {
        double regServiceCost = this.flatFee + (super.getBaseCost() * super.getRequiredHours());
        return regServiceCost;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
                "\nFee: $" + flatFee +
                "\nTotal Cost: $" + calculateCost();
    }
    
    
    
}

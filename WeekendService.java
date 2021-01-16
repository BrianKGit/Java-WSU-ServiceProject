/*
 * Author: Brian Klein
 * Date: 9/20/17
 * Program: WeekendService.java
 * Description: It inherits the functionality of super class Service, but also 
 *              includes one data member that represents a rate that the 
 *              company charges for weekend service. Constructors should 
 *              initialize data members. The rate should be validated.
 *              It should override method calculateCost() so that it computes 
 *              the service cost by multiplying the rate with the hour-based 
 *              cost. It has toString method, getter, and setter. The rate 
 *              should be validated in the setter.
 */

public class WeekendService extends Service{
    
    private double weekendFee;

    public WeekendService() {
    }

    public WeekendService(double weekendFee, String invoice, String fName, 
            String lName, double requiredHours, double baseCost) {
        super(invoice, fName, lName, requiredHours, baseCost);
        setWeekendFee(weekendFee);
    }

    public double getWeekendFee() {
        return weekendFee;
    }

    public void setWeekendFee(double weekendFee) {
        this.weekendFee = weekendFee;
        if(this.weekendFee < 0) {
            System.out.println("Fee cannot be less than $0.");
            this.weekendFee = Math.abs(this.weekendFee);
            System.out.println("Fee will be set at: $" + this.weekendFee);
        }
    }
    
    @Override
    public double calculateCost() {
        double weekendServiceCost = this.weekendFee * (super.getRequiredHours() * super.getBaseCost());
        return weekendServiceCost;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nWeekend Rate: " + weekendFee +
                "\nTotal Cost: $" + calculateCost();
    }
    
}//end class

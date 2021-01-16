/*
 * Author: Brian Klein
 * Date: 9/20/17
 * Program: EmergencyService.java
 * Description: It inherits the functionality of super class Service and 
 *              contains one data member representing an additional fee per 
 *              hour charged for emergency service. Constructors should 
 *              initialize data members. The additional fee per hour should be 
 *              validated. It should override method calculateCost() so that it 
 *              adds the additional fee per hour to the standard cost per hour.
 *              It has toString, getters, and setters. The additional fee per 
 *              hour should be validated.
 */

public class EmergencyService extends Service{
    
    private double additionalFee;

    public EmergencyService() {
    }

    public EmergencyService(double additionalFee, String invoice, String fName, 
            String lName, double requiredHours, double baseCost) {
        super(invoice, fName, lName, requiredHours, baseCost);
        setAdditionalFee(additionalFee);
    }

    public double getAdditionalFee() {
        return additionalFee;
    }

    public void setAdditionalFee(double additionalFee) {
        this.additionalFee = additionalFee;
        if(this.additionalFee < 0) {
            System.out.println("Fee cannot be less than $0.");
            this.additionalFee = Math.abs(this.additionalFee);
            System.out.println("Fee will be set at: $" + this.additionalFee);
        }
    }
    
    @Override
    public double calculateCost() {
        double emergencyServiceCost = ((super.getBaseCost() + this.additionalFee) * super.getRequiredHours());
        return emergencyServiceCost;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nAdditional Fee/Hour: $" + additionalFee +
                "\nTotal Cost: $" + calculateCost();
    }
    
}//end class

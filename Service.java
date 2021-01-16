/*
 * Author: Brian Klein
 * Date: 9/20/17
 * Program: Service.java
 * Description: Abstract super class. It includes private instance variables
 *              representing the service invoice number, first and last name 
 *              of the customer. It also includes private instance variables 
 *              that store the hours required to complete the service and base 
 *              cost per hour. Constructors should initialize data members.
 *              The hours and base cost should be validated. It provides a 
 *              method calculateCost() that is supposed to return a double 
 *              indicating the cost associated with the service. This method 
 *              should return 0.0 here in the superclass. (It is up to the 
 *              subclasses how to implement it.) It has getters/accessors, 
 *              setters/mutators, and toString method. The hours and base cost 
 *              should contain positive values in setters.
 */

public abstract class Service {
    private String invoice, fName, lName;
    private double requiredHours, baseCost;

    public Service() {
    }

    public Service(String invoice, String fName, String lName, double requiredHours, double baseCost) {
        this.invoice = invoice;
        this.fName = fName;
        this.lName = lName;
        setRequiredHours(requiredHours);
        setBaseCost(baseCost);
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getRequiredHours() {
        return requiredHours;
    }

    public void setRequiredHours(double requiredHours) {
        this.requiredHours = requiredHours;
        if(this.requiredHours < 0) {
            System.out.println("Required Hours cannot be less than 0.");
            this.requiredHours = Math.abs(this.requiredHours);
            System.out.println("Required Hours will be set at: " + this.requiredHours);
        }
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
        if(this.baseCost < 0) {
            System.out.println("Base Cost cannot be less than $0.");
            this.baseCost = Math.abs(this.baseCost);
            System.out.println("Base Cost will be set at: $" + this.baseCost);
        }
            
    }
    
    public abstract double calculateCost();
    
    public String toString() {
        return "\nInvoice Number: " + invoice + 
                "\nCustomer Name: " + fName + " " + lName + 
                "\nHours Required: " + requiredHours + 
                "\nBase Cost: $" + baseCost;
    }
    
    
    
}

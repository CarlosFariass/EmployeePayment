
package entities;


public class OutsourcedEmployee extends Employee{
    
    private  Double additionalCharge;

    public OutsourcedEmployee(){
        super();
        
    }
    
    public OutsourcedEmployee(Double additionalCharge, String name, Integer Hour, Double valuePerHour) {
        super(name, Hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

@Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
        
    
    
    }
    
    
    
    


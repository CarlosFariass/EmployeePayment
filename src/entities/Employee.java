/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

public class Employee {
    
    public String name;
    public Integer hour;
    public Double valuePerHour;
    
    public Employee(){
        
    }

    public Employee(String name, Integer Hour, Double valuePerHour) {
        this.name = name;
        this.hour = Hour;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer Hour) {
        this.hour = hour;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    
    
        public double payment(){
            return hour * valuePerHour;
        }
    
    
}

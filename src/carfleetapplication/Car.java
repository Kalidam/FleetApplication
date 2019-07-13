/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carfleetapplication;

import java.util.ArrayList;

public class Car {

    private String brand, model, registrationNumber;
    private ArrayList <Employee> listOfEmployees;
    private Employee driver;
    
    public Car (String brand, String model, String registrationNumber, int employeeNumber){
        setListOfEmploies();
        setDriverFromListOfEmployees(employeeNumber);
        setBrand(brand);
        setModel(model);
        setRegistrationNumber(registrationNumber);
    }
    
    public void setListOfEmploies(){
        this.listOfEmployees=SaveFileEmployee.getListOfEmployees();
    }
    
    public void setDriverFromListOfEmployees(int employeeNumber){
        driver=listOfEmployees.get(employeeNumber);
    }
    
    public void setBrand(String brand){
        this.brand=brand;
    }
    
    public void setModel(String model){
        this.model=model;
    }
    
    public void setRegistrationNumber (String registrationNumber){
        this.registrationNumber=registrationNumber;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    
    public Employee getDriver(){
        return driver;
    }
    
    public String getName(){
        return driver.getName();
    }
    
    public String getSurname(){
        return driver.getSurname();
    }
    
    public void changeDriver(int changedEmloyeeNumber){
        setDriverFromListOfEmployees(changedEmloyeeNumber);
    }
}
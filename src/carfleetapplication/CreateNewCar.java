/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carfleetapplication;

/**
 *
 * @author Damian
 */
public class CreateNewCar {
    
    public static Car createCar(){
        
        String brand = ScannerUtility.getTextFromUser("Podaj markę pojazdu.");
        String model = ScannerUtility.getTextFromUser("Podaj model pojazdu.");
        String registrationNumber = ScannerUtility.getTextFromUser("Podaj numer rejestracyjny pojazdu.");
        SaveFileEmployee.printListOfEmloyees();
        int employeeNumber= ScannerUtility.getIntFromUser("Wybierz pracownika z listy poprzez podanie jego numeru.");
        Car car = new Car (brand, model, registrationNumber, employeeNumber);
        return car;
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp20task3angelina;

import java.util.Scanner;

/**
 *
 * @author Angelina
 */
public class SKTVp20Task3Angelina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите своё имя:");
        String name = scanner.next();
        
        System.out.println("Введите свою фамилию:");
        String surname = scanner.next();
        
        System.out.println("Введите год своего рождения:");
        int year = scanner.nextInt();
        
        System.out.println("Введите месяц своего рождения (в виде числа):");
        int month = scanner.nextInt();
        
        System.out.println("Введите число своего рождения:");
        int day = scanner.nextInt();
        
        String monthStr = "";
        if (month == 1) {
            monthStr = "января"; 
        } else if (month == 2) {
            monthStr = "февраля"; 
        } else if (month == 3) {
            monthStr = "марта"; 
        } else if (month == 4) {
            monthStr = "апреля"; 
        } else if (month == 5) {
            monthStr = "мая"; 
        } else if (month == 6) {
            monthStr = "июня"; 
        } else if (month == 7) {
            monthStr = "июля"; 
        } else if (month == 8) {
            monthStr = "августа"; 
        } else if (month == 9) {
            monthStr = "сентября"; 
        } else if (month == 10) {
            monthStr = "октября"; 
        } else if (month == 11) {
            monthStr = "ноября"; 
        } else if (month == 12) {
            monthStr = "декабря"; 
        }
        
        System.out.println(name+" "+surname+" родился(-ась) "+day+" "+monthStr+" "+year+" года.");
    }
    
}

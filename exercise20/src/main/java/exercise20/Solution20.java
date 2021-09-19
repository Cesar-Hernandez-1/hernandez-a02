/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
 *  Pseudocode:
 *
 */
package exercise20;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Solution20 {
    private static final Scanner input = new Scanner(System.in);
    private double orderAmount;
    private String state;
    private String county;
    private double tax;


    private void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    private void setState(String state) {
        this.state = state;
    }

    private void setCounty(String county) {
        this.county = county;
    }

    private double calculateTax(){
        if (Objects.equals(state, "Wisconsin")){
            tax += orderAmount * (0.05);
            if(Objects.equals(county, "Eau Claire")){
                tax += 0.005;
            }else if(Objects.equals(county, "Dunn")){
                tax += 0.004;
            }
        }else if (Objects.equals(state, "Illinois")){
            tax += orderAmount * 0.08;
        }else{
            return tax;
        }
        return tax;
    }

    private double calculateTotal(){
        return orderAmount + tax;
    }

    private double round(double inputAmount){
        return Double.parseDouble(String.format("%.2f",inputAmount));
    }

    public static void main(String[] args) {
        Solution20 app = new Solution20();

        System.out.print("What is the order amount? ");
        app.setOrderAmount(Double.parseDouble(input.nextLine()));

        System.out.print("What state do you live in? ");
        app.setState(input.nextLine());

        System.out.print("What county do you live in? ");
        app.setCounty(input.nextLine());

        String output = "The tax is " + String.format("$%.2f.%n",app.round(app.calculateTax())) +
                "The total is " + String.format("$%.2f.",app.round(app.calculateTotal()));

        System.out.println(output);
    }

}

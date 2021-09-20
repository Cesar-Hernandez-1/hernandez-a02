/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
 *  Pseudocode:
 *  Ask user to input order amount.
 *
 *  Ask user to enter what state they live in.
 *
 *  Ask user what county they live in.
 *
 *  If state entered is Wisconsin, as 5% sales tax of order amount to tax.
 *  If county in Wisconsin is Eau Claire, add an aditional 0.5% to tax.
 *  If Dunn is enteres, add an additional 0.4% to tax
 *
 *  If Illinois was entered for state, only add 8% tax.
 *
 *  Any other state entered is no tax.
 *
 *  Output amount of tax if applicable and the total amount.
 *
 */
package exercise20;

import java.util.Objects;
import java.util.Scanner;

public class Solution20 {
    private static final Scanner input = new Scanner(System.in);
    private double orderAmount;
    private String state;
    private String county;
    private double tax;


    public void setOrderAmount(double orderAmount) {
        this.orderAmount = round(orderAmount);
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public double calculateTax(){
        if (Objects.equals(state, "Wisconsin")){
            this.tax += this.orderAmount * (0.05);
            if(Objects.equals(county, "Eau Claire")){
                this.tax += (this.orderAmount * 0.005);
            }else if(Objects.equals(county, "Dunn")){
                this.tax += (this.orderAmount * 0.004);
            }
        }else if (Objects.equals(state, "Illinois")){
            this.tax += (this.orderAmount * 0.08);
        }

        this.tax = round(this.tax);
        return this.tax;
    }

    public double calculateTotal(){
        return this.orderAmount + this.tax;
    }

    public double round(double inputAmount){
        inputAmount *= 100;
        String amount = inputAmount + "";

        if(!amount.endsWith(".0")){
            int intAmount = (int)inputAmount;
            intAmount += 1;
            inputAmount = intAmount;
        }

        inputAmount /= 100;
        return inputAmount;
    }

    public static void main(String[] args) {
        Solution20 app = new Solution20();

        System.out.print("What is the order amount? ");
        app.setOrderAmount(Double.parseDouble(input.nextLine()));

        System.out.print("What state do you live in? ");
        app.setState(input.nextLine());

        System.out.print("What county do you live in? ");
        app.setCounty(input.nextLine());

        String output = "The tax is " + String.format("$%.2f.%n",app.calculateTax()) +
                "The total is " + String.format("$%.2f.",app.calculateTotal());

        System.out.println(output);
    }
}

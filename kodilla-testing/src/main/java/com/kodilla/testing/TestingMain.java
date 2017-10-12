package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }

        //Calculator

        Calculator calculator = new Calculator();
        long calculatorAdd = calculator.addAToB(5, 3);

        if(calculatorAdd == 8){
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }

        long calculatorSubstract = calculator.substractAFromB(3, 20);

        if(calculatorSubstract == 17){
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }
    }
}

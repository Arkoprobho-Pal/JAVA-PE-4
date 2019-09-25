package com.stackroute.main;

import java.util.Scanner;

public class CountChar {
    public void CharFrequency(){
        Scanner input=new Scanner(System.in);
        System.out.println("Input a string: ");
        String searchString=input.nextLine();
        System.out.println("Enter the (lowercase)Character to find frequency:");
        String target=input.nextLine();
        int totalLengthWithTargetChar,totalLengthWithoutTargetChar;
        totalLengthWithTargetChar=searchString.length();
        totalLengthWithoutTargetChar=searchString.toLowerCase().replaceAll(target,"").length();
        int resultFrequency=totalLengthWithTargetChar-totalLengthWithoutTargetChar;
        System.out.println("Frequency of "+target +" in "+searchString+" is : "+resultFrequency);
    }

    public static void main(String[] args) {
        CountChar countChar=new CountChar();
        countChar.CharFrequency();
    }
}

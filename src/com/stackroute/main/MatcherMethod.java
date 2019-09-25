package com.stackroute.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMethod {
    public void CheckOccurrence(){
        Scanner input=new Scanner(System.in);
        String textString,patternString;
        System.out.println("Enter the Text : ");
        textString=input.nextLine();
        System.out.println("Enter the pattern you want to search: ");
        patternString=input.nextLine();

        Pattern pattern=Pattern.compile(patternString);//create a pattern object and pass the patternstring
        Matcher matcher=pattern.matcher(textString);//passing the textString to matcher

        while(matcher.find()){
            System.out.println("Found at: "+matcher.start()+"-"+matcher.end());
        }
    }

    public static void main(String[] args) {
        MatcherMethod matcherMethod=new MatcherMethod();
        matcherMethod.CheckOccurrence();
    }
}

package com.stackroute.main;

import java.util.Scanner;

public class RepalcingLetter {
    public void ReplaceCharacter(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Input String: ");
        String inputString=input.nextLine();
        String LetterReplacedOutputString = inputString;
        LetterReplacedOutputString=LetterReplacedOutputString.replace("d","f");
        LetterReplacedOutputString=LetterReplacedOutputString.replace("l","t");
        System.out.println("Output String after replacing letters: "+LetterReplacedOutputString);
    }

    public static void main(String[] args) {
        RepalcingLetter repalcingLetter=new RepalcingLetter();
        repalcingLetter.ReplaceCharacter();
    }
}

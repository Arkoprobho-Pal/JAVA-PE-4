package com.stackroute.main;

import java.util.Scanner;

public class CheckPresence {
    public void PresenceString(){
        String target="Harry";
        Scanner input=new Scanner(System.in);
        System.out.println("Input Query string :");
        String queryString=input.nextLine();
        System.out.print("Is Harry here ?");
        if(queryString.indexOf(" "+target)!=-1){
            System.out.print(" true");
        }
        else
        {
            System.out.println(" False");
        }
    }

    public static void main(String[] args) {
        CheckPresence checkPresence=new CheckPresence();;
        checkPresence.PresenceString();
    }
}

package com.stackroute.main;

import java.util.Scanner;

public class CheckPresence {
    public void PresenceString(){

        Scanner input=new Scanner(System.in);
        System.out.println("Input Query string :");
        String queryString=input.nextLine();
        System.out.print("Is Harry here ? "+queryString.matches("(?i).*Harry.*"));
       /* if(queryString.indexOf(" "+target)!=-1){
            System.out.print(" true");
        }
        else
        {
            System.out.println(" False");
        }*/
    }

    public static void main(String[] args) {
        CheckPresence checkPresence=new CheckPresence();;
        checkPresence.PresenceString();
    }
}

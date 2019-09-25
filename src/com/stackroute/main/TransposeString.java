package com.stackroute.main;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeString {
    public void TransposeLettersOfString(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Input String: ");
        String inputString=input.nextLine();
        String[] words=inputString.split(" ");
        for(int i=0;i<words.length;i++){
            words[i]=transposeString(words[i]);
        }
        for (int i=0;i<words.length;i++){
            System.out.print(words[i]+" ");
        }

    }
    public String transposeString(String str) {
        char []arr = str.toCharArray();
        //Arrays.sort(arr);
        for(int i=0,j=(arr.length-1);i<j;i++,j--){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        TransposeString transposeString=new TransposeString();
        transposeString.TransposeLettersOfString();
    }
}

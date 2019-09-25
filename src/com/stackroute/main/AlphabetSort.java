package com.stackroute.main;

import java.util.Arrays;

public class AlphabetSort {
    public void AlphabetWordSort(){
        String paragraph="a quick brown fox jumps over the lazy dog on first day. HalleLuya, may be or not";
        System.out.println("Input paragraph :\n"+paragraph);

        paragraph=paragraph.toLowerCase().replaceAll("[.,]"," ");
        String[] words=paragraph.split("\\s+");

        for(int i = 0; i<words.length; i++) {
            for (int j = i+1; j<words.length; j++) {
                if(words[i].compareTo(words[j])>0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(words));
    }

    public static void main(String[] args) {
        AlphabetSort alphabetSort=new AlphabetSort();
        alphabetSort.AlphabetWordSort();
    }
}

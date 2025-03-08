package org.example;

public class Main2 {
    public static void main(String[] args) {
        String word = "make install";
        System.out.println(word);
        System.out.println(make_install(word));
    }
    public static String make_install(String word)
    {
        String drow="";
        for (int i=word.length()-1; i>=0;i--){
            drow+=word.charAt(i);
        }

        return drow;
    }

}

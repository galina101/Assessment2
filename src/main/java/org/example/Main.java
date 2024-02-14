package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String input = "abbabba";
        String result = "";
        System.out.println("Total length: " + input.length());

        //flip the string
        for (int i = input.length()-1; i >=0; i--) {
            System.out.println("position " + i + " character " + input.charAt(i));
            result = result + input.charAt(i);
            System.out.println(result);
        }

        //compare 2 strings, if equal then palindrome
        if (input.equals(result)) {
            System.out.println("This is a palindrome");
        }

    }
}
package com.company;

public class Lec_14_string_method
{
    public static void main(String[] args) {
        String name = "SatyaM";
        String name1 = "           SatyaM           ";
        System.out.println(name);

        //It gives the length of the string
        int value = name.length();

        //It converts the string to LowerCase
        String value1 = name.toLowerCase();

        //It converts the string to UpperCase
        String value2 = name.toUpperCase();

        //It trims the spaces in the string
        String value3 = name.trim();

        //It gives the output after given no.
        String value4 = name.substring(3);
        //Start is included but ends is excluded
        String value5 = name.substring(1,3);

        //It replaces a word with another
        String value6 = name.replace('t','o');
        String value7 = name.replace("at","a3");

        //It returns true or false
        boolean value8 = name.startsWith("Sat");
        boolean value9 = name.endsWith("Sat");

        //It gives the char at specific index
        char value10 = name.charAt(2);

        //It finds the index no. from the given index
        int value11 = name.indexOf("a",2);
        //It finds the index no. from the starting index
        int value12 = name.indexOf("a");
        //It returns -1 if it can't find any match
        int value13 = name.indexOf("g");

        //It finds from the last simply opposite of indexOf
        int value14 = name.lastIndexOf("a");
        int value15 = name.lastIndexOf("a",3);

        //Works same as == operator but .equals is a case_sensitive
        boolean value16 = name.equals("Satyam");

        //Ignore case_sensitivity
        boolean value17 = name.equalsIgnoreCase("Satyam");

        // Escape Sequence character
        System.out.println("\"");
        System.out.println("\n");
        System.out.println("\\");
        System.out.println("\t");


//        System.out.println(value);
//        System.out.println(value1);
//        System.out.println(value2);
//        System.out.println(name1);
//        System.out.println(value3);
//        System.out.println(value4);
//        System.out.println(value5);
//        System.out.println(value6);
//        System.out.println(value7);
//        System.out.println(value8);
//        System.out.println(value9);
//        System.out.println(value10);
//        System.out.println(value11);
//        System.out.println(value12);
//        System.out.println(value13);
//        System.out.println(value14);
//        System.out.println(value15);
//        System.out.println(value16);
//        System.out.println(value17);

    }
}

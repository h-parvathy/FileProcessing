package com.parvathy;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class assignment3 {
    /**
     * Validates whether username entered matches or not.
     * @param filename - the filename that is being validated
     * @return - status, a boolean value
     */
    public static boolean isValid(String filename){
        boolean status;
        status = filename.equals("input.txt");
        return status;
    }

    /**
     * Finds the sum of all the values in the file.
     * @param filename - - the filename that is being processed
     * @throws FileNotFoundException - throws when file not found.
     */
    public static void total(String filename)throws FileNotFoundException{
        File myFile = new File(filename);
        Scanner inputFile = new Scanner(myFile);
        double sum = 0;
        while (inputFile.hasNext()){
            String str = inputFile.nextLine();
            sum +=Double.parseDouble(str);
            }
        inputFile.close();
        JFrame tot;
        tot=new JFrame();
        JOptionPane.showMessageDialog(tot,"Sum of all the values in the file are: \n\t"
                +sum);
    }

    /**
     * Finds average of all the values present in the file.
     * @param filename -- the filename that is being processed
     * @throws FileNotFoundException - throws when file not found.
     */
    public static void average(String filename)throws FileNotFoundException{
        File myFile = new File(filename);
        Scanner inputFile = new Scanner(myFile);
        int count = 0;
        double sum = 0;
        while (inputFile.hasNext()){
            count += 1;
            String str = inputFile.nextLine();
            sum +=Double.parseDouble(str);
        }
        inputFile.close();
        JFrame avg;
        avg=new JFrame();
        JOptionPane.showMessageDialog(avg,"The average of all values in the file are: \n\t"
                + sum/count );
    }

    /**
     * Prints all the values present in the file.
     * @param filename - - the filename that is being processed
     * @throws FileNotFoundException - throws when file not found.
     */
    public static void printAll(String filename) throws FileNotFoundException{
        File myFile = new File(filename);
        Scanner inputFile = new Scanner(myFile);
        String all =  "";
        while (inputFile.hasNext()){
            String str = inputFile.nextLine();
            all += str;
            all += " ";
        }
        inputFile.close();
        JFrame allVal;
        allVal=new JFrame();
        JOptionPane.showMessageDialog(allVal,"Values in file are: \n\t"+all);
    }

    /**
     * Prints user name.
     */
    public static void printName(){
        JFrame me;
        me=new JFrame();
        JOptionPane.showMessageDialog(me,"Hello, I am Parvathy Harikumar \n " +
                "My ID is c0784311 \n " +
                "This is JAVA Assignment 3.");

    }

    /**
     * Main method
     * @param args- string input
     * @throws IOException - throws when file not found.
     */
    public static void main(String[] args) throws IOException {

        PrintWriter fw = new PrintWriter("input.txt");
        fw.println(10);
        fw.println(20);
        fw.println(30);
        fw.println(40);
        fw.println(50);
        fw.println(60);
        fw.println(70);
        fw.println(80);
        fw.println(90);
        fw.println(100);
        fw.close();

        JFrame fname;
        fname=new JFrame();
        String name=JOptionPane.showInputDialog(fname,"Enter File Name along with the format it is saved as.");
        if(isValid(name)){
            total(name);
            average(name);
            printAll(name);
            printName();
        }else{
            JFrame err;
            err=new JFrame();
            JOptionPane.showMessageDialog(err,"The file name is wrong.","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }
}

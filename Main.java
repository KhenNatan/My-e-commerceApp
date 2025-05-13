import java.util.*;

public class Main{
    
    public void multiply(int x, int y){
        
        System.out.println(x * y);
    }
    public static int addition(int x, int y, int k){
        
        return x + y + k;
    }
    public static void main(String[] args){

        System.out.println("Hello, Please scroll down to find the full options.");
        
       new Main().multiply(2,6);

       System.out.println(addition(3,4, 3));
    }

}
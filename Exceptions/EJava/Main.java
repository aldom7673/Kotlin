package Exceptions.EJava;
import Exceptions.EKotlin.ExceptionKt;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try{
            int c = ExceptionKt.bar("4");
            System.out.println(c);
        }catch (NumberFormatException e){
            System.out.println("Java code");
        }
    }
}

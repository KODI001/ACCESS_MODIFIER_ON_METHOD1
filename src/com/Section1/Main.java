package com.Section1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        method1();
        method2();
        System.out.println(method3());
        System.out.println(method4(25,25));
        System.out.println(method5(3.2f,4.5f));
    }
    public static void method1(){
        System.out.println("Method one is running");
    }
    static void method2(){
        System.out.println("Method two is running");
    }
    static String method3(){
        return "KODIYARASU";
    }
    static int method4(int num1,int num2){
        return num1+num2;
    }
    static float method5(float num1, float num2){
        return num1+num2;
    }

}

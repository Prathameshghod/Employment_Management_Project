package com.emp;

import java.util.Scanner;

public class Main {
    public static Scanner sc= new Scanner(System.in);
    static int num=0;
    static int max=20;

    static Employee[] EmpTable = new Employee[max];

    public static void menu(){
        while(true){
            System.out.println("\n====================================");
            System.out.println("   EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("====================================");

            System.out.println("1. Build Table");
            System.out.println("2. Insert New Entry");
            System.out.println("3. Delete Entry");
            System.out.println("4. Search Employee");
            System.out.println("5. Exit");

            int n=sc.nextInt();
            switch(n){
                case 1->{
                    BuildTable.buildTable();
                }
                case 2->{
                    Insert.insert();
                }
                case 3->{
                    System.out.print("Enter Employee ID to delete: ");
                        int empid=sc.nextInt();
                        Delete.delete(empid);
                }
                case 4->{
                    System.out.print("Enter Employee ID to search: ");
                    int empid=sc.nextInt();
                    SearchEmployee.search(empid);
                }
                case 5->{
                    return;
                }
                default ->  {
                    System.out.println("Expected Options" + " are 1/2/3/4/5");
                }
            }
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
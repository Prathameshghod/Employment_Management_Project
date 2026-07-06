package com.emp;

import javax.naming.directory.SearchControls;
import java.util.Scanner;

public class Main {
    public static Scanner sc= new Scanner(System.in);
    static int num;
    static int max=20;

    static Employee[] EmpTable = new Employee[max];

    public static void menu(){
        while(true){
            System.out.println("-------------------------"
                    + "Employee"
                    + " Management System"
                    + "-------------------------\n");

            System.out.println("Available Options:\n");
            System.out.print("Build Table         (1)\n");
            System.out.print("Insert New Entry    (2)\n");
            System.out.print("Delete Entry        (3)\n");
            System.out.print("Search a Record     (4)\n");
            System.out.print("Exit                (5)\n");
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
                System.out.print("Enter Employee ID to delete: ");
                int empid=sc.nextInt();
                SearchEmployee.search(empid);
            }
//            case 5->{
//                return;
//            }
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
package com.emp;

public class Insert {
    public static void insert(){
        int n=Main.num;
        int max=Main.max;
        if(n>=max){
            System.out.println("Table full");
        }
        else{
            Main.EmpTable[n]=new Employee();
            System.out.println("\nEmployee " + (n + 1));

            System.out.print("Enter Employee ID: ");
            Main.EmpTable[n].Empid = Main.sc.nextInt();

            System.out.print("Enter Name: ");
            Main.EmpTable[n].name = Main.sc.next();

            System.out.print("Enter Designation: ");
            Main.EmpTable[n].designation = Main.sc.next();

            System.out.print("Enter Experience: ");
            Main.EmpTable[n].exp = Main.sc.nextInt();

            System.out.print("Enter Age: ");
            Main.EmpTable[n].age = Main.sc.nextInt();
        }
        Main.num++;
        System.out.println("Inserted");
    }
}

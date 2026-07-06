package com.emp;

public class Insert {
    public static void insert(){
        int n=Main.num;
        int max=Main.max;
        if(n>=max){
            System.out.println("Table full");
            return;
        }

            Main.EmpTable[n]=new Employee();

        System.out.println("\n---------- Enter Employee Details ----------");

            System.out.print("Enter Employee ID: ");
            Main.EmpTable[n].Empid = Main.sc.nextInt();

            for (int i = 0; i < Main.num; i++) {

                if (Main.EmpTable[i].Empid == Main.EmpTable[Main.num].Empid) {
                    System.out.println("Employee ID already exists!");
                    Main.EmpTable[Main.num] = null;
                    return;
                }
            }

            System.out.print("Enter Name: ");
            Main.EmpTable[n].name = Main.sc.next();

            System.out.print("Enter Designation: ");
            Main.EmpTable[n].designation = Main.sc.next();

            System.out.print("Enter Experience: ");
            Main.EmpTable[n].exp = Main.sc.nextInt();

            System.out.print("Enter Age: ");
            Main.EmpTable[n].age = Main.sc.nextInt();

        Main.num++;
        System.out.println("\nEmployee Inserted Successfully!");
        System.out.println("Total Employees : " + Main.num);
    }
}

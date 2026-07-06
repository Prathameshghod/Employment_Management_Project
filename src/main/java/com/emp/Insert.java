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
        Main.EmpTable[Main.num].setEmpid(Main.sc.nextInt());

            for (int i = 0; i < Main.num; i++) {

                if (Main.EmpTable[i].getEmpid() == Main.EmpTable[Main.num].getEmpid()) {
                    System.out.println("Employee ID already exists!");
                    Main.EmpTable[Main.num] = null;
                    return;
                }
            }

            System.out.print("Enter Name: ");
        Main.EmpTable[Main.num].setName(Main.sc.next());

            System.out.print("Enter Designation: ");
        Main.EmpTable[Main.num].setDesignation(Main.sc.next());

            System.out.print("Enter Experience: ");
        Main.EmpTable[Main.num].setExp(Main.sc.nextInt());

            System.out.print("Enter Age: ");
        Main.EmpTable[Main.num].setAge(Main.sc.nextInt());

        Main.num++;
        System.out.println("\nEmployee Inserted Successfully!");
        System.out.println("Total Employees : " + Main.num);
    }
}

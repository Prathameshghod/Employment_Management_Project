package com.emp;

public class BuildTable {
    public static void buildTable() {
        int maxi = Main.max;
        for (int i = 0; i < Main.max; i++) {
            Main.EmpTable[i] = null;
        }
        System.out.println("\n========== BUILD EMPLOYEE TABLE ==========");
        System.out.println("Maximum Employees Allowed: " + Main.max);

        System.out.print("Enter number of employees: ");
        int n = Main.sc.nextInt();

        if (n > maxi) {
            System.out.println("max entries are " + maxi);
            n = maxi;
        }
        for (int i = 0; i < n; i++) {
            Main.EmpTable[i] = new Employee();

            System.out.println("\n---------- Employee " + (i + 1) + " ----------");

            System.out.print("Enter Employee ID: ");
            Main.EmpTable[i].Empid = Main.sc.nextInt();

            System.out.print("Enter Name: ");
            Main.EmpTable[i].name = Main.sc.next();

            System.out.print("Enter Designation: ");
            Main.EmpTable[i].designation = Main.sc.next();

            System.out.print("Enter Experience: ");
            Main.EmpTable[i].exp = Main.sc.nextInt();

            System.out.print("Enter Age: ");
            Main.EmpTable[i].age = Main.sc.nextInt();
        }
        Main.num = n;
        System.out.println("\n=================================");
        System.out.println("Employee Table Built Successfully");
        System.out.println("Total Employees : " + Main.num);
        System.out.println("=================================");
    }
}

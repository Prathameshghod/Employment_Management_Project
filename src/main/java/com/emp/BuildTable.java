package com.emp;

public class BuildTable {
    public static void buildTable(){
        int maxi=Main.max;
        System.out.println("Build the table");
        System.out.println("Max entries can be "+maxi);
        int n=Main.sc.nextInt();
        System.out.println("Enter the no. of Entries "+ n);

        if(n>maxi){
            System.out.println("max entries are "+maxi);
            n=maxi;
        }
        for(int i=0;i<n ;i++){
            Main.EmpTable[i] = new Employee();

            System.out.println("\nEmployee " + (i + 1));

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
        Main.num=n;
        System.out.println("Employee Table Built Successfully");
    }
}

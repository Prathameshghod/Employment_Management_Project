package com.emp;

public class BuildTable {
    public static void buildTable(){
        int maxi=Main.max;
        System.out.println("Build the table");
        System.out.println("Max entries can be "+maxi);
        int n=Main.sc.nextInt();
        System.out.println("Enter the no. of Entries "+ n);

        if(maxi>20){
            System.out.println("max entries are "+maxi);
            n=maxi;
        }
        for(int i=0;i<maxi;i++){
            Main.EmpTable[i].Employee.name=Main.sc.next();
        }
    }
}

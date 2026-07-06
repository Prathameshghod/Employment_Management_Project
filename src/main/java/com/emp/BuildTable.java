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
            Main.EmpTable[i]=new Employee();

        }
    }
}

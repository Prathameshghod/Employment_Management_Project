package com.emp;

public class SearchEmployee {
    public static void search(int id){
        int n=Main.num;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(Main.EmpTable[i].Empid==id){
                idx=i;
                break;
            }
        }
        System.out.println("Empid" + Main.EmpTable[idx].Empid);
        System.out.println("Name" + Main.EmpTable[idx].name);
        System.out.println("Designation" + Main.EmpTable[idx].designation);
        System.out.println("age" + Main.EmpTable[idx].age);
        System.out.println("Experience" + Main.EmpTable[idx].exp);
    }
}

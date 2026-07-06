package com.emp;

public class SearchEmployee {
    public static void search(int id){
        int n=Main.num;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(Main.EmpTable[i].getEmpid()==id){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            System.out.println("Employee Not Found");
            return;
        }
        System.out.println("\n========== Employee Found ==========");

        System.out.println("Employee ID   : " + Main.EmpTable[idx].getEmpid());
        System.out.println("Name          : " + Main.EmpTable[idx].getName());
        System.out.println("Designation   : " + Main.EmpTable[idx].getDesignation());
        System.out.println("Experience    : " + Main.EmpTable[idx].getExp() + " Years");
        System.out.println("Age           : " + Main.EmpTable[idx].getAge());

        System.out.println("====================================");
    }
}

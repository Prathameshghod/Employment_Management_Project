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

    }
}

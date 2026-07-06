    package com.emp;

    public class Delete {
        public static void delete(int id){
            int n=Main.num;
            int idx=-1;
            for(int i=0;i<n;i++){
                if(Main.EmpTable[i].Empid==id){
                    idx=i;
                    break;
                }
            }
            if(idx==-1){
                System.out.println("Employee not found");
            }
            for(int i=idx;i<n-1;i++){
                Main.EmpTable[i]=Main.EmpTable[i+1];
            }
            Main.EmpTable[n-1]=null;
            Main.num--;
            System.out.println("Deleted Employee");
        }
    }

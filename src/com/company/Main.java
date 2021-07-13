package com.company;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Sc.nextInt();
        int space = num-1;
        int count = 1;
        int mid = (num+1)/2;
        int printNum = 1;
        for(int i=0; i<num ; i++)
        {
            for(int j=1; j<space; j++){
                System.out.print(" ");
            }
            for(int z=1; z<=count;z++){

                System.out.print(printNum);
                if(z<=count/2){
                    printNum--;
                }else{
                    printNum++;
                }
            }
            if(i < mid-1){
                count = count+2;
                space = space-1;
                System.out.print("\n");
                printNum = i+2;
            }else{
                count = count-2;
                space = space+1;
                System.out.print("\n");
                printNum = printNum-2;
            }

        }
    }
}
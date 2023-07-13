package Assignment_2;

//import java.util.Scanner;

 class ProdMinusSum {
     public static void main(String[] args) {
         int n = 2616;

         int sum = 0;
         int prod = 1;

         while(n != 0) {
             sum = sum + (n%10);
             prod = prod * (n%10);
             n = n/10;
         }
         System.out.println(prod - sum);
     }
 }

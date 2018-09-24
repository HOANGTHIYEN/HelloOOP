/*
 Viết hàm tính ucln của 2 số
 viết hàm tính số Fibonaci
 In kết quả ra màn hình.
*/

import java.util.Scanner;

public class bai1 {
   
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    System.out.println("chuong trinh tinh UCLN: ");
    System.out.println("Nhap a: ");
    int a = sc.nextInt();
    
    System.out.println("Nhap b: ");
    int b = sc.nextInt();
    
    bai1 hihi = new bai1();
    
    hihi.UCLN(a,b); //gọi hàm in ra ucln
    
    System.out.println("chuong trinh tính số Fibonaci: ");
    System.out.println("nhập giá trị số Fibonaci n: ");
    int n = sc.nextInt(); 
    hihi.Fibonaci(n);  //gọi hàm in ra số Fibonaci;
    
    }
    
    
    // Hàm tính ước chung lớn nhất.
    public void UCLN(int a, int b){
        while(a!=b){
    if(a>b){
        a=a-b;
    }else{
        b = b - a;
      }
     }
        System.out.println("UCLN = "+a); 
    }
    
    // Hàm tính Fibonaci.
    public void Fibonaci(int n){
        int[] a = new int[100]; 
        a[0] = 0;
        a[1] = 1;
        int s = 0;
        if(n>1){
            for(int i=2; i<=n; i++){
                a[i] = a[i-1] + a[i-2];
                s = a[i];
            }
        }
        System.out.println("số Fibonaci F("+n+") = "+s);
    }
}
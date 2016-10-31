package ex;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 105021057 張岳埕
 */
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt(); 
		String n = scn.next(); 
        fun1(m,n);
	}
	public static void fun1(int m,String n){
		for(int a = 1;a<=m;a++){
			for(int b=1;b<=m;b++){
				System.out.print(n);
			}
			System.out.println();
		}
		
	}
}

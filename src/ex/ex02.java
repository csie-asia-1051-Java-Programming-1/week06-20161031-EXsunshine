package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021057 張岳埕
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int m = scn.nextInt(); 
int n = scn.nextInt(); 
fun1(m,n);
	}
	public static void fun1(int m,int n){
		double sum = 1;
		for(int d = m;d>0;d--){
			sum = sum*d;
		}
		double sum1 = 1;
		for(int c = n;c>0;c--){
			sum1 = sum1*c;
		}
		double sum2 = 1;
		int QQ = m-n;
		for(int z = QQ;z>0;z--){
			sum2 = sum2*z;
		}
		System.out.println(sum/sum1*sum2);
	}
}

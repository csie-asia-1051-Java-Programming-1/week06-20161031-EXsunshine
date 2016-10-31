package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021057 張岳埕
 */
import java.util.*;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
String a = scn.next();
String arr[]=a.split(" ");
square(arr);
	}
	public static void square(String arr[]) {
		double z = 0;
		for(int d =0;d<=arr.length;d++){
			z=Integer.valueOf(arr[d]);
			z= Math.pow(z,2);
			System.out.print(z);
		}
	}
}

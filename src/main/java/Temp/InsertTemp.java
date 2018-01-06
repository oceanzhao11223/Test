package Temp;

import java.util.Arrays;

public class InsertTemp {


	public static void main(String[] args) {
		int[] a =new int[]{49,38,65,97,76,13,27};
		method(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void method(int[]a){
		
	if(a==null)
		return;
	for(int i=1;i<a.length;i++){
		int j;
		int temp =a[i];
		for(j=i-1;(j>=0)&&a[j]<temp;j--){
			a[j+1] =a[j];
		}
		a[j+1]=temp;
	}
	}
}

package Test;

import java.util.Arrays;

public class InsetSort {


	public static void main(String[] args) {
		int[] a =new int[]{49,38,65,97,76,13,27};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void sort(int[] a){
		
		if(a==null) return;
		
		for(int i=1;i<a.length;i++){
			System.out.println(Arrays.toString(a));
			int temp =a[i];
			int j;
			for(j=i-1;(j>=0)&&(a[j]<temp);j--){
//				int temp =a[j];
				a[j+1]=a[j];
			}
			a[j+1]=temp;
			
		}
	}
}

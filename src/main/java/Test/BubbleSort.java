package Test;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a =new int[]{49,38,65,97,76,13,27};
		bubblesort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void bubblesort(int[] a){
		
		if(a==null){
			return;
		}
		
		boolean flag =true;
		for(int i=0;i<a.length-1&&flag;i++){
			flag =false;
			for(int j=a.length-1;j>0;j--){
				if(a[j]<a[j-1]){
					int temp =a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					flag=true;
				}
			}
			
		}
	}
	public static void sort(int[] a){
		
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp =a[j];
					a[j] =a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}

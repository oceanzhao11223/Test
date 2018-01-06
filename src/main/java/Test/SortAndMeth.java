package Test;

import java.util.Arrays;

public class SortAndMeth {

	/*
	 * 在排序中，90%的概率会考察快速排序算法，
	 * 所以我们需要准备一个没有任何bug的快速排序算法。
	 * 当面试官让我们写一个快排的时候，
	 * 我们可以毫不犹豫的写出来。在一些简单的时候，
	 * 面试官可能会要求你写一个二分查找算法。
	 * 
	 */
	public int start =0;
	
	public static void main(String[] args) {
		
		int[] a =new int[]{49,38,65,97,76,13,27};
		
		/*
		 *  49 38 65 97 76 13 27
		 *  27 38 65 97 76 13 49
		 *  27 38 
		 * 
		 * 
		 */
		
		
		
		int start =0; 
		int end =a.length-1;
		quickSort(a, start, end);
		//声明 开始索引  和最后一个索引
		System.out.println(Arrays.toString(a));
	}
	
	//构造方法 有三个参数  数组  数组的两个索引   0 和最后一个
	public static void quickSort(int[] a,int low ,int high){
	
		System.out.println(Arrays.toString(a));
	int start =low;	 //声明局部变量 开始索引
	int end =high;	//声明 局部变量 最后一个索引
	int key =a[low]; //指针 用于将数组分成大于它 和小于它的两部分
	
	//判断条件 最后一个索引值 必须大于开始索引
	while(end>start){
		
		//如果最后一个索引值大于 第一个 并且 最后的索引对应的数组值大于指针 那么就让后边的索引值减一直到条件不满足
		while(end>start&&a[end]>=key){
			end--;
		}
		//如果第二个索引值对应的数组值小于指针 就让两个数组值交换位置
			if(a[end]<=key){
				int temp =a[end];
				a[end] =a[start];
				a[start]=temp;
			
		}
		//如果第一个索引的索引值小于指针 那么就让第一个索引值加一 直到不满足条件	
		while(end>start&&a[start]<=key){
			
			start++;
		}
		//如果a的索引值大于指针值 交换位置
			if(a[start]>=key){
				int temp =a[start];
				a[start] =a[end];
				a[end] =temp;
			
			
		}
	
	}
	//  start 3 low 0  (a,0,2)  改变了数组的第二个指针的位置 
	if(start>low) 
		quickSort(a,low,start-1);
	
	if(end<high)
		quickSort(a,end+1,high);
	
		
	}
}

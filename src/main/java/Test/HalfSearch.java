package Test;

public class HalfSearch {

	/*
	 * 二分查找又称折半查找，
	 * 优点是比较次数少，查找速度快，平均性能好；
	 * 其缺点是要求待查表为有序表，且插入删除困难。
	 * 因此，折半查找方法适用于不经常变动而查找频繁的有序列表
	 * 
	 */
	//二分查找的数组 必须保证数组是有序排列的 然后就是需要四个参数 有序数组 左边值 右边值  目标值
	public static int digui(int[] a,int left ,int right,int target){
		//得到中间的那个数字的索引 以及值
		int mid =(left+right)/2;
		int midvalue =a[mid];
		//自始至终保证左边值大于右边的值 然后判断二分数值与目标值的比较
		if(left<=right){
			if(midvalue>target){
				return digui(a, left, mid-1, target);
			}else if(midvalue<target){
				return digui(a, mid+1, right, target);
			}else{
				return mid;
			}
		}
		
		return -1;
	}
	//非递归的方式就是通过while循环实现的
	public static int nodigui(int[] a,int target){
		
		int i=0;
		int j=a.length-1;
		//声明左右两边的索引 循环条件是保证左边大于右边
		while(i<=j){
			int mid =(i+j)/2;
			int midvalue =a[mid];
			if(midvalue>target){
				j=mid-1;
			}else if(midvalue<target){
				i=mid+1;
			}else{
				return mid;
			}
		}
		//比较简单 不想写了
		return -1;
	}
	
	
}

class MoveNegativeASide{
	public static void rearrange(int arr[], int len){
		int right_point = len-1, left_point = 0;
		while(right_point>left_point){
			if(arr[right_point]>0) right_point--;
			else if(left_point<0) left_point++;
			else{
				int tmp = arr[right_point];
				arr[right_point] = arr[left_point];
				arr[left_point] = tmp;
				right_point--;
				left_point++;
			}
		}
	}
	public static void main(String args[]){
		int length = 5;
		int arr[] = new int[5];
		arr[0] = 3;
		arr[1] = -1;
		arr[2] = 3;
		arr[3] = -3;
		arr[4] = -4;

		//calling rearrange
		rearrange(arr, length);

		// displaying array result
		for(int i: arr){
			System.out.print(i + " ");
		}
	}
}
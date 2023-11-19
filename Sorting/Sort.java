import java.util.*;


class Sort{

	public static void SelectionSort(int arr[], int length){
		for(int i=0;i<length;i++){
			int index_smallest = i;
			for(int j=i+1;j<length;j++){
				if(arr[index_smallest]>arr[j]){
					index_smallest = j;
				}
			}
			int temp = arr[index_smallest];
			arr[index_smallest] = arr[i];
			arr[i] = temp;
		}
	}

	public static void BubbleSort(int arr[], int length){
		for(int k=1;k<length;k++){
			int flag = 0;
			for(int i=0;i<length-k;i++){
				if(arr[i]>arr[i+1]){
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					flag = 1;
				}
			}
			if(flag==0) break;
		}
	}

	public static void InsertionSort(int arr[], int length){
		for(int i=0;i<length;i++){
			int currentElement = arr[i];
			int j=i;
			while(j>0 && arr[j-1]>currentElement){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=currentElement;
		}
	}

	public static void merge(int arr[], int len, int left[], int lenLeft, int right[], int lenRight){
		int i=0,j=0,k=0;
		while(j<lenLeft && k<lenRight){
			if(left[j]<=right[k]){
				arr[i]=left[j];
				j++;
			}else{
				arr[i]=right[k];
				k++;
			}
			i++;
		}
		while(j<lenLeft){
			arr[i]=left[j];
			i++;
			j++;
		}
		while(k<lenRight){
			arr[i]=right[k];
			i++;
			k++;
		}
	}

	public static void mergeSort(int arr[], int length){
		if(length<2) return ;
		int mid = length / 2;
		int left[] = new int[mid];
		int right[] = new int[length-mid];
		// copying elements to sub-arrays
		for(int i=0;i<mid;i++){
			left[i] = arr[i];
		}
		for(int i=mid;i<length;i++){
			right[i-mid] = arr[i];
		}
		// sorting sub-arrays
		mergeSort(left, mid);
		mergeSort(right, length-mid);
		// merging both sub-arrays to main array
		merge(arr, length, left, mid, right, length-mid);
	}

	public static void display(int arr[], int length){
		for(int i=0;i<length;i++){
			System.out.print(arr[i]+" ");
		}
	}


	public static void main(String args[]){
		int length = 10;
		int arr[] = new int[length];
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 3;
		arr[3] = 9;
		arr[4] = 7;
		arr[5] = -7;
		arr[6] = 11;
		arr[7] = -97;
		arr[8] = 65;
		arr[9] = 0;
		// SelectionSort(arr, length);
		// BubbleSort(arr, length);
		// InsertionSort(arr, length);
		mergeSort(arr, length);
		display(arr, length);
	}
}
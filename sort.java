public class BubbleSort {  
  public static void selectionSort(int[] arr){  
    for (int i = 0; i < arr.length - 1; i++)  
    {  
        int index = i;  
        for (int j = i + 1; j < arr.length; j++){  
            if (arr[j] < arr[index]){  
                index = j;
            }  
        }  
        int smallerNumber = arr[index];   
        arr[index] = arr[i];  
        arr[i] = smallerNumber;  
    }  
} 
    public static void main(String[] args) {  
                int arr[] ={31,20,95,78,65,500,59};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);
                 
                System.out.println("Array After Bubble Sort:");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  
/**
 * Bubble sort assignment class. 
 * @author: MaGE 101 - Java faculty
 */
public class BubbleSortAssignment {

    public static void main(String[] args) {
        int intArray[] = new int[]{67, 89, 23, 91, 45, 3};
       
        System.out.println("Before Bubble Sort");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
       
        bubbleSort(intArray);
		System.out.println("");
		
        System.out.println("After Bubble Sort");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
 
    }
 
    public static void bubbleSort(int[] intArray) {               
        int n = intArray.length;
        int temp = 0;
       
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){               
                if(intArray[j-1] > intArray[j]){
                    //swap the elements!
                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }
}

public class BubbleSortCode {
    

public static void main(String[] args){
    int[] array = {1,9,4,5,8,2,7,6,11,10};

    bubblesort(array);

for(int i : array){
    System.out.println(i);
}

}

public static void bubblesort(int[]array){

for(int i=0; i<array.length-1; i++){

    for(int j=0; j<array.length-i-1; j++){
        
        if(array[j]>array[j+1]){
            int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
        }

    }
}


}

}

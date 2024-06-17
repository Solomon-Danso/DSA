public class LinearSearchCode {
    

public static void main(String[] args){
    int[] array = {1,2,4,3,6,7,8,9,10,11,12,13,14,8,5,3,1,45,6}; 
    //Searching for the actual value eg 5 or solo or mobile phone 
    int index = linearSearch(array, 10);
    if(index!=-1){
        System.out.println("The index of the value we are looking for is " + index);
    }
    else{
        System.out.println("No Index found");
    }


    String[] sArray = {"Solomon","Gershon", "Jonathan", "Caleb", "Vivian"};
    int sindex = linearSearchForStrings(sArray, "Jonathan");
    if(sindex!=-1){
        System.out.println("The index of the value we are looking for is " + sindex);
    }
    else{
        System.out.println("No Index found");
    }



}


private static int linearSearch(int[] array, int value){
    
    for(int i=0; i<array.length; i++){
        if(array[i]==value){
           /*
            * If the value of array[i] is equal to the actual value we are looking for,
            then we will return the index of the value
            */
            return i;
        }
      
    }
    return -1;
    
}


private static int linearSearchForStrings(String[] array, String value) {
    for (int i = 0; i < array.length; i++) {
        if (array[i].equals(value)) {
            /*
             * If the value of array[i] is equal to the actual value we are looking for,
             * then we will return the index of the value
             */
            return i;
        }
    }
    return -1;
}



}

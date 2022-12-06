package searching.binary;

import java.util.Objects;

public class BinarySearchMain {
    public int search(int[] data, int value){
        int leftPtr = 0;
        int rightPtr = data.length - 1;

        while (leftPtr <= rightPtr){

            int mid = (leftPtr + rightPtr) / 2;
            if(data[mid] == value){
                return data[mid];
            } else if(value < data[mid]){
                // so we have to move to left
                rightPtr = mid - 1;
            } else{
                leftPtr = mid + 1;
            }


        }
        return -1;
    }
    public static void main(String[] args) {

        int[] nos = {1, 4, 5, 7, 15, 21, 56, 67, 79, 81, 90, 113, 121, 135};
        System.out.println(new BinarySearchMain().search(nos, 79));
    }
}

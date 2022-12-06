package searching.linear;

public class LinearSearch {

    public <T> int search(T[] array, T element){
       for(int pos = 0; pos < array.length; pos++){
           if(array[pos].equals(element)){
               return pos + 1;
           }
       }
       return -1;
    }
}

package searching.linear;

public class LinearSearchMain {
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        Integer[] numbers = {3, 5, 10, 45, 56, 21};
        String[] data = {"Mihir", "Yash", "Hari", "Shayan"};
//        int res = ls.search(numbers, 56);
         int res = ls.search(data, "Mihir");
         res = ls.search(data, "Aayan");
        if(res != -1){
            System.out.println("Found at pos: "+res);
        } else{
            System.out.println("Element not found");
        }

    }
}

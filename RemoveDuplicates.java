import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;

 interface InnerRemoveDuplicates {

    public void showMessages(String messages);
    
}

 class RemoveDuplicates {

    public static int removeDuplicate(int[] arr){
        Arrays.sort(arr);
        int i=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static void removeDuplicates2(int[] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }

        for (int element : hashSet) {
            System.out.print(element+ " ");
        }

    }

    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(10, 20, 30, 40, 50, 15, 100, 1, 123, 10);
        int[] ans = {10, 20, 30, 40, 50, 15, 100, 10, 1, 123};
        System.out.println(removeDuplicate(ans));
        removeDuplicates2(ans);
        /*elements.stream().forEach(number -> {
            if (number % 2 == 0) {
                System.out.println(number + ": is even");
            }else{
                System.out.println(number + ": is odd");
            }
        });*/

        elements.stream().filter(number -> String.valueOf(number).startsWith("1"))
        .forEach(number -> System.out.println(number + " start with 1"));

        InnerRemoveDuplicates msging = (msg) -> {
            System.out.println("Message Received: "+ msg);
            System.out.println("Processed Message: "+msg.toUpperCase());
        }; 
        msging.showMessages("Shree Ram");
    }
}

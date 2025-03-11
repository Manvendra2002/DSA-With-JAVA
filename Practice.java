import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice{
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87, 18);
        List<Integer> newList = listOfIntegers.stream().filter(num -> num%2 == 0).collect(Collectors.toList());
        List<Integer> removeDuplicate = listOfIntegers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(newList);

        System.out.println(removeDuplicate);

        Map<Boolean, List<Integer>> evenOddNUm = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i%2 == 0));
        Set<Entry<Boolean, List<Integer>>> entrySet = evenOddNUm.entrySet();

        for (Entry<Boolean,List<Integer>> entry : entrySet) {
            if (entry.getKey()) {
                System.out.println("Even numbers");
            }else{
                System.out.println("Odd Numbers");
            }

            List<Integer> list = entry.getValue();
            for (int i : list) {
                    System.out.println(i);
            }
        }

        //System.out.println(evenOddNUm);

        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> findFreq = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(findFreq);

        List<Integer> list1 = Arrays.asList(10,20,30);
        List<Integer> list2 = Arrays.asList(40,50,60);

        List<Integer> list3 = Stream.concat(list1.stream(), list1.stream()).toList();


    }

}
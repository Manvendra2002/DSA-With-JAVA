public class ReverseString{
    /*public static void main(String[] args) {
        String str = "Today I have interview with kloudgin";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length -1; i >= 0 ; i--) {
            result.append(Character.toUpperCase(words[i].charAt(0)))
            .append(words[i].substring(1));

            if(i !=0) result.append(" ");
        }
        
        System.out.print(result);
    }*/

    public static void main(String[] args) {
        int[] ans = {10, 20, 30, 40, 50, 15, 100, 10, 1, 123};
        System.out.println(isSorted(ans));
    }

    public static boolean isSorted(int[] arr){

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }

        return true;
    }

}
       
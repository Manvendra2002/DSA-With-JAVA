# DSA-With-JAVA
ArrayList question

                                                    Manvendra stores only even

Manvendra decides today to teach even numbers.
In order to do that he stores only even numbers in the arraylist(or a string) and in the end prints the arraylist(or a string) in reverse.

The moment he gets a number,

If the number is even, he stores the number at the end of the arraylist/string

If the number is odd, he removes the number that is at the last in the arraylist/string.

If the number is zero, he doesn't do anything.

If the number is negative, he stops taking any more numbers and prints the complete arraylist/string in reverse.

When he prints the arraylist(or string) he prints each number that was given as an input in a separate line.

Input Format

You will be getting a stream of numbers.

Constraints

-2^10<= Each Number <=2^20

Output Format

Print the output as explained above.

Sample Input 0

11
21
22
23
0
10
0
0
444
-10
Sample Output 0

444
10

========================Solutions One=========================
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<>();
        int n=0;
        for(int i=0; n>-1; i++){
            if(n%2 == 0){
                arr.add(n);
            }
            else if(n%2==1){
                if(arr.size()>0)
                    arr.remove(arr.size()-1);
            }
            else if(n==0){
                continue;
            }
            n=sc.nextInt();
        }
        Collections.reverse(arr);
        for(Integer var:arr){
            if(var!=0)
            System.out.println(var+" ");
        }
    }
}


=================================Solution Two==================================

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<>();
        int i=1;
        while(i==1){
            int n=sc.nextInt();
            if(n<0){
                break;
            }else if(n==0){
                continue;
            }else if(n>0){
                if(n%2==0){
                    arr.add(n);
                }else if(arr.size()>0){
                    arr.remove(arr.size()-1);
                }else{
                    continue;
                }
            }
        }
        for(int k=arr.size()-1; k>=0; k--){
            System.out.println(arr.get(k));
        }
    }
}


package javacollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

 
public class Javacollections {

   
    public static void main(String[] args) {
     String[]numbers= new String []{"one","two","three"};
     List list = (List)Arrays.asList(numbers);
     System.out.println("String array converted to list");
     for (int i=0;i<list.size();i++){
         System.out.println(list.get(i));
         
     }
     List anotherList=new ArrayList();
     Collections.addAll(anotherList, numbers);
    }
    
}

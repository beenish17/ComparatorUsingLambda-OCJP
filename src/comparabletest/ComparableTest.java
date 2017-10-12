
package comparabletest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableTest {
    
    public static void main(String[] args) {
        Comparator<ComparableClass> compare=(d1,d2)->{ // Using LAmbda
            int result = d1.getName().compareTo(d2.getName());// Comparing multiple objects.if names are same compare them by weight:                                         
            if(result !=0) return result;
            return d1.getWeight()- d2.getWeight();
    };
        Comparator<ComparableClass> compare1=new Comparator<ComparableClass>(){ // Using Anonymas Classes.
            public int compare(ComparableClass d1,ComparableClass d2){
            int result = d1.getName().compareTo(d2.getName());
            if(result !=0) return result;
            return d1.getWeight()- d2.getWeight();
        }
    };
        Comparator<ComparableClass> d=(o1,o2)->{    //Another way using lambda
            Comparator<ComparableClass> c;
            c=Comparator.comparing(o->o.getName());
            c.thenComparingInt(s->s.getWeight());
            return c.compare(o1, o2);
    };
       List<ComparableClass> bunny=new ArrayList<>();
       bunny.add(new ComparableClass("Dog", 4));
       bunny.add(new ComparableClass("Cat", 33));
       bunny.add(new ComparableClass("Tiger", 22));
       bunny.add(new ComparableClass("Aach", 02));
       bunny.add(new ComparableClass("Elephant", 2));
       bunny.add(new ComparableClass("Dog", 21));
       bunny.add(new ComparableClass("Rat", 0));
       
       Collections.sort(bunny,compare1);
       System.out.println(bunny);
       Collections.sort(bunny, compare);
       System.out.println(bunny);
       Collections.sort(bunny, d);
        System.out.println(bunny);
       
    }
    
    
}

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> b=new LinkedHashSet<>();
        b.add(10);
        b.add(20);
        b.add(10);
        b.add(30);
        Iterator<Integer> itr=b.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

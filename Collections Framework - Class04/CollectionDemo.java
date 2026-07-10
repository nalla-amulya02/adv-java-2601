import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
      LinkedList<Integer> list = new LinkedList<>();
      list.add(1);
      list.add(3);
      System.out.println(list);

      Vector<Integer> v = new Vector<>();
      v.add(2);

      Stack<Integer> s = new Stack<>();
      s.push(4);
      s.push(5);
      System.out.println(s);
      s.pop();
      System.out.println(s);


      HashSet<Integer> set = new HashSet<>();
      LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
      TreeSet<Integer> ts = new TreeSet<>();
      ts.add(5);
      ts.add(3);
      ts.add(5);
      System.out.println(ts);

      PriorityQueue<Integer> pq = new PriorityQueue<>();
      pq.offer(2);
      pq.offer(4);
      pq.poll();


      HashMap<Integer,String> hp = new HashMap<>();
      hp.put(100,"John");

      LinkedHashMap<Integer,String> lhp = new LinkedHashMap<>();
      lhp.put(101,"John");
      lhp.put(100,"jimmy");
      
      System.out.println(lhp);

      TreeMap<Integer,String> tm = new TreeMap<>();
      tm.put(101,"John"); 
      tm.put(100,"jimmy");
      System.out.println(tm);

      Hashtable<Integer,String> ht = new Hashtable<>();


      

    }


    
}

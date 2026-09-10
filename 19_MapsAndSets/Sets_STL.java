// import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
public class Sets_STL {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> set = new TreeSet<>();
        // TreeSet is an ordered set
        // TreeSet ke andar add karne ki search karne remove karne ki time complexity O(log n)
        // agar koi value treeSet/hashSet me nahi hai fir bhi usko remove kare to wo hame error nahi deta hai
        // It is implemented by (Balanced) Binary Search tree
        set.add(77);
        set.add(65);
        set.add(21);
        set.add(2);
        set.add(11);
        set.add(45);
        set.add(18);
        for(int ele : set){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(set.size());
        System.out.println(set.contains(21));
        System.out.println(set.contains(24));
        set.remove(21);
        System.out.println(set.contains(21));
        System.out.println(set.size());
        System.out.println(set.removeLast());
    }
}

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;



public class Solution {

    public static void main(String[] args) {
        Queue<Integer> num = new PriorityQueue<>();
        
        num.offer(16);
        num.offer(500);
        num.offer(1);
        
        while(!num.isEmpty()){
            System.out.println(num.poll());
        }
    }
}

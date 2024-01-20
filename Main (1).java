
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(12);
		v.add(15);
		v.add(95);
		v.add(856);
		
		System.out.println(v);
		v.remove(1);
		System.out.println(v);
		v.remove((Integer)95);
		System.out.println(v);
        
        Stack<Integer> stk =new Stack<>();
        stk.push(78);  
        stk.push(113);  
        stk.push(90);  
        stk.push(120);  
        int s=stk.search(78);
        System.out.println("location"+s);
        System.out.println(stk);
         while(!stk.isEmpty()) {
            System.out.println(stk.pop());
        }
	}
}

package leetcode;
import java.lang.String;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Test_leet {
	public boolean isBadVersion(int n){
		if (n<100){
			return false;
		}
		else{
			return true;
		}
	}
	
    public int firstBadVersion(int n) {
        return checkVersion(1,n);
    }
    
    public int checkVersion(int a, int b){
        if ((b-a) == 1){
            if (isBadVersion(a)){
                return a;
            }
            else{
                return b;
            }
        }
        else{
        	if (isBadVersion(a+(b-a)/2)){
        		return checkVersion(a, a+(b-a)/2);
        	}
        	else{
        		return checkVersion(a+(b-a)/2, b);
        	}
        }
    }
    


	public static void main(String[] args) {
		//Test_leet test_leet = new Test_leet();
		//System.out.println(test_leet.firstBadVersion(277));
		 
        Map map=new HashMap();                
        map.put("a", "aaa");    
        map.put("b", "bbb");    
        map.put("c", "ccc");    
        map.put("d", "ddd");    
           
        Iterator iterator = map.keySet().iterator();                
        while (iterator.hasNext()) {    
         Object key = iterator.next();    
         System.out.println("map.get(key) is :"+map.get(key));    
        }           
            
            
            
        Hashtable tab=new Hashtable();                
        tab.put("a", "aaa");    
        tab.put("b", "bbb");    
        tab.put("c", "ccc");    
        tab.put("d", "ddd");    
        Iterator iterator_1 = tab.keySet().iterator();    
        while (iterator_1.hasNext()) {    
         Object key = iterator_1.next();    
         System.out.println("tab.get("+ key +") is :"+tab.get(key));    
        }             
            
        TreeMap tmp=new TreeMap();                
        tmp.put("a", "aaa");    
        tmp.put("b", "bbb");    
        tmp.put("c", "ccc");    
        tmp.put("d", "ddd");    
        Iterator iterator_2 = tmp.keySet().iterator();    
        while (iterator_2.hasNext()) {    
         Object key = iterator_2.next();    
         System.out.println("tmp.get("+ key +") is :"+tmp.get(key));    
        }             
                      
	}
}

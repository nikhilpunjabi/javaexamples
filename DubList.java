// To get all the Dublicate elements from two lists.

import java.util.*;

class DubList{
	public static List<Integer> checkDub(List<Integer> a,List<Integer> b){
		List<Integer> l = new ArrayList<>();
		for(int i : a){
			if (b.contains(i)){
				l.add(i);
			}
		}

		return l;
	} 
	public static void main(String args[]){
		List<Integer> lst1 =  Arrays.asList(new Integer[] {1,2,3,1,2,45,56,45});
		List<Integer> lst2 =  Arrays.asList(new Integer[] {1,2,3,2,4,6,45,5});
		
		System.out.println(checkDub(lst1,lst2));
	}
}
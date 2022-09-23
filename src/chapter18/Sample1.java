package chapter18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sample1 {
	public static void main(String[] args) {
			var c_list = new ArrayList<Child>();
			c_list.add(new Child());
			c_list.add(new Child());
			
			List<Parent> p_list = List.copyOf(c_list);
			
			c_list.sort(Comparator.comparing(Parent::key));
		
	}

}

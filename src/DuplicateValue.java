import java.util.ArrayList;
import java.util.List;

public class DuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(10);
		list.add(60);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(20);
		System.out.println("Orginal List value is "+list);
		for(int i = 0; i < list.size(); i++) {
			
		if(list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i))) {
		int last = list.lastIndexOf(list.get(i));
		list.remove(last);
		}
		}
		System.out.println(list);
	}

}

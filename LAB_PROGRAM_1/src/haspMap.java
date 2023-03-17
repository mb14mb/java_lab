import java.util.*;
public class haspMap {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String state, capital;
		Scanner sc = new Scanner(System.in);
		Map<String, String> hmap = new HashMap<>();
		
		while(true) {
			System.out.println("*******************************************HASHMAP************************************************");
			System.out.print("1.Create\n2.Display\n3.Search\n4.Remove\n5.Sort\n6.Update\n7.Size\n8.Clear\n9.Exit"
					+ "\nEnter Your Choice : ");
			int ch = sc.nextInt();
			if(ch==1) {
				System.out.print("Enter State name : ");
				state = sc.next();
				System.out.print("Enter Capital name : ");
				capital = sc.next();
				hmap.put(state, capital);
				System.out.println("1 Data has entered");
			}else if(ch==2) {
				System.out.println("Displaying Records");
				for(Map.Entry<String, String> e : hmap.entrySet()) {
					if(hmap.isEmpty()) {
						System.out.println("Hash Map is Empty!!!");
					}else {
						
						System.out.println("State is : "+e.getKey()+" "+ "capital is :"+e.getValue());
					}
				}
			}else if(ch==3) {
				System.out.print("Enter state name to search");
				state = sc.next();
				
				if(hmap.containsKey(state)) {
					System.out.println("State is : "+state+" capital is : "+hmap.get(state));
				}else {
					System.out.println("Not found");
				}
				
			}else if(ch==4) {
				System.out.print("Enter state name to delete ");
				state = sc.next();
				hmap.remove(state);
				System.out.println("Data Removed!!!");
			}else if(ch==5) {
				System.out.println("Sorted Data is");
				TreeMap<String, String> sorted = new TreeMap<>();
				sorted.putAll(hmap);
				for(Map.Entry<String, String> e : sorted.entrySet()) {
					System.out.println("State is : "+e.getKey()+" "+ "capital is :"+e.getValue());
				}
			}else if(ch==6) {
				System.out.print("Enter State name : ");
				state = sc.next();
				System.out.print("Enter Capital name : ");
				capital = sc.next();
				hmap.replace(state, capital);
				System.out.println("Replaced state is "+state+ " capital is : "+hmap.get(state));
			}else if(ch==7) {
				System.out.println("Size of the map is : "+hmap.size());
			}else if(ch==8) {
				hmap.clear();
				System.out.println("HashMap Data is cleared");
			}else if(ch==9) {
				System.out.println("Thank You");
				break;
			}
		
		
		
		
		
		}
		
		
	}

}

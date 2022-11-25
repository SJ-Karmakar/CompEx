import java.util.Scanner;
import java.util.TreeSet;

public class Comp {

	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		TreeSet<StringBuffer> t = new  TreeSet<StringBuffer>(new Mycomp());
		System.out.println("Enter the no of Strings");
int n=sc.nextInt();
sc.nextLine();

for(int i=0;i<n;i++) {
	
	StringBuffer s= new StringBuffer();
	s=s.append(sc.nextLine());
	t.add(s);
	
}
System.out.println(t);
		
	}
	
	
}

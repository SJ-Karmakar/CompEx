import java.util.Comparator;

public class Mycomp implements Comparator {
	public int compare(Object ob1,Object ob2) {
		String s1,s2;
		int l1,l2;
		s1=ob1.toString();
		s2=ob2.toString();
		l1=s1.length();
		l2=s2.length();
		if(l1>l2) return -1;
		else if (l1<l2) return 1;
		else return 0;
	}

}

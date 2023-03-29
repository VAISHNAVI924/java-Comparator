package comparator;

import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {
		Kabbadi k1=new Kabbadi("kav",123);
		Kabbadi k2=new Kabbadi("avd",678);
		Kabbadi k3=new Kabbadi("kaa",878);
		SortKabbadiByScor s=new SortKabbadiByScor();
		TreeSet<Kabbadi>t=new TreeSet<Kabbadi>(s); 
		t.add(k1);
		t.add(k2);
		t.add(k3);
		for(Kabbadi k:t) {
			System.out.println(k);
		}
	}

}

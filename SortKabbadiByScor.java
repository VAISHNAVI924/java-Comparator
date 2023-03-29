package comparator;

import java.util.Comparator;

public class SortKabbadiByScor implements Comparator<Kabbadi>{
public int compare(Kabbadi x,Kabbadi Y) {
	return x.scor-Y.scor;
}
}

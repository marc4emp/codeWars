import java.util.Arrays;

public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
    boolean areSame = false;
        
    if (a == null || b == null) return areSame;
    if (a.length > b.length) return areSame;

    int[] aSorted = Arrays.stream(a).map(x -> x*x).sorted().toArray();
    int[] bSorted = Arrays.stream(b).sorted().toArray();
    
    if (Arrays.equals(aSorted, bSorted)) {
        areSame = true;
    }
    return areSame;
  }
}

package taskComparator;

import java.util.Comparator;

public class CompareByBreed implements Comparator{
	

	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Dog d1=(Dog)o1;//downcast it to dog type 
		Dog d2=(Dog)o2;
		return d1.breed.compareTo(d2.breed);
	}
}

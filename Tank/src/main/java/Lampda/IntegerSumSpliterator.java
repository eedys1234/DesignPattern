package Lampda;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IntegerSumSpliterator implements Spliterator<Integer> {
	
	private final int LIMIT_SPLIT_SIZE = 500;
	
	private List<Integer> integerList;
	private int currentIndex;

	public IntegerSumSpliterator(List<Integer> integerList) {
		this.integerList = integerList;
	}
	
	@Override
	public boolean tryAdvance(Consumer<? super Integer> action) {
		action.accept(integerList.get(currentIndex++));
		return currentIndex < integerList.size();
	}

	@Override
	public Spliterator<Integer> trySplit() {
		
		int currentSize = integerList.size() - currentIndex;
		if(currentSize < LIMIT_SPLIT_SIZE) {
			return null;
		}
		else {
			int splitTargetSize = currentIndex + currentSize/2;
			
			List<Integer> subList = integerList.subList(currentIndex, splitTargetSize);
			currentIndex = splitTargetSize;
			
			return new IntegerSumSpliterator(subList);
		}
	}

	@Override
	public long estimateSize() {
		return integerList.size() - currentIndex;
	}

	@Override
	public int characteristics() {
		return Spliterator.DISTINCT + Spliterator.IMMUTABLE + Spliterator.CONCURRENT + Spliterator.SIZED + Spliterator.SUBSIZED;
	}

}

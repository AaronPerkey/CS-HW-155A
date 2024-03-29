package unl.cse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class HeapSort {

	public static final Comparator<Integer> INT_CMP = Integer::compareTo;

	/**
	 * Sorts the given {@link List} using the provided {@link Comparator} using a
	 * heap sort algorithm.
	 * 
	 * @param <T>
	 * @param list
	 * @param comp
	 */
	public static <T> void heapSort(List<T> list, Comparator<T> comp) {

		// TODO: implement this using a PriorityQueue
		// Outline:
		//   For each element x in list:
		//     remove x from list
		//     add x to heap
		//   While heap is not empty:
		//     remove the min element (poll)
		//     add it to list
		PriorityQueue<T> heap = new PriorityQueue<T>(comp);
		for(int i = list.size() -1 ; i >= 0; i--) {
			heap.offer(list.remove(i));
		}
		while(!heap.isEmpty()) {
			list.add(heap.poll());
		}
		return;
	}

	public static void main(String args[]) {

		List<Integer> input = new ArrayList<>(Arrays.asList(9, 4, 6, 2, 7, 8, 1, 3, 5));
		HeapSort.heapSort(input, INT_CMP);
		System.out.println(input);
	}
}

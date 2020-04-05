package eg.edu.alexu.csd.datastructure.queue.cs31_cs60;

import eg.edu.alexu.csd.datastructure.queue.ILinkedBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;

/**
 * . QueueLinked
 *
 * @author EL-hamd
 *
 */
public class Queue_LinkedList implements IQueue, ILinkedBased {
	/**.
	 * . Double
	 */
	private Double_Linked_List l = new Double_Linked_List();

	@Override
	public final void enqueue(final Object item) {
		// TODO Auto-generated method stub
		l.add(item);
	}

	@Override
	public final Object dequeue() {
		// TODO Auto-generated method stub
		if (l.isEmpty()) {
			throw new UnsupportedOperationException("Error");
		}
		Object o = new Object();
		o = l.get(0);
		l.remove(0);
		return o;
	}

	@Override
	public final boolean isEmpty() {
		// TODO Auto-generated method stub
		if (l.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public final int size() {
		// TODO Auto-generated method stub
		return l.size();
	}

}

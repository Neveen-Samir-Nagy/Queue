package eg.edu.alexu.csd.datastructure.queue.cs31_cs60;

import eg.edu.alexu.csd.datastructure.queue.IArrayBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;

/**.
 * . QueueArray
 *
 * @author EL-hamd
 *
 */
public class Queue_Array implements IQueue, IArrayBased {

	/**.
	 * . int
	 */
	private int NumOfelement = 0;
	/**.
	 * . int
	 */
	private int size = 0;
	/**.
	 * . int
	 */
	private int size1 = 0;
	/**.
	 * . int
	 */
	private int count = 0;
	/**.
	 * . array
	 */
	private Object[] array;

	/**.
	 * . get element
	 *
	 * @param n
	 *            first
	 */
	public Queue_Array(final int n) {
		// TODO Auto-generated method stub
		this.array = new Object[n];
		this.NumOfelement = n;

	}

	@Override
	public final void enqueue(final Object item) {
		// TODO Auto-generated method stub
		if (count == NumOfelement) {
			throw new UnsupportedOperationException("Error");
		} else {
			array[size] = item;
			if (size == NumOfelement - 1) {
				size = 0;
			} else {
				size++;
			}
			count++;
		}
	}

	@Override
	public final Object dequeue() {
		// TODO Auto-generated method stub
		if (count == 0) {
			throw new UnsupportedOperationException("Error");
		} else {
			Object c = array[size1];
			array[size1] = null;
			if (size1 == NumOfelement - 1) {
				size1 = 0;
			} else {
				size1++;
			}
			count--;
			return c;
		}
	}

	@Override
	public final boolean isEmpty() {
		// TODO Auto-generated method stub
		if (count == 0) {
			return true;
		}
		return false;
	}

	@Override
	public final int size() {
		// TODO Auto-generated method stub
		return count;
	}

}

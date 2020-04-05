package eg.edu.alexu.csd.datastructure.queue.cs31_cs60;

/**
 * . . DNode
 *
 * @author EL-hamd
 *
 */
public class DNode {
	/**.
	 * 
	 */
	private Object element;
	/**
	 * . . DNode
	 */
	private DNode next, prev;

	/**
	 * . . Node
	 *
	 * @param newElement
	 *            first
	 * @param newNext
	 *            second
	 * @param newPrev
	 *            third
	 */
	public DNode
	(final Object newElement,
			final DNode newNext, final DNode newPrev) {
		this.element = newElement;
		this.next = newNext;
		this.prev = newPrev;
	}

	/**
	 * . . Node
	 *
	 * @return Object
	 */
	public Object getElement() {
		return element;
	}

	/**
	 * . . DNode
	 *
	 * @return DNode
	 */
	public DNode getPrev() {
		return prev;
	}

	/**
	 * . . DNode
	 *
	 * @return Node
	 */
	public DNode getNext() {
		return next;
	}

	/**
	 * . . Void
	 *
	 * @param newElement
	 *            first
	 */
	public void setElement(final Object newElement) {
		element = newElement;
	}

	/**
	 * . . Void
	 *
	 * @param newPrev
	 *            first
	 */
	public void setPrev(final DNode newPrev) {
		prev = newPrev;
	}

	/**
	 * . . Void
	 *
	 * @param newNext
	 *            first
	 */
	public void setNext(final DNode newNext) {
		next = newNext;
	}
}

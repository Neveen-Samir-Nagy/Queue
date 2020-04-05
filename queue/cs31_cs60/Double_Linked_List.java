package eg.edu.alexu.csd.datastructure.queue.cs31_cs60;

/**.
 * . Double
 *
 * @author EL-hamd
 *
 */
public class Double_Linked_List {
	/**.
	 * 
	 */
	private DNode head = new DNode(null, null, null);

	/**.
	 * . DNode
	 */
	private DNode tail = new DNode("head", null, head);

	/**.
	 * . int
	 */
	private int size;

	/**.
	 * . Double
	 */
	public Double_Linked_List() {
		size = 0;
		head.setNext(tail);
	}

	/**.
	 * . add
	 *
	 * @param element
	 *            first
	 */
	public void add(final Object element) {
		// TODO Auto-generated method stub
		DNode temp = new DNode(element, null, null);
		if (size == 0) {
			temp.setNext(tail);
			temp.setPrev(head);
			temp.setElement(element);
			head.setNext(temp);
			tail.setPrev(temp);
		} else {
			temp.setPrev(tail.getPrev());
			temp.setNext(tail);
			DNode curr = tail.getPrev();
			tail.setPrev(temp);
			curr.setNext(temp);
		}
		size++;
	}

	/**.
	 * . get
	 *
	 * @param index
	 *            first
	 * @return Object
	 */
	public Object get(final int index) {
		DNode curr = head.getNext();
		if (index < 0 || index >= size) {
			throw new UnsupportedOperationException("Empty!");
		}
		return curr.getElement();
	}

	/**.
	 * . Empty
	 *
	 * @return Boolean
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (head.getNext() == null || size == 0) {
			return true;
		}
		return false;
	}

	/**.
	 * . Remove
	 *
	 * @param index
	 *            first
	 */
	public void remove(final int index) {
		// TODO Auto-generated method stub
		if (index >= size || size == 0 || index < 0) {
			throw new UnsupportedOperationException("Error");
		}
		DNode curr = head.getNext();
		if (index == 0 && size == 1) {
			head.setNext(tail);
			tail.setPrev(head);
			curr.setNext(null);
			curr.setPrev(null);
		} else if (index == 0) {

			head.setNext(curr.getNext());
			(curr.getNext()).setPrev(head);
			curr.setNext(null);
			curr.setPrev(null);
		}
		size--;

	}

	/**.
	 * . int
	 *
	 * @return int
	 */
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
}

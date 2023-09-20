import java.util.*;
import java.util.LinkedList;

public class MyLinkedList<E> implements List<E> {
	
	private int size = 0;
	private Node<E> headNode;
	private Node<E> first;
	private Node<E> last;
	
	public MyLinkedList() {
		
	}
	
	public String toString()
	{
		if (size == 0)
			return "[]";

		Node<E> current = first;
		String result = "[" + current.getData();
		current = current.next;
		while (current != null) 
		{
			result += ", " + current.getData();
			current = current.next;
		}

		result += "]";
		return result;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean contains(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator<E> iterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object[] toArray() {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean add(E e) {
		Node<E> newNode = new Node<E>(e);
		if(first == null)
		{
			first = newNode;
			last = first;
		}
		else
		{
			last.setNext(newNode);
			last = newNode;
		}
		
		size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		
		if(first == null || o == null)
			return false;
		
		//If item is the first one
		if(o.equals(first.getData()))
		{
			first = first.getNext();
			if(first == null)
				last = null;
			size--;
			return true;
		}
		boolean found = false;
		Node<E> prev = first;
		Node<E> current = prev.getNext();
		
		while(!found && current != null)
		{
			if(o.equals(current.getData()))
				found = true;
			else
			{
				prev = current;
				current.setNext(current.getNext());
			}
		}
		if(!found)
			return found;
		prev.getNext().setNext(current.getNext());
		
		if(current == last)
			last = prev;
		size--;
		
		return found;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public E get(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public E set(int index, E element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void add(int index, E element) {
		
		int position = 0;
		Node<E> prev = null, current = first;
		Node<E> newNode = new Node<E>(element);
		
		for(position = 0; position < index; position++)
		{
			prev = current;
			current = current.getNext();
		}
		
		newNode.setNext(current);
		
		//if first node
		if(current == first)
			first = newNode;
		else
			prev.setNext(newNode);
		
		size++;
	}

	@Override
	public E remove(int index) {
		
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("The index specified " + index + " is out of bounds!");
		
		int position = 0;
		Node<E> prev = null, current = first;
		
		for(position = 0; position < index; position++)
		{
			prev = current;
			current = current.getNext();
		}
		
		E data = current.getData();
		
		//if first node
		if(current == first)
			first = current.getNext();
		else
			prev.setNext(current.getNext());
		size--;
		
		return data;
	}

	@Override
	public int indexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<E> listIterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}
	
	 private class Node<K>
	 {

	       private Node<K> next;
	       private K data;

	       public Node(K dataValue, Node<K> nextValue) {
	           next = nextValue;
	           data = dataValue;
	       }

	       public K getData() {
	           return data;
	       }

	       public void setData(K dataValue) {
	           data = dataValue;
	       }

	       public Node(K dataValue) {
	           next = null;
	           data = dataValue;
	       }

	       public Node<K> getNext() {
	           return next;
	       }

	       public void setNext(Node<K> nextValue) {
	           next = nextValue;
	       }
	   }
}



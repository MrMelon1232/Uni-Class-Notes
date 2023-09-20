import java.util.*;

public class MyArrayList<E> implements List<E> {
	
	private static final int DEFAULT_CAPACITY = 10;
	private int size;
	private  Object[] elementData;
	private static final Object[] EMPTY_ELEMENTDATA = {};
	
	public MyArrayList()
	{
		this.elementData = new Object[DEFAULT_CAPACITY];
	}
	
	public MyArrayList(int initialCapacity)
	{
		if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                                               initialCapacity);
        }
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
	    sb.append('[');
	    for (int i = 0;i < size; i++) {
	    	sb.append(elementData[i]);
	    	if(i != size - 1)
	    		sb.append(", ");
	    }
	    return sb.append(']').toString();
	}
	
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
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
	public boolean add(E e) 
	{
		//Double size of array if reached maximum length
		if(size == elementData.length)
		{
			int updatedCapacity = elementData.length * 2;
			elementData = Arrays.copyOf(elementData, updatedCapacity);
		}
		elementData[size++] = e;
		
		if((elementData.length / 4) > size)
		{
			int updatedCapacity = elementData.length / 2;
			elementData = Arrays.copyOf(elementData, updatedCapacity);
		}
		return true;
	}

	@Override
	public boolean remove(Object o) {
		boolean status = false;
		if(size == 0 || o == null)
			return status;
		
		for(int i = 0; i < size; i++)
		{
			if(o.equals(elementData[i]))
			{
				//Shift to the left
				for(int j = i; j < size; j++)
				{
					elementData[i] = elementData[i + 1];
				}
				status = true;
				size--;
				
			}
		}
		return status;
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
		for(int i = size - 1; i >= 0; i--)
		{
			elementData[i] = null;
		}
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
		
		//Double size of array if reached maximum length
		if(size == elementData.length)
		{
			int updatedCapacity = elementData.length * 2;
			elementData = Arrays.copyOf(elementData, updatedCapacity);
		}
		
		if(elementData[index] != null)
		{
			for(int i = size - 1; i >= index; i--)
			{
				elementData[i + 1] = elementData[i]; 
			}
		}
		elementData[index] = element;
		size++;
		
		if((elementData.length / 4) > size)
		{
			int updatedCapacity = elementData.length / 2;
			elementData = Arrays.copyOf(elementData, updatedCapacity);
		}
	}

	@Override
	public E remove(int index) {
		if(index >= size || index < 0)
			throw new IndexOutOfBoundsException("Index " + index + " exceeds the array size or is below 0!");
		E removedElement = (E) elementData[index];
	
		if(index + 1 != size)
		{
			//Shift data to left
			for(int i = index; i < size - 1; i++)
			{
				elementData[i] = elementData[i + 1];
			}
		}
		size--;

		return removedElement;
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

}

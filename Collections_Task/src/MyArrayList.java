
import java.util.*;
public class MyArrayList<E>{
    private static final int DEFAULT_INITIAL_CAPACITY = 5;
    private static final Object[] EMPTY_ELEMENT_DATA = {};
    private int size;
    private transient Object[] customArrayListElementData;
    
    public MyArrayList(int initialCapacity)
    {
      super();
         if (initialCapacity < 0)
             throw new IllegalArgumentException("Illegal Capacity: "+
                                                initialCapacity);
         this.customArrayListElementData = new Object[initialCapacity];
    }
    
    public MyArrayList(){
       super();
          this.customArrayListElementData = EMPTY_ELEMENT_DATA;
    }
 
    public int size()
    {
     return size;
    }

 public boolean add(E e) {
   ensureCapacity(size + 1);  
   customArrayListElementData[size++] = e;
   return true;
 }


 public E get(int index) {
    if (index >= size){
     throw new ArrayIndexOutOfBoundsException("array index out of bound exception with index at"+index);
    }
  return (E)customArrayListElementData[index];
 }
 

 public void add(int index, E element) {
  ensureCapacity(size + 1); 
        System.arraycopy(customArrayListElementData, index, customArrayListElementData, index + 1,size - index);
        customArrayListElementData[index] = element;
        size++;
  
 }

 public E remove(int index) {
  E oldValue = (E)customArrayListElementData[index];

        int removeNumber = size - index - 1;
        if (removeNumber > 0){
            System.arraycopy(customArrayListElementData, index+1, customArrayListElementData, index,removeNumber);
        }
        customArrayListElementData[--size] = null; 
        return oldValue;
 }
 private void print()
 {
	 for(Object i: customArrayListElementData)
	 {
		 if(i==null)
			 break;
		 System.out.print(i+" ");
	 }
	 System.out.println();
 }

  
    private void growCustomArrayList(int minCapacity) {
        int oldCapacity = customArrayListElementData.length;
        int newCapacity = oldCapacity + (oldCapacity /2);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        customArrayListElementData = Arrays.copyOf(customArrayListElementData, newCapacity);
    }

    private void ensureCapacity(int minCapacity)
    {
        if (customArrayListElementData == EMPTY_ELEMENT_DATA) 
            minCapacity = Math.max(DEFAULT_INITIAL_CAPACITY, minCapacity);

        if (minCapacity - customArrayListElementData.length > 0)
            growCustomArrayList(minCapacity);
    }

 public static void main(String[] args) {
  MyArrayList<Integer> al= new MyArrayList<>(10);
  al.add(1);
  al.add(2);
  al.add(3);
  al.add(4);
  System.out.println("after adding elements size ="+al.size());
  al.print();
  al.remove(4);
  System.out.println("after removing element size ="+al.size());
  al.print();
 }
}
/*Output:
 after adding elements size =4
1 2 3 4 
after removing element size =3
1 2 3 */
 

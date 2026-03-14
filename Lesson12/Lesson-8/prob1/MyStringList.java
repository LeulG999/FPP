package homework.prob1;
import java.util.ArrayList;
import java.util.Arrays;
public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	// Add an element in last
	public void add(String s) {
		 if(s==null) return;// throw new NullPointerException();
		 //Check for Array is Full
		 if (size == strArray.length)
			resize(); // Array is full
		// Add at the end of the list.
		strArray[size] = s;
		size++; // Increment index to insert the new elements
		// strArray[size++] = s;
	}

	public String get(int i) {
		if (i < 0 || i > size - 1) {
			// throw new IndexOutOfBoundsException("Invalid index i" + i);
			return null;
		}
		return strArray[i];
	}

	public boolean find(String s) {
		if (s == null)
			return false;
		for (int i = 0; i < size; i++)// for (String test: strArray)
		{
			if (s.equals(strArray[i]))
				return true;

		}
		return false; // The element is not in the list
	}
	/*
	Method 1: public int indexOf(String s);
	 */
	public int indexOf(String s){
		if(s==null)return -1;
		for(int i=0;i<size;i++){
			if(s.equals(strArray[i])){
				return i;
			}
		}
		return -1;
	}
/*Method 2: public String removeAt(int index);
 */
	public String removeAt(int index){
		if(index<0 || index>=size)return null;
		String rem=strArray[index];
		for(int i=index;i<size-1;i++){
			strArray[i]=strArray[i+1];
		}
		size--;
		return rem;
	}
	/*
	Method 3: public void clear()
	 */
		public void clear(){
		int x=size;
		for(int i=0;i<x;i++){
			strArray[i]=null;
			size--;
		}
	}
	/* Method 4: public void set(int index, String s);
	 */
	public String set(int index, String s){
		if(index<0 || index>=size)return null;
		String oldValue=strArray[index];
		strArray[index]=s;
		return oldValue;
		}
	/*Method 5: public boolean containsAll(MyStringList other);
			- Return false if even one element is missing.
	 */
	public boolean containsAll(MyStringList other){
		for(int i=0;i< other.size();i++){
			boolean match=false;
			for(int j=0;j<size;j++){
				if(strArray[j].equals(other.strArray[i])){
					match=true;
					break;
				}
			}
			if(!match){
				return false;
			}
		}
		return true;
	}
	/*Method 6: public MyStringList subList(int start, int end);
	 */
	public MyStringList subList(int start,int end){
		MyStringList sublist=new MyStringList();
		if(start<0 || end>size || start>=end )return sublist;
		int count=0;
		for(int i=start;i<end;i++){
			sublist.strArray[count++]=strArray[i];
			sublist.size++;
		}
		return sublist;
	}
	public void insert(String s, int pos) {
		if (pos < 0 || pos > size)
			return;
		// If the array gets full
		if (size == strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length];

		for (int i = 0; i < pos; i++)
			temp[i] = strArray[i];
		temp[pos] = s;

		for (int i = pos + 1; i < size; i++)
			temp[i] = strArray[i - 1];

		strArray = temp;
		++size;
	}

	public boolean remove(String s) {
		if (size == 0)
			return false; // the list is empty
		if (s == null)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false; // s is not found in the list
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index + 1, temp, index,
				strArray.length - (index + 1));
		strArray = temp;
		--size;
		return true;
	}

	private void resize() {
		System.out.println("resizing");
		int len = strArray.length;// Original array length
		int newlen = 2 * len; // Twice the original length
		// String[] temp = new String[newlen];
		// System.arraycopy(strArray,0,temp,0,len);
		// strArray = temp;
		strArray = Arrays.copyOf(strArray, newlen);

	}

	public String toString() {
		if(size==0){
			return "[]";
		}
		StringBuilder sb = new StringBuilder("[");
			for (int i = 0; i < size - 1; ++i) {
				sb.append(strArray[i] + ", ");
			}
			sb.append(strArray[size - 1] + "]");
			return sb.toString();

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		/*
		 * if(size==0) return false; else return true;
		 */
		return (size == 0);
	}
	
	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.insert("Renuka", 4); // Position reached the length
		l.insert("Mohanraj", 5); // Position reached the length
		System.out.println(l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
		System.out.println(l.find("Susan"));
		// String[] x = (String[]) l.clone();
		// System.out.println(Arrays.toString(x));
		//System.out.println(indexOf());
		l.add("Susan");
		System.out.println(l);
		System.out.println(l.indexOf("Susan"));
		System.out.println(l.removeAt(2));
		System.out.println(l);
		//l.clear();
		System.out.println(l);
		System.out.println(l.size);
		l.set(5,"Leul");
		System.out.println(l);
		l.set(3,"Getaneh");
		System.out.println(l);

		MyStringList l2=new MyStringList();
		l2.add("Tonya");
		l2.add("Steve");
		l2.add("Renuka");
		l2.add("Getaneh");
		l2.add("Moharanj");
		l2.add("Leul");
		l2.add("Susan");
		System.out.println(l2);
		System.out.println(l2);
		System.out.println(l.containsAll(l2));

		System.out.println(l.subList(2,6));
	}
}

package lab8_2;

import java.util.Iterator;

interface Containers {
	 public Iterator getIterator();
	} 

class NameRepository implements Containers {
		 String[] names = {"John","May","Ryan","MOOK"};

		 public Iterator getIterator() {
			 
			 return new Iterator() {
				 int index = 0 ;
				 
				 public boolean hasNext() {
					 if(index < names.length)
						 return true ;
					 return false;
			 }
				 public Object next() {
					 return names[index++];
				 }
				 public void remove() {

				 }
			 };
		 }
		
	}


public class main {
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 NameRepository namesRepository = new NameRepository();
		 for (Iterator iter = namesRepository.getIterator(); iter.hasNext();){
		 String name = (String) iter.next();
		 System.out.println("Name : " + name);
		}
	} 
}




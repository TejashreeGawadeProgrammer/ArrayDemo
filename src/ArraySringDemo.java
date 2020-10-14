import java.util.*; 

//class ArraySringDemo 
//{ 
//
//static void sort(String []s, int n) 
//{ 
//	for (int i=1 ;i<n; i++) 
//	{ 
//		String temp = s[i]; 
//
//		// Insert s[j] at its correct position 
//		int j = i - 1; 
//		while (j >= 0 && compare(s[i], s[j])) 
//		{ 
//			s[j+1] = s[j]; 
//			j--; 
//		} 
//		s[j+1] = temp; 
//	} 
//} 
//
//static Boolean compare(String current, String next) {
//	return current.length() < next.length();
//}
//
//// Function to print the sorted array of string 
//static void printArraystring(String str[], int n) 
//{ 
//	for (int i=0; i<n; i++) 
//		System.out.print(str[i]+" "); 
//} 

// Driver function 
//public static void main(String args[]) 
//{ 
//	String []arr = {"acknowledgement", "are", "beautiful", "looking"};
//	
//	int n = arr.length;
//	// Function to perform sorting 
//	sort(arr,n); 
//	// Calling the function to print result 
//	printArraystring(arr, n); 
//	
//} 
//} 



class CustomArrayList {
	String []internalArray;
	
	void init (String[] element) {
		internalArray = element;
	}
	
	void sort() {
		for (int i=0 ;i < internalArray.length; i++) 
		{ 
			int j = 0; 
			
			while (j < internalArray.length-1 ) 
			{ 
				if(compare(internalArray[j], internalArray[j+1])) {
					// swap elements
					String temp = internalArray[j];
					internalArray[j] = internalArray[j + 1];
					internalArray[j + 1 ] = temp;
				}
				
				j++;
			} 
		} 
	}
	
	void print() {
		for (int i=0; i<internalArray.length; i++) 
			System.out.print(internalArray[i]+" "); 
	}
	
	Boolean compare(String current, String next) {
		return current.length() < next.length();
	}
}
//
//interface comparator {
//	Boolean compare(String current, String next);
//}
//
//class StringComparator implements comparator {
//	public Boolean compare(String current, String next) {
//		return current.length() < next.length();
//	}
//}

class ArrayStringDemo {
	public static void main(String args[]) 
	{ 
		String []arr = {"us","acknowledgement", "are", "beautiful", "looking", "u"};
		
		CustomArrayList arrayList = new CustomArrayList();
		arrayList.init(arr);
		
		arrayList.sort();
		
		arrayList.print();
		
	}
}




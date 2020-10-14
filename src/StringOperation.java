class StringArrayLength{
String []internalArray;
	
	void init (String[] element) {
		internalArray = element;
	}

	void print() {
		for (int i=0; i<internalArray.length; i++) 
			System.out.print(internalArray[i]+" ");
			System.out.println("\n");
	}
	
	Boolean compare(String current, String next) {
		return current.length() < next.length();
	}
}

class StringLength extends StringArrayLength
{
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
}
class StringVowels extends StringArrayLength
{
	
	int i;
		public int vowels(String[] element)
		{
			System.out.println(element.length);
			
			int totalcount=0;
			for(i = 0; i <element.length; i++){ 
				String temp = element[i];
				System.out.print("Temp is:"+temp +" :");
				
				for(int j =0; j < temp.length(); j++){ 
					if(temp.charAt(j) == 'a' ||temp.charAt(j) == 'e' || 
						temp.charAt(j) == 'i' || temp.charAt(j) == 'o' || 
						temp.charAt(j) == 'u')
						{
							totalcount++;
						}
					
				}
				System.out.println(totalcount);
				totalcount=0;
		}
			return totalcount;
	
	}
		
}
class StringOperation {
	
	public static void main(String args[]) 
	{ 
		String []arr = {"us","acknowledgement", "are", "beautiful", "looking", "u"};
		
		StringLength arrayList = new StringLength();
		arrayList.init(arr);
		arrayList.sort();
		arrayList.print();
		
		StringVowels sVowels =new StringVowels();
		sVowels.init(arr);
		sVowels.print();
		sVowels.vowels(arr);
		
	}

}

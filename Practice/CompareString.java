/*
--Differences between == and equals() method to compare String.

--toString() uses a method to compute the value and it is not from the string pool.

--equals() looks at the values of String objects

*/

class CompareString{
	
		public static void main(String[] args){
			String countryA = "Denmark";
			String countryB = "Denmark";
			
			System.out.println(countryA == countryB);	// prints true
			System.out.println(countryA.equals(countryB)); // prints true

//String literals are used from the string pool. This means that countryA and countryB refer to the
//same object and are equal

			
			StringBuilder newCountryName = new StringBuilder();	
			newCountryName.append("Den").append("mark");
			//System.out.println(newCountryName);

String newCountry = (String)newCountryName.toString();

			System.out.println(newCountryName.toString() == countryA);  //The
//third print statement prints false because toString() uses a method to compute the
//value and it is not from the string pool.


			System.out.println(newCountryName.toString().equals(countryA)); //The final print statement again prints true
//because equals() looks at the values of String objects.


System.out.println(newCountry == countryA);  // prints false. same as 3rd print. No difference.
			
				
			
		}
	
}
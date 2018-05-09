package com.Apex.Assignment1;
//Define a String builder and append all alphabets and display the final string.
public class StringBuilder {
	static char a;
	
	private void append(char a1){
		
	}

	public static void main(String[] args) {

		StringBuilder charecters=new StringBuilder();
		 for(char a='A'; a<='z'; ++a )
	        {
	        	System.out.println(a + " ");
	        }
		 charecters.append(a);
		 System.out.println(charecters);

	}

}

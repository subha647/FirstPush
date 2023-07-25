package test1;

public class Resvstr {
	public static void main (String[] args) {
	       
        String str= "Geeks", str2="";
        char ch;
       
      System.out.println("Original word: "+str);
      
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        str2= ch+str2; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ str2);
    }

}

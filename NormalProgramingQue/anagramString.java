package NormalProgramingQue;

import java.util.Arrays;
 
public class anagramString {
     public static boolean isAnagram(String s1, String s2) {
      String str =s1.replaceAll("\\s", "");
     String str1 =s1.replaceAll("\\s", "");
      if(str.length()!= str1.length()) {
    	  return false;
      }
      else {
    	   char c1[]= str.toLowerCase().toCharArray();
    	   char c2[]= str1.toLowerCase().toCharArray();
    	   
    	   Arrays.sort(c1);
    	   Arrays.sort(c2);
    	   
    	   return Arrays.equals( c1, c2);
      }
     }
     
     
	public static void main(String[] args) {
		System.out.println(isAnagram("Listen", "silent"));
		System.out.println(isAnagram("Listen", "silent"));
		System.out.println(isAnagram("Bimlesh", "gfgefh"));

	}

}

import java.lang.reflect.Method;

class Solution {

	// Generics is just using the highest up baseclass that has the essential methods you need.
	// Object is the superclass for all superclasses.
    public static void printArray(Object[] array) {
        for (int i=0;i<array.length;i++) {
            System.out.println(""+array[i]);
        }
    }

	public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}

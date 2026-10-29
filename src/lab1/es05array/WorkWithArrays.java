package lab1.es05array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WorkWithArrays {

    /*
    * ADVICE:
    * If your method implements an algorithm, it doesn't necessarly need to contain
    * the whole code! You can decomopose your problem into simpler (non-trivial) ones,
    * writing a *private* utility method for each sub problem.
    * Moreover, if your utility method solves a common sub-problem, it may be
    * re-used by other methods within the same class.
    */


    public static int countOccurrencies(final int[] array, final int elem) {
        int c=0;
        for(int el: array) {
        	if(el==elem) 
        		c++;
        }
        return c;
    }

    public static int[] evenElements(final int[] array) {
        
        int[] evens = new int[array.length%2==0 ? array.length/2 : array.length/2+1];
        
        for(int i=0,j=0; i < array.length; i++) {
        	if(i%2==0) {
        		evens[j]=array[i];
        		j++;
        	}
        }
        return evens;
    }

    public static int[] oddElements(final int[] array) {
    	int[] odds = new int[array.length/2];
    	
    	for(int i=0,j=0; i < array.length; i++) {
        	if(i%2!=0) {
        		odds[j]=array[i];
        		j++;
        	}
        }
        return odds;
    }

    public static int mostRecurringElement(final int[] array) {
    	int num=array[0];
        for(int i=0,rec=0,c=0; i<array.length;i++) {
        	for(int j=0;j<array.length;j++) {
        		if(array[j]==array[i]) {
        			c++;
        		}
        	}
        	if(c>rec) {
        		rec=c;
        		c=0;
        		num=array[i];
        	}
        }
        return num;
    }

    public static int[] revertUpTo(int[] a, int n){
        for(int i=0;i<a.length;i++) {
        	if(a[i]==n) {
        		
        		for(int j=0,temp=0,tail=i;j<tail/2;j++,i--) {
        			temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        		break;
        	}
        }
        return a;
    }

    /*
     * Testing methods
     */

    /* Utility method for testing revertUpTo method */
    public static boolean testRevertUpTo() {
        return Arrays.equals(
                    revertUpTo(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5),
                    new int[] { 5, 4, 3, 2, 1, 6, 7, 8, 9, 10 })
                && Arrays.equals(
                    revertUpTo(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 3),
                    new int[] { 3, 2, 1, 4, 5, 6, 7, 8, 9, 10 })
                && Arrays.equals(
                    revertUpTo(new int[] { 1, 2, 3 }, 3),
                    new int[] { 3, 2, 1 });
    }

    public static boolean testCountOccurrencies() {
        return countOccurrencies(new int[] { 1, 2, 3, 4 }, 1) == 1
                && countOccurrencies(new int[] { 0, 2, 3, 4 }, 1) == 0
                && countOccurrencies(new int[] { 7, 4, 1, 9, 3, 1, 5 }, 2) == 0
                && countOccurrencies(new int[] { 1, 2, 1, 3, 4, 1 }, 1) == 3
                && countOccurrencies(new int[] { 4, 9, 1, 1, 3, 5, 1, 16, 5, 81, 1, 0, 3, 1}, 1) == 5;
    }

    public static boolean testEvenElements() {
        return Arrays.equals(evenElements(new int[] { 1, 2, 3, 4 }), new int[] { 1, 3 })
                && Arrays.equals(
                        evenElements(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
                        new int[] { 1, 3, 5, 7, 9 })
                && Arrays.equals(
                        evenElements(new int[] { 4, 6, 7, 9, 1, 5, 23, 11, 73 }),
                        new int[] { 4, 7, 1, 23, 73 })
                && Arrays.equals(
                        evenElements(new int[] { 7, 5, 1, 24, 12, 46, 23, 11, 54, 81 }),
                        new int[] { 7, 1, 12, 23, 54 });
    }

    public static boolean testOddElements() {
        return Arrays.equals(oddElements(new int[] { 1, 2, 3, 4 }),
                new int[] { 2, 4 })
                && Arrays.equals(
                        oddElements(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
                        new int[] { 2, 4, 6, 8 })
                && Arrays.equals(
                        oddElements(new int[] { 4, 6, 7, 9, 1, 5, 23, 11, 73 }),
                        new int[] { 6, 9, 5, 11 })
                && Arrays.equals(
                        oddElements(new int[] { 7, 5, 1, 24, 12, 46, 23, 11, 54, 81 }),
                        new int[] { 5, 24, 46, 11, 81 });
    }

    public static boolean testMostRecurringElement() {
        return mostRecurringElement(new int[] { 1, 2, 1, 3, 4 }) == 1
                && mostRecurringElement(new int[] { 7, 1, 5, 7, 7, 9 }) == 7
                && mostRecurringElement(new int[] { 1, 2, 3, 1, 2, 3, 3 }) == 3
                && mostRecurringElement(new int[] { 5, 11, 2, 11, 7, 11 }) == 11;
    }

    public static void main(final String[] args) {
        System.out.println("testCountOccurrencies: " + testCountOccurrencies());
        System.out.println("testREVERT: " + testRevertUpTo());
        System.out.println("testEvenElems: " + testEvenElements());
        System.out.println("testOddElems: " + testOddElements());
        System.out.println("testGetMostRecurringElem: " + testMostRecurringElement());
    }
}

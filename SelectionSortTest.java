package lab10;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class SelectionSortTest {
	   @Test
	    public void test() {
	        testPositive();
	        testNegative();
	        testMixed();
	        testDuplicates();
	    }
	    
	    public void testPositive() {
	        int[] arr = {8, 9, 7, 10, 2};
	        int[] sortedArr = {2, 7, 8, 9, 10};
	        SelectionSort selectionSort = new SelectionSort();
	        assertArrayEquals(sortedArr, selectionSort.basicSelectionSort(arr));
	    }
	    
	    public void testNegative() {
	        int[] arr = {-8, -9, -7, -10, -2};
	        int[] sortedArr = {-10, -9, -8, -7, -2};
	        SelectionSort selectionSort = new SelectionSort();
	        assertArrayEquals(sortedArr, selectionSort.basicSelectionSort(arr));
	    }
	    
	    public void testMixed() {
	        int[] arr = {-8, 9, 0, -10, 2};
	        int[] sortedArr = {-10, -8, 0, 2, 9};
	        SelectionSort selectionSort = new SelectionSort();
	        assertArrayEquals(sortedArr, selectionSort.basicSelectionSort(arr));
	    }
	    
	    public void testDuplicates() {
	        int[] arr = {8, 9, 7, 10, 2, 7, 8};
	        int[] sortedArr = {2, 7, 7, 8, 8, 9, 10};
	        SelectionSort selectionSort = new SelectionSort();
	        assertArrayEquals(sortedArr, selectionSort.basicSelectionSort(arr));
	    }
	}
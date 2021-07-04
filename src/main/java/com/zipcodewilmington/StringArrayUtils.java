package com.zipcodewilmington;

import org.apache.commons.lang3.*;
import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.tools.javac.util.ArrayUtils;
import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils<coun> {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        int index = 0;
        String currentIndex = array[index];
        return currentIndex;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        int secondIndex = 1;
        String secondCurrentElement = array[secondIndex];
        return secondCurrentElement;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int index = 0;
        int arrayLength = array.length;
        String finalElement = array[arrayLength - 1];
        return finalElement;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int lengthOfArray = array.length;
        String secondToLast = array[lengthOfArray - 2];
        return secondToLast;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String currentElement : array) {
            if (currentElement == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Collections.addAll(arrayList, array);
        Collections.reverse(arrayList);
        String[] arrayReversed = arrayList.toArray(new String[0]);
        return arrayReversed;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Collections.addAll(arrayList, array);
        Collections.reverse(arrayList);
        String[] arrayReversed = arrayList.toArray(new String[0]);
        if (Arrays.equals(array, arrayReversed)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String arrayIsString = Arrays.toString(array);
        arrayIsString = arrayIsString.toLowerCase();
        int counter = 0;
        for (char letters = 'a'; letters == 'z'; letters++) {
            if (StringUtils.contains(arrayIsString, letters)) {
                counter += 1;
            }

            }
        if (counter == 26) {
            return true;
        } else {
            return false;
    }



        /*       String alpha = "abcdefghijklmnopqrstuvwxyz";
        int index;
        int counter = 0;
        char currentChar = ' ';
        String arrayIsString = Arrays.toString(array);
        arrayIsString = arrayIsString.toLowerCase();
        for (int i = 0; i < arrayIsString.length(); i++) {
            currentChar = arrayIsString.charAt(i);
            for (index = 0; index < alpha.length(); index++) ;
            {
                char currentAlpha = alpha.charAt(index);
                if (currentChar == currentAlpha) {
                    counter += 1;

                }else {
                    continue;
                }
            }
        }
        if (counter == 26) {
            return true;
        } else {
            return false;
        }
    }
*/
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;

    }

}

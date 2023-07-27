package com.rakuten.StudentApp.Practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longRepeateJava {



        // Method 1 - getWords()
        // Reading out words from the file and
        // mapping key value pair corresponding to
        // each different word
        static void getWords(String fileName,
                             Map<String, Integer> words)
                throws FileNotFoundException
        {
            // Creating a Scanner class object
            Scanner file = new Scanner(new File(fileName));

            // Condition check using hasNext() method which
            // holds true till there is word being read from the
            // file.
            // As the end of file content,condition violates
            while (file.hasNext()) {

                // Reading word using next() method
                String word = file.next();

                // Frequency count variable
                Integer count = words.get(word);

                // If the same word is repeating
                if (count != null) {

                    // Incrementing corresponding count by unity
                    // every time it repeats
                    // while reading from the file
                    count++;
                }
                else

                    // If word never occurred after occurring
                    // once, set count as unity
                    count = 1;
                words.put(word, count);
            }

            // Close the file and free up the resources
            file.close();
        }

        // Method 2 - getMaxOccurrence()
        // To get maximum occurred Word
        static int getMaxOccurrence(Map<String, Integer> words)
        {
            // Initially set maximum count as unity
            int max = 1;

            // Iterating over above Map using for-each loop
            for (Map.Entry<String, Integer> word :
                    words.entrySet()) {

                // Condition check
                // Update current max value with the value
                // exceeding unity in Map while traversing
                if (word.getValue() > max) {
                    max = word.getValue();
                }
            }

            // Return the maximum value from the Map
            return max;
        }

        // Method 3
        // Main driver method
        public static void main(String[] args)
                throws FileNotFoundException
        {
            // Creating an object of type Map
            // Declaring object of String and Integer types
            Map<String, Integer> words
                    = new HashMap<String, Integer>();

            // Retrieving the path as parameter to Method1()
            // above to get the file to be read
            getWords("abc123.text", words);

            // Variable holding the maximum
            // repeated word count in a file
            int max = getMaxOccurrence(words);

            // Traversing using for each loop
            // Creating a set out of same elements
            // contained in a HashMap
            for (Map.Entry<String, Integer> word :
                    words.entrySet()) {

                // Comparing values using geValue() method
                if (word.getValue() == max) {

                    // Print and display word-count pair
                    System.out.println(word);
                }
            }
        }

    }

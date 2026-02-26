import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'beautifulPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY A
     *  2. INTEGER_ARRAY B
     */

    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : A) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        int match = 0;
        
        for (int num : B) {
            if (freq.getOrDefault(num, 0) > 0) {
                match++;
                freq.put(num, freq.get(num) - 1);
            }
        }
        
        if (match == A.size()) {
            return match - 1;
        } else {
            return match + 1;
        }
    }
}


package Hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ACMTEAM {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
    	
    	int[] ans = new int[2];
    	
    	Map<Integer,Integer> map = new HashMap<>();
    	int max=0;
    	String maxBinary = "";
    	for(int i=0;i<topic.length;i++) {
    		for(int j=i+1;j<topic.length;j++) {
    			int binaryC = getCount(topic[i],topic[j]);
    			if(binaryC >= max) {
    				max = binaryC;
        			map.put(max, map.getOrDefault(binaryC, 0)+1);
    			}
    		}
    	}
    	
    	
    	ans[0] = max;
    	ans[1] = map.get(max);
    	
    	return ans;
    	
    }
    
    private static int getCount(String a, String b) {
        int cnt = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1' || b.charAt(i) == '1') 
            	cnt++;
        }        
        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
        	System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.println();
            }
        }

        scanner.close();
    }
}


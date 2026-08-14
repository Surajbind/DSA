// Given two strings s and t, 
// return true if the two strings are anagrams of each other, 
// otherwise return false.

import java.util.HashMap;

public class Array2Anagram
{

    public boolean checkAnagram(String s, String t)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }   

        for(char ch : t.toCharArray())
        {
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        if(map.equals(map2))
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        String s = "racecar";
        String t = "carrace";

        Array2Anagram A2 = new Array2Anagram();
        System.out.println(A2.checkAnagram(s,t));
    }
}
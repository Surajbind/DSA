// Given two strings s and t, 
// return true if the two strings are anagrams of each other, 
// otherwise return false.

import java.util.HashMap;
public class Sep2Array2 {
    public void checkAnagram( String s, String t)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> maps = new HashMap<>();
        for(Character ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Character ch:t.toCharArray())
        {
            maps.put(ch,maps.getOrDefault(ch, 0)+1);
        }
        if(map.equals(maps))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("else");
        }
    }
    public static void main(String[] args) 
    {
        String s = "racecar";
        String t = "carrace";
        
        Sep2Array2 s2 = new Sep2Array2();
        s2.checkAnagram(s,t);
    }
}

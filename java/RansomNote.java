package solutions;

import java.util.HashMap;

/**
 * Created by wei on 2016/09/02.
 *  Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters
 * from  all  the  magazines,  write  a  function  that  will  return  true  if  the  ransom
 *   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.
 * Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> noteMap = new HashMap<>();
        HashMap<Character, Integer> magMap = new HashMap<>();
        for (char c : ransomNote.toCharArray())
            addCharToMap(c, noteMap);
        for (char c : magazine.toCharArray())
            addCharToMap(c, magMap);
        for (char c : noteMap.keySet())
            if (!magMap.containsKey(c) || magMap.get(c) < noteMap.get(c))
                return false;
        return true;
    }

    /**
     * add character count to map
     *
     * @param c
     * @param map
     */
    private void addCharToMap(char c, HashMap<Character, Integer> map) {
        if (!map.containsKey(c))
            map.put(c, 1);
        else {
            int value = map.get(c) + 1;
            map.put(c, value);
        }
    }
}

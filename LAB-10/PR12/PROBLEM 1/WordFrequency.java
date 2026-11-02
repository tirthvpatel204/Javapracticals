import java.util.*;
public class WordFrequency{
    public static void main(String[] args){
        String text="java is easy java is useful java";
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:text.split(" ")){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        List<String> words=new ArrayList<>(map.keySet());
        words.sort((a,b)->map.get(b)-map.get(a));
        for(String word:words)
            System.out.println(word+" : "+map.get(word));
    }
}
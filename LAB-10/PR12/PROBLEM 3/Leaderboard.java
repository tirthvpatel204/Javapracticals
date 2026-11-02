import java.util.*;
public class Leaderboard{
    public static void main(String[] args){
        Map<String,Integer> scores=new HashMap<>();
        scores.put("Tirth",90);
        scores.put("Rahul",85);
        scores.put("Amit",95);
        scores.put("Neha",90);
        List<String> players=new ArrayList<>(scores.keySet());
        players.sort((a,b)->{
            int result=scores.get(b)-scores.get(a);
            return result==0?a.compareTo(b):result;
        });
        for(int i=0;i<3;i++)
            System.out.println(players.get(i)+" : "+scores.get(players.get(i)));
    }
}
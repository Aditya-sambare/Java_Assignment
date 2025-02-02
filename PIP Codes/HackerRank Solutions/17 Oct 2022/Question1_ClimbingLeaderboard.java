/*
Question Link :
https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 */
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

class Result1 {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        int rank = 0;
        ranked =ranked.stream().distinct().collect(toList());

        List<Integer> list = new ArrayList<>();
        System.out.println(ranked);
        System.out.println(player);
        for (int i = 0; i < player.size(); i++) {
            for (int j = 0; j < ranked.size(); j++) {
                int player1 = player.get(i);
                int ranked1 = ranked.get(j);
                rank = 1;
                if(player1<ranked1){
                    rank++;
                    continue;
                }
            }
            System.out.println(rank);
            list.add(rank);
        }
        return list;
//        Collections.reverse(player);
//        List<Integer> rankedList =ranked.stream().distinct().collect(toList());
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < player.size(); i++) {
//            for (int j = 0; j < rankedList.size(); j++) {
//                int player1 = player.get(i);
//                int ranked1 = rankedList.get(j);
//                if(player1>ranked1 || player1==ranked1){
//                    list.add(j+1);
//                    break;
//                }
//            }
//        }
//        int player2 = player.get(player.size()-1);
//        int ranked2 = rankedList.get(rankedList.size()-1);
//        if(player2 < ranked2){
//            list.add(rankedList.size()+1);
//        }
//        Collections.reverse(list);
//        return list;
    }
}
public class Question1_ClimbingLeaderboard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result1.climbingLeaderboard(ranked, player);
        System.out.println(result);

        //bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
       // bufferedWriter.close();


    }
}





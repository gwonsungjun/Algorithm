package kakao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static String[] solution(String[] record) {

        String[] answer = {};
        String[] name = {};
        String[] uid = {};

        for (int i = 0; i < record.length; i++) {
            String selectOne = record[i];
            String[] selectOneArray = selectOne.split(" ");
            String action = selectOneArray[0];
            Map<String, String> resultMap = new HashMap<>();

            if (action.equals("Enter")) {
                for(int j =0; j < uid.length; j++){
                    if(uid[j].equals(selectOneArray[1])){

                    }
                }
                uid[i] = selectOneArray[1];
                name[i] = selectOneArray[2];
                resultMap.put(selectOneArray[1], selectOneArray[2] + "님이 들어왔습니다.");
            } else if (action.equals("Leave")) {
              //  resultString = Arrays.stream(uid).filter(s -> s.equals(selectOneArray[2])).findFirst().toString() +"님이 들어왔습니다.";
              //  answer[i] = resultString;
            } else {
                //resultString = Arrays.stream(uid).filter(s -> s.equals(selectOneArray[2])).findFirst().toString() +"님이 들어왔습니다.";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // [Prodo님이 들어왔습니다., Ryan님이 들어왔습니다., Prodo님이 나갔습니다., Prodo님이 들어왔습니다.]
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        Arrays.stream(solution(record)).forEach(System.out::print);
    }
}
package pers.helen.primary;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 1604. 警告一小时内使用相同员工卡大于等于三次的人（https://leetcode
 * .cn/problems/alert-using-same-key-card-three-or-more-times-in-a-one-hour-period/）
 * 力扣公司的员工都使用员工卡来开办公室的门。每当一个员工使用一次他的员工卡，安保系统会记录下员工的名字和使用时间。如果一个员工在一小时时间内使用员工卡的次数大于等于三次，这个系统会自动发布一个 警告 。
 * <p>
 * 给你字符串数组 keyName 和 keyTime ，其中 [keyName[i], keyTime[i]] 对应一个人的名字和他在 某一天 内使用员工卡的时间。
 * <p>
 * 使用时间的格式是 24小时制 ，形如 "HH:MM" ，比方说 "23:51" 和 "09:49" 。
 * <p>
 * 请你返回去重后的收到系统警告的员工名字，将它们按 字典序升序 排序后返回。
 * <p>
 * 请注意 "10:00" - "11:00" 视为一个小时时间范围内，而 "23:51" - "00:10" 不被视为一小时内，因为系统记录的是某一天内的使用情况。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：keyName = ["daniel","daniel","daniel","luis","luis","luis","luis"], keyTime = ["10:00","10:40","11:00","09:00",
 * "11:00","13:00","15:00"]
 * 输出：["daniel"]
 * 解释："daniel" 在一小时内使用了 3 次员工卡（"10:00"，"10:40"，"11:00"）。
 * 示例 2：
 * <p>
 * 输入：keyName = ["alice","alice","alice","bob","bob","bob","bob"], keyTime = ["12:01","12:00","18:00","21:00",
 * "21:20","21:30","23:00"]
 * 输出：["bob"]
 * 解释："bob" 在一小时内使用了 3 次员工卡（"21:00"，"21:20"，"21:30"）。
 * 示例 3：
 * <p>
 * 输入：keyName = ["john","john","john"], keyTime = ["23:58","23:59","00:01"]
 * 输出：[]
 * 示例 4：
 * <p>
 * 输入：keyName = ["leslie","leslie","leslie","clare","clare","clare","clare"], keyTime = ["13:00","13:20","14:00",
 * "18:00","18:51","19:30","19:49"]
 * 输出：["clare","leslie"]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= keyName.length, keyTime.length <= 105
 * keyName.length == keyTime.length
 * keyTime 格式为 "HH:MM" 。
 * 保证 [keyName[i], keyTime[i]] 形成的二元对 互不相同 。
 * 1 <= keyName[i].length <= 10
 * keyName[i] 只包含小写英文字母。
 */
public class Demo1604 {

    public static void main(String[] args){
        //        String[] keyName = new String[]{"leslie", "leslie", "leslie", "clare", "clare", "clare", "clare"};
        //        String[] keyTime = new String[]{"13:00", "13:20", "14:00", "18:00", "18:51", "19:30", "19:49"};\
        //        String[] keyName = new String[]{"leslie", "leslie", "leslie"};
        //        String[] keyTime = new String[]{"23:58", "23:59", "00:01"};
        //        String[] keyName = new String[]{"a","a","a","a","a","b","b","b","b","b","b"};
        //        String[] keyTime = new String[]{"23:20","11:09","23:30","23:02","15:28","22:57","23:40","03:43",
        //        "21:55","20:38","00:19"};
        String[] keyName = new String[]{"a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "b", "b", "c", "c"
                , "c", "c", "c", "c", "c", "c", "c"};
        String[] keyTime = new String[]{"00:37", "11:24", "14:35", "21:25", "15:48", "20:28", "07:30", "09:26", "10" +
                ":32", "20:10", "19:26", "08:13", "01:08", "15:49", "02:34", "06:48", "04:33", "07:18", "00:05", "06" +
                ":44", "13:33", "04:12", "03:54"};
        List<String> result = alertNames(keyName, keyTime);
        System.out.println(result);
    }

    public static List<String> alertNames1(String[] keyName, String[] keyTime){
        List<String> result = new ArrayList<>();

        List<Set<Integer>> list = new ArrayList<>();
        for(int i = 0; i < keyName.length; i++){

        }

        return result;
    }

    public static List<String> alertNames(String[] keyName, String[] keyTime){
        Map<String, List<Integer>> map = new LinkedHashMap<>();
        List<String> result = new ArrayList<>();
        for(int i = 0; i < keyName.length; i++){
            String name = keyName[i];
            String[] time = keyTime[i].split(":");
            List<Integer> k;
            if(map.containsKey(name)){
                k = map.get(name);
            }else{
                k = new ArrayList<>();
            }
            k.add(Integer.valueOf(time[0]) * 60 + Integer.valueOf(time[1]));
            map.put(name, k);
        }
        for(Map.Entry<String, List<Integer>> m : map.entrySet()){
            List<Integer> longList = m.getValue();
            longList.sort(Comparator.naturalOrder());
            for(int i = 0; i < longList.size() - 1; i++){
                int count = 1;
                for(int j = i + 1; j < longList.size(); j++){
                    if(longList.get(j) - longList.get(i) <= 60){
                        count++;
                    }else{
                        break;
                    }
                }
                if(count >= 3){
                    result.add(m.getKey());
                    break;
                }
            }
        }
        result.sort(Comparator.naturalOrder());
        return result;
    }
}

package pers.helen.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 1233. 删除子文件夹（https://leetcode.cn/problems/remove-sub-folders-from-the-filesystem/）
 */
public class Demo1233 {

    public static void main(String[] args){
        //        String[] folder = new String[]{"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        String[] folder = new String[]{"/a", "/a/b/c", "/a/b/d"};
        List<String> list = removeSubfolders(folder);
    }

    public static List<String> removeSubfolders(String[] folder){
        List<String> result = new ArrayList<>();
        List<String> list = Arrays.asList(folder);
        list.sort(Comparator.naturalOrder());
        int jump = 0;
        for(int i = 0; i < list.size(); ){
            if(i == list.size() - 1){
                result.add(list.get(i));
                break;
            }
            result.add(list.get(i));

            for(int j = i + 1; j < list.size(); j++){
                if(!list.get(j).startsWith(list.get(i) + "/")){
                    jump = j;
                    break;
                }
                jump = j + 1;
            }
            i = jump;

        }
        return result;
    }
}

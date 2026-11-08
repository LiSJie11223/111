package StimulateAndEnum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exam_3 {
    public static void main(String[] args) throws IOException {
        // 使用 BufferedReader 提高读取长字符串的效率
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tStr = br.readLine();
        if (tStr == null) return;
        
        int t = Integer.parseInt(tStr.trim());
        
        // 目标英文单词数组，按单词长度降序或直接匹配皆可
        String[] words = {"zero", "two", "four", "six", "nine"};
        char[] digits = {'0', '2', '4', '6', '9'};
        
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            if (s == null) break;
            
            StringBuilder sb = new StringBuilder();
            int len = s.length();
            
            // 遍历字符串
            for (int j = 0; j < len; ) {
                boolean matched = false;
                
                // 尝试匹配英文单词
                for (int k = 0; k < words.length; k++) {
                    String word = words[k];
                    if (s.startsWith(word, j)) {
                        sb.append(digits[k]);
                        j += word.length(); // 跳过匹配到的整个单词长度
                        matched = true;
                        break;
                    }
                }
                
                // 如果没有匹配到英文单词，检查当前字符是否为数字
                if (!matched) {
                    char c = s.charAt(j);
                    if (c == '0' || c == '2' || c == '4' || c == '6' || c == '9') {
                        sb.append(c);
                    }
                    j++; // 匹配到数字或普通字符，指针向后移动一位
                }
            }
            
            // 输出当前测试用例的结果
            System.out.println(sb.toString());
        }
    }
}

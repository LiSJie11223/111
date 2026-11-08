package StimulateAndEnum;

import java.util.Scanner;

public class Exam_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 存储0-9每个数字出现的次数
        long[] count = new long[10];
        long totalDigits = 0;
        
        // 读取输入
        for (int i = 0; i < 10; i++) {
            if (sc.hasNextLong()) {
                count[i] = sc.nextLong();
                totalDigits += count[i];
            } else {
                return;
            }
        }
        
        // 如果没有任何数码，直接无解
        if (totalDigits == 0) {
            System.out.println(-1);
            return;
        }
        
        long[] half = new long[10];
        int oddCount = 0;
        int oddDigit = -1;
        
        // 统计每个数码的一半，以及出现奇数次的数码
        for (int i = 0; i < 10; i++) {
            half[i] = count[i] / 2;
            if (count[i] % 2 != 0) {
                oddCount++;
                oddDigit = i;
            }
        }
        
        // 回文数最多只能有一个数码出现奇数次（放在最中间）
        if (oddCount > 1) {
            System.out.println(-1);
            return;
        }
        
        int firstDigit = -1;
        // 寻找可以作为前半部分开头的非零数码（保证没有前导0）
        for (int i = 1; i < 10; i++) {
            if (half[i] > 0) {
                firstDigit = i;
                half[i]--;
                break;
            }
        }
        
        // 如果找不到非零数码作为开头
        if (firstDigit == -1) {
            // 如果0还有成对的，那么必定会构成前导0（如"00", "010"），不合法
            if (half[0] > 0) {
                System.out.println(-1);
                return;
            }
            // 如果没有成对的数码，只可能是单个数字
            if (oddCount == 0) {
                System.out.println(-1);
                return;
            } else {
                // 只有单个数字（如 "0", "5" 等）
                System.out.println(oddDigit);
                return;
            }
        }
        
        // 构造前半部分
        StringBuilder leftPart = new StringBuilder();
        leftPart.append(firstDigit);
        
        for (int i = 0; i < 10; i++) {
            if (half[i] > 0) {
                for (long j = 0; j < half[i]; j++) {
                    leftPart.append(i);
                }
            }
        }
        
        // 构造右半部分（前半部分翻转）
        StringBuilder rightPart = new StringBuilder(leftPart).reverse();
        
        // 拼接最终答案
        StringBuilder ans = new StringBuilder(leftPart);
        if (oddCount == 1) {
            ans.append(oddDigit); // 如果有单独的奇数个数的数码，放在中间
        }
        ans.append(rightPart);
        
        // 输出结果
        System.out.println(ans.toString());
    }
}
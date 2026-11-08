package StackAndQueueAndSTL;

import java.util.Scanner;

public class Exam_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String s = sc.next();
        
        int balance = 0; // 记录 a 和 b 的数量差
        boolean isGood = true;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                balance++;
            } else if (c == 'b') {
                balance--;
                // 如果某个前缀中 b 的数量超过 a，则非法
                if (balance < 0) {
                    isGood = false;
                    break;
                }
            } else {
                // 出现了非 a 和 b 的其他字符，直接非法
                isGood = false;
                break;
            }
        }
        
        // 如果最终 a 和 b 的数量不相等，也非法
        if (balance != 0) {
            isGood = false;
        }
        
        if (isGood) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }
}
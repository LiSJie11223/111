package StackAndQueueAndSTL;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        // 把数字当作字符串存起来
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.next();
        }
        
        // 自定义排序规则
        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));
        
        // 拼接结果
        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            sb.append(num);
        }
        
        // 输出结果
        System.out.println(sb.toString());
        
        sc.close();
    }
}
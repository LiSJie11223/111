package StimulateAndEnum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exam_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().trim().split("\\s+");
        if (line1.length < 2) return;
        
        // n 在此题中可以忽略，因为 StringBuilder 会自动处理长度，t 表示最大四舍五入次数
        int n = Integer.parseInt(line1[0]);
        long t = Long.parseLong(line1[1]);
        String str = br.readLine().trim();

        StringBuilder sb = new StringBuilder(str);
        int dotPos = sb.indexOf(".");

        if (dotPos != -1) {
            // 1. 找到小数点后第一个 >= '5' 的位置
            int pos = -1;
            for (int i = dotPos + 1; i < sb.length(); i++) {
                if (sb.charAt(i) >= '5') {
                    pos = i;
                    break;
                }
            }

            // 2. 开始贪心进位
            if (pos != -1) {
                while (t > 0 && pos > dotPos) {
                    // 如果当前位置小于 '5' 说明不需要进位了，退出循环
                    if (sb.charAt(pos) < '5') break;

                    t--; // 消耗一次机会
                    sb.setLength(pos); // 截断当前位置及之后的所有数字

                    pos--; // 向前看一位准备进位
                    if (sb.charAt(pos) == '.') {
                        pos--; // 如果遇到小数点，跨过去直接对整数部分进位
                    }

                    // 模拟加法进位（处理连续的 '9'）
                    boolean carry = true;
                    while (pos >= 0 && carry) {
                        char c = sb.charAt(pos);
                        if (c == '9') {
                            sb.setCharAt(pos, '0');
                            pos--;
                            if (pos >= 0 && sb.charAt(pos) == '.') {
                                pos--;
                            }
                        } else {
                            sb.setCharAt(pos, (char) (c + 1));
                            carry = false;
                        }
                    }

                    // 如果一直进位到了最前面（如 9.99 -> 10.0）
                    if (carry) {
                        sb.insert(0, '1');
                        break; // 最高位前面不可能再有可以四舍五入的数了，直接跳出
                    }
                }
            }

            // 3. 处理末尾的 0 和可能多余的小数点
            int lastDot = sb.lastIndexOf(".");
            if (lastDot != -1) {
                int end = sb.length() - 1;
                while (end > lastDot && sb.charAt(end) == '0') {
                    end--;
                }
                if (end == lastDot) {
                    end--; // 如果小数部分全去掉了，小数点也一并去掉
                }
                sb.setLength(end + 1);
            }
        }

        System.out.println(sb.toString());
    }
}
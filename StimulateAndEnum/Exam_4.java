package StimulateAndEnum;

import java.io.*;

public class Exam_4 {
    public static void main(String[] args) throws IOException {
        // 使用 BufferedReader 逐字符读取输入，保证不漏掉任何空格和换行
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder inputBuilder = new StringBuilder();
        int charRead;
        while ((charRead = br.read()) != -1) {
            inputBuilder.append((char) charRead);
        }
        String str = inputBuilder.toString();

        StringBuilder sb = new StringBuilder();
        boolean inString = false;
        boolean inComment = false;
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);

            if (inComment) {
                // 在注释中，寻找结束符 */
                if (c == '*' && i + 1 < len && str.charAt(i + 1) == '/') {
                    inComment = false;
                    i++; // 跳过 '/'
                }
            } else if (inString) {
                // 在字符串中，处理转义引号
                if (c == '\\' && i + 1 < len && str.charAt(i + 1) == '"') {
                    sb.append('\\').append('"');
                    i++; // 跳过 '"'
                } else if (c == '"') {
                    // 普通引号，字符串结束
                    inString = false;
                    sb.append('"');
                } else {
                    // 字符串内的其他字符（包括 /* 和 */）直接保留
                    sb.append(c);
                }
            } else {
                // 在正常代码中
                if (c == '/' && i + 1 < len && str.charAt(i + 1) == '*') {
                    // 遇到注释开始
                    inComment = true;
                    i++; // 跳过 '*'
                } else if (c == '"') {
                    // 遇到字符串开始
                    inString = true;
                    sb.append('"');
                } else {
                    // 正常字符
                    sb.append(c);
                }
            }
        }

        // 使用 PrintWriter 进行快速输出
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        out.print(sb.toString());
        out.flush();
    }
}

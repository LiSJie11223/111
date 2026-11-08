package Function;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exam_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()) {
			int y=sc.nextInt(),m=sc.nextInt();
			int x=sc.nextInt();
			sc.nextLine();
			LocalDate l=LocalDate.of(y,m,1);
	//		根据年份判断闰年
			boolean isLeap=l.isLeapYear();
			int total_day=0;
			switch(m) {
			case 4:case 6:case 9:case 11:total_day=30;break;
			case 2:total_day=isLeap?29:28;break;
			default:total_day=31;
			}
			int cnt=0;
			for(int i=1;i<=total_day;i++) {
				LocalDate L=LocalDate.of(y,m,i);
				String s=L.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				for(int j=0;j<s.length();j++)
					if(s.charAt(j)-'0'==x) cnt++;
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}

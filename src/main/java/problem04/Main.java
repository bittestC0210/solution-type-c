package problem04;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// 구구단 출력
		Random ran = new Random();		
		int dan[] = new int[18];
		int su[] = new int[18];
		int count = 0;
		
		for(int i=1; i<10; i++)
		{
			int num1 = ran.nextInt(9) + 1;
			System.out.println(i + "x" + num1 + "=" + i*num1);
			dan[count] = i;
			su[count] = num1;
			count ++;
			
			int num2 = ran.nextInt(9) + 1;
			System.out.println(i + "x" + num2 + "=" + i*num2);
			dan[count] = i;
			su[count] = num2;
			count ++;
		}
		System.out.println("");
		
		// 구구단 랜덤 출력, 시간 계산
		int game_count = 1;
		for(int i=0; i<18; i++)
		{
			long start = System.currentTimeMillis();
			
			int gugudan_num = ran.nextInt(18);
			System.out.println(game_count + "." + dan[gugudan_num] + "x" + su[gugudan_num] + "=" + dan[gugudan_num]*su[gugudan_num] + " ?");
			
			long end = System.currentTimeMillis();
			long time = end - start;
			System.out.println(time);
			
			game_count ++;
		}
		
		// 게임시간, 성공횟수, 실패횟수
		long game_time = 0;
		int s_count = 0, f_count = 0;
		
	}
}
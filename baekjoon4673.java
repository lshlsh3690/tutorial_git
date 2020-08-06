import java.util.*;

public class Main{
	
	public static void self_number(int n)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> self_number = new ArrayList<>();
		
		for(int i = 1, sum=0; i< n; i++)
		{
			sum = i + ((i%10000)/1000) + ((i%1000)/100) + ((i%100)/10) + ((i%10)/1);	//셀프 넘버 공식 n과 n의 각자리 숫자를 더한 값
			if(!arr.contains(sum))
			{//arr에 더한 값이 있지 않으면 넣는다.
				arr.add(sum);
			}
			if(!arr.contains(i) && !self_number.contains(i))
			{
				self_number.add(i);
			}
		}
		for(int i = 0;i<self_number.size();i++)
			System.out.println(self_number.get(i));
		
	}
	
	public static void main(String []args) {
			 self_number(10000);
	}
}
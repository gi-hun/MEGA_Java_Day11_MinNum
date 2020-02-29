package day_11;

import java.util.Scanner;
import java.util.Random;

public class ArrayEx16_정답 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		int i=0;
		while(i<4)
		{
			int r = ran.nextInt(4);
			
			if(check[r] ==0 )
			{
				check[r] = 1;
				arr[i] = r+1;
				i++;
			}
		}
		
		int count = 1;
		
		int j=0;
		while(j<4)
		{
			for(int k=0;k<4;k++)
			{
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			
			System.out.print("입력");
			int data = sc.nextInt();
			
			if(arr[data]==count)
			{
				arr[data] = 9;
				count++;
				j++;
			}
		}
	}
}

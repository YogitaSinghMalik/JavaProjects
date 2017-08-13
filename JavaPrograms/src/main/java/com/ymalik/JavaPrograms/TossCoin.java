package com.ymalik.JavaPrograms;

public class TossCoin {
	public static void main (String[] arg)
	{
		//Math.random returns value between 0.0 to 1.0, if value < 0.5 -> Head else Tail
		if (Math.random()< 0.5) 
		{
			System.out.println("Its Head!!");
		}
		else
		{
		    System.out.println("Its TAIL!!");
		}
	}

}

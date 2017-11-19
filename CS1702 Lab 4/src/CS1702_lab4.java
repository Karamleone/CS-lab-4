import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class CS1702_lab4 {
	static public void main(String args[]) throws Exception
	{
		maintask();
		Finch(); 
	}
	static public void maintask()
	{
		/*double value3_4 = 6; 
		
		if (value3_4 >= 0) {
			if ((value3_4 % 3) == 0) {
				if ((value3_4 % 2) == 0) { 
					System.out.println("output - correct1"); 
				}					
			}
			else 
				System.out.println(value3_4 + " does not satisfy any conditions - incorrect2");
		}
		
		if (value3_4 >= 0) {
			if ((value3_4 % 7) == 0) {
				System.out.println("output - correct3"); 	
			}else if ((value3_4 % 9) == 0){ 
				System.out.println("output - correct4"); 
			}
			else 
				System.out.println(value3_4 + " does not satisfy any conditions incorrect5");
		}
		
		if (value3_4 >= 0) {
			if ((value3_4 % 5) != 0) {
				if ((value3_4 % 3) == 0) {
					if ((value3_4 % 2) == 0) { 
						System.out.println("output - correct6"); 
					}					
				}
			}
			else 
				System.out.println(value3_4 + " does not satisfy any conditions incorrect7");
		}
		*/
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		//4.3 conditions and loops
		//put task 3.4 into a for loop for values from 1-100
		System.out.println("Task 4.3");
		double value3_4 = 0;
		int limit = 100;
		
		for (value3_4 = 0; value3_4 <limit;value3_4++);
		{
			if (value3_4 >= 0) {
				if ((value3_4 % 3) == 0) {
					if ((value3_4 % 2) == 0) { 
						System.out.println("output - correct1"); 
					}					
				}
				else 
					System.out.println(value3_4 + " does not satisfy any conditions - incorrect2");
			}
		}
		
		for (value3_4 = 0; value3_4 <limit;value3_4++);	
		{
			if (value3_4 >= 0) {
				if ((value3_4 % 7) == 0) {
					System.out.println("output - correct3"); 	
				}else if ((value3_4 % 9) == 0){ 
					System.out.println("output - correct4"); 
				}
				else 
					System.out.println(value3_4 + " does not satisfy any conditions incorrect5");
			}
		}
		for (value3_4 = 0; value3_4 <limit;value3_4++);
		{	
			if (value3_4 >= 0) {
				if ((value3_4 % 5) != 0) {
					if ((value3_4 % 3) == 0) {
						if ((value3_4 % 2) == 0) { 
							System.out.println("output - correct6"); 
						}					
					}
				}
				else 
					System.out.println(value3_4 + " does not satisfy any conditions incorrect7");
			}
		}
		
		//int x = 0;
		
		//if (x < 10){
		//	for(x=0;x<10;++x)
		//	{
		//	   System.out.println("x in loop = "+x);
		//	}
		//	System.out.println(x); 
		//}
		
		
		//int limit = 100; 
		
		//for (x=1; x < limit; x++){
		//	if(x%2 ==0 ){
		//		System.out.println(x+"test");
		//	}
		//}
		
		//q1
		System.out.println();
		System.out.println("q1");
		int i;

		for(i=4;i<12;++i)
		{
			System.out.println(i);
		}
		
		//q2
		System.out.println("q2");
		for(i=10;i<19;i = i+3)
		{
			System.out.println(i);
		}
		
		System.out.println("q3");
		for(i=1;i<16;i = i+3)
		{
			System.out.println(i);
		}
		System.out.println("q4");
		for(i=2;i<12;i = i+2)
		{
			System.out.println(i);
		}
		
		System.out.println("q5");
		for(i=1;i<11;i = i+1)
		{
			System.out.println(i*i);
					
		}
		
		System.out.println("q6");
		for(i=-10;i<11;i = i+2)
		{
			System.out.println(i);
					
		}
		System.out.println("q7");
		for(i=-20;i<21;i = i+5)
		{
			System.out.println(i);
					
		}
		///////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("4.5 Generating Patterns Using For Loops");
		System.out.println("q1");
		for(i=0;i<10;++i)
		{
			System.out.print("+");
		}
		
		
		System.out.println("");
		System.out.println("q2");
		for(i=0;i<9;++i)
		{
			System.out.print("-");
		}
		
		
		System.out.println("");
		System.out.println("q3");
		for(i=0;i<5;++i)
		{
			System.out.print("+"+ "-");
		}
		
		
		System.out.println("");
		System.out.println("q4");
		for(i=0;i<3;++i)
		{
			System.out.print("*"+ "+" +"-");
		}
		
		
		System.out.println("");
		System.out.println("q5");						
		for(i=0;i<3;++i)
		{
			System.out.print("*"+ "+" +"-");
			if (i == 2){
				System.out.println("*");
			}
			
		}
		
		
		
		System.out.println("q6");
		for(i=0;i<3;++i)
		{
			System.out.print("**"+ "++");
		}
		
		
		System.out.println("");
		System.out.println("q7");
		for(i=0;i<2;++i)
		{
			System.out.print("***"+ "+++"+"---");
		}
		
		
		System.out.println("");
		System.out.println("q8");
		for(i=0;i<1;++i)
		{
			System.out.print("***"+ "+++" + "---");
			if (i == 0){
				System.out.println("---" + "+++" + "***");
			}
		}
		
		
		System.out.println("While loops - HCF");
		int A = 26;
		int B = 88;
		
		while (B > 0)
		{ 
			int C = A%B; // takes A mod B
			A = B;  //lowers value to B 
			B = C;
		}
		System.out.println("HCF =" + A);
		
		
		System.out.println();
		System.out.println("4.7 - Nested loops");
		int j,k;
		
		System.out.println("Q1");
		for(j=1;j<6;++j)
		{
			for(k=1;k<j+1;++k)
			{
				System.out.print(j);
			}
		}
		
		System.out.println();
		System.out.println("Q2");
		for(j=2;j<7;++j)
		{
			for(k=1;k<j+1;++k)
			{
				System.out.print(j);
			}
		}

		System.out.println();
		System.out.println("Q3");
		for(j=1;j<6;j= j+2)
		{
			for(k=1;k<j+1;++k)
			{
				System.out.print(j);
			}
		}
		
		System.out.println();
		System.out.println("Q4");
		for(j=1;j<8;j= j+2)
		{
			for(k=1;k<j+1;k=k+2)
			{
				System.out.print(j);
			}
		}
		
		System.out.println();
		System.out.println("Q5");
		for(j=5;j>0;j=j-1)
		{
			for(k=1;k<j+1;k++)
			{
				System.out.print(j);
			}
		}
		
		System.out.println();
		System.out.println("Q6");
		for(j=5;j>0;j=j-1)
		{
			for(k=j;k<6;k++)
			{
				System.out.print(j);
			}
		}
		
		
		System.out.println();
		System.out.println("Q7");
		for(j=1;j<6;++j)
		{
			for(k=1;k<j+1;++k)
			{
				if (j%2  == 0) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print("+");
				}
			}
		}
		
		System.out.println();
		System.out.println("Q8");
		for(j=2;j<8;++j)
		{
			for(k=1;k<j+1;k=k+1)
			{
				if ((j == 3) || (j == 6)) 
				{
					System.out.print("*");
				}
				else if ((j == 2 ) || (j == 5))
				{
					System.out.print("-");
				}
				else 
				{
					System.out.print("+");
				}
			}
		}
		 
		System.out.println("pt2");
		System.out.println("Q1");
		for (j=1; j <11; j++)
		{
			for (k=1; k <= 10;  k++)
				System.out.println(j + " "+ k );
		}
		
		System.out.println("pt2");
		System.out.println("Q2");
		for (j=1; j <11; j++)
		{
			for (k=j + 1; k < 11; k++)
				System.out.println(j + " "+ k );
		}
		
		System.out.println("pt2");
		System.out.println("Q3");
		for (j=1; j <5; j++)
		{
			for (k=4; k <= 8;  k++)
				System.out.println(j + " "+ k );
		}
		
		System.out.println("4.8 - using loops with finch");
		
}
public static void Finch() throws Exception
	

	{
		
		Finch myf = new Finch();
		
		myf.setWheelVelocities(100,100);
		long before = System.currentTimeMillis();
		while(System.currentTimeMillis() - before < 5000)
		{
				Thread.sleep(500);
				if (myf.isObstacle()) break;
		}
		myf.stopWheels();
		myf.quit();
	
		/*
		
		First changing the wheel velocities from (100,100) to (100,100,5000) seemed to have stopped the finch from breaking 
		from the loop for the time specified. This probably will hold all operations until the time added has passed.
		 
		*/
		
	}
}


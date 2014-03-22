import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//public static void popraw_R()
//{
//	int[] HR = new int [N];
//	int cnt=0;
//	for(int n=0; n<N; n++)
//	{
//		HR[n]=0;
//		for(int m=0; m<M+N; m++)
//		HR[n] += H[n][m]*R[m];
//		HR[n]%=2;
//		if(HR[n]!=0)cnt++;
//	}
//
//	if( cnt == 0 )return;
//	
//	for( int m=0; m<M; m++ )
//	{
//		int n=0;
//		while( HR[n] == H[n][m])
//		{
//			n++;
//		}
//		if( n == N )
//		{
//			R[m] = (R[m]+1)%2;
//		return;
//		}
//	}
//	
//}

public class Driver {
	
	static int M=8;
	static int N=4;

	//static int[][] H = new int [N][M+N];
	static int [][]H={{0,1,1,1,0,1,1,1,1,0,0,0},
	                  {1,1,0,1,1,1,0,1,0,1,0,0},
	                  {1,0,1,1,1,0,1,1,0,0,1,0},
	                  {0,0,0,0,1,1,1,1,0,0,0,1}};
	
	static int[] T = new int [M+N];
	static int[] R = new int [M+N];
	
	public static void oblicz_T(int value)
	{
		for( int m=0;m<M;m++)
		{
			T[m] = (value >> (M-m-1)) & 1;
		}
	}
	
	
	public static void oblicz_R(int value, int bp)//bp bit parzystości 
	{
		for( int m=0;m<M;m++)
		{
			R[m] = (value >> (M-m-1)) & 1;
		}

		for( int n=0; n<N; n++)
		{
			R[M+n]= (bp >> (M-n-1)) & 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      // System.out.println(Arrays.deepToString(H));
        
        File file =new File("zdanie.txt");
        Scanner in=null;
    try {
        in = new Scanner(file);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
    }
        //String s;
        //char s;
        //s=in.nextLine();
	}

}

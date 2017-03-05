/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestcommonsubsequence;

/**
 *
 * @author sinan
 */
public class LongestCommonSubsequence
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
	String x = "XYZCZFSAFAX";
	String y = "FDSAFASFSA";
	int M = x.length();
	int N = y.length();

	int[][] opt = new int[M + 1][N + 1];

	for (int i = 1; i <= M; i++)
	{
	    for (int j = 1; j <= N; j++)
	    {
		if (x.charAt(i - 1) == y.charAt(j - 1))
		{
		    opt[i][j] = opt[i - 1][j - 1] + 1;
		}
		else
		{
		    opt[i][j] = Math.max(opt[i][j - 1], opt[i - 1][j]);
		}
	    }
	}

	System.out.println(opt[M][N]);
    }

}


public class z223RectangleArea
{
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) 
	{
		int blx = Math.max(A, E);  
        int bly = Math.max(B, F);  
        int rtx = Math.min(C, G);  
        int rty = Math.min(D, H);  
        int res = (C-A) * (D-B) + (G-E) * (H-F);  
        if(blx >= rtx || bly >= rty) return res;  
        return res - (rtx - blx) * (rty - bly); 
    }

	public static void main(String[] args)
	{
		
		int s = computeArea(-2,-2,2,2,-1,-1,1,1);
		System.out.println(s);

	}

}

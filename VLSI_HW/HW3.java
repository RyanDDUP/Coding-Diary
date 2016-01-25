package VLSI_HW;

public class HW3{

	public static void main(String[] args) {
		double y=Math.log(256)/Math.log(2)*(2*2*(1-Math.pow(2, Math.log(256)/Math.log(2)+1)))/(1-2);
	for (double u =2.001; u<=6; u+=0.001) {
		
			double N=Math.log(256)/Math.log(u);

			double z=N*(u*u*(1-Math.pow(u, N+1)))/(1-u);
			if (z<y) {
				y=z;
				System.out.println("Decreasing");
			}else {
				System.out.println("Increasing!");	
				System.out.println(y+"-->"+u);			
				break;
			}
			}		
		}		
}
package ex2_QA_winter_group_b.ex2_QA_winter_group_b;

public class WeakClass {
	
	public static int weakMethod1(int a,int b) {
		int c = a / b;
		if(c>0) {
			return 1;
			
		}
		else {
			return -1;
			
		}
		
		
		
	}
	public static int weakMethod2(int a,int b) {
		
		if(b == 0 && a!=0) {
			return -1;
			
		}
		else {
			return 1;
		}
		
		
		
		
	}
	public static int weakMethod3(int a,int b) {
		
		
		        if (a >= 0 && b >= 0) {
		            return a / b; 
		        } else if (b < 0) {
		            return a/b;
		        } else {  
		            return 0;
		        }
		    }
	
	public static int weakMethod4(int a,int b) {
		 if (a > 0) { 
	            if (b == 0) {
	                     
	                return a / b;
	            } else {
	                return 1;
	            }
	        } else { 
	            return -1;
	        }
	  

	
	

	}
}

	

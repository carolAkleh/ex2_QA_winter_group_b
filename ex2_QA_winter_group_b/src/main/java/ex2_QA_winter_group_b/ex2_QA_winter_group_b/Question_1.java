package ex2_QA_winter_group_b.ex2_QA_winter_group_b;

public class Question_1 {
	public static String calc_roots(int a,int b ,int c) {
		String output="";
		if((a<5)||(200<a)) {
			output="a not in range";
			return output;
		}
		if((b<5)||(200<b)) {
			output="b not in range";
			return output;
		}
		if((c<5)||(200<c)) {
			output="c not in range";
			return output;
		}
		double determinant=b*b-4*a*c;
		if(a==0) {
			output="no quadratic equation";
			return output;
		}
		
		
		if(determinant<0) {
			output ="no roots";
			return output;
			
		} else if (determinant==0) {
			output="one root roots";
			return output;
			
		}
		else {
			output="tow roorts";
			return output;
			
		}
		
		
		
		
	}

}

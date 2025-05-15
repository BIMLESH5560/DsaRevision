package NormalProgramingQue;

    public class Fibnacci {
	public static int fibb( int num) {
		if(num==0) {
			return 0;
		}
		else if(num==1) {
			return 1;
		}
		else {
			return (fibb(num-1) + fibb(num-2));
		}
	}
	public static void main(String[] args) {
		 int num=5;
		 System.out.println(num);
		 for(int i=0; i<num; i++) {
			 System.out.println(fibb(i));
			 
			 
		 }
	  }

	}



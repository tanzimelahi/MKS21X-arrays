
public class ArrayDemo {
	public static void printArray(int[]ary) {
		for(int i=0;i<ary.length;i++) {
			System.out.println(ary[i]);
		}
	}//method ends here
	
	public static void printArray(int[][]ary) {
		for(int t=0;t<ary.length;t++) {//looping through the rows
			int[]exp=ary[t];
			for(int i=0;i<exp.length;i++) {//looping through the columns;
				System.out.println(exp[i]);
			}
			System.out.println("end of one row");
		}
	}
	public static void fill2D(int[][]vals) {
		for (int row=0;row<vals.length;row++) {
			int[]exp=vals[row];
			for(int column=0;column<exp.length;column++) {
				if(row==column) {
					exp[column]=3;
				}
				else {
					exp[column]=1;
				}
			}
		}
	}
	public static int countZeroes2D(int[][]nums) {
		int count=0;
		for(int t=0;t<nums.length;t++) {//transverses through the row
		  int[]exp=nums[t];
		  for(int i=0;i<exp.length;i++) {
			if(exp[i]==0) {
				count++;
			}
		  }
		}
		return count;
	}
	public static int[][] fill2DCopy(int[][]vals) {
		int[][]result=new int[vals.length][];
		for (int i=0;i<vals.length;i++) {// initializes the new array with the dimensions of the parameter
			result[i]=new int[vals[i].length];
		}
		for(int r=0;r<vals.length;r++) {
			int[]exp=result[r];
			for(int c=0;c<exp.length;c++) {
				if(vals[r][c]>=0) {
					exp[c]=1;
				}
				else {
					
					exp[c]=3;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
	  int[]single= {1,2,34,4};
	  printArray(single);
	  System.out.println("new");//to differentiate the array
	  int[][]example= {{1,2,3,4,-1},{5,6,-3,-4},{0,0,2,1},{1,23,3,0}};
       printArray(example);
       System.out.println("new");//just to differentite the arrays
	  printArray(fill2DCopy(example));
	  fill2D(example);
	  System.out.println("new");//just to differentiate the arrays
	  printArray(example);//the change reflects that the array example is mutated
	  
	  
       
	}


}


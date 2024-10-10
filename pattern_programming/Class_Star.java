package pattern_programming;
import java.util.Scanner;
public class Class_Star {
	
	
	// output = **************
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		printStar(num);
		
	}
	
	public static void printStar(int n) {
		for(int i=1; i<=n; i++) {
		 System.out.print("* ");
		}
	}*/
	
	
	
	
	/* output = * * * * *
	            * * * * *
	            * * * * *
	            * * * * *
	            * * * * *
	 */
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printStar(n);
	}
	public static void printStar(int n) {
		for(int i =1; i<=n; i++) {
			for(int j =1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}*/
	
	
	
	
	/* output = 1 2 3 4 5
	            1 2 3 4 5
	            1 2 3 4 5
	            1 2 3 4 5
	            1 2 3 4 5
	 */
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		printNumber(n);
	}
	
	
	public static void printNumber(int n) {
		for(int i =1; i<=n; i++) {
			for(int j =1; j<=n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}*/
	
	
	
	
	/*output = 1 1 1 1 1 
	           2 2 2 2 2
	           3 3 3 3 3
	           4 4 4 4 4
	           5 5 5 5 5 
	 */
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printNumber(n);
	}
	
	public static void printNumber(int n) {
		for(int i =1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}*/
	
	
	
	/*output = 1 0 1 0 1
	           1 0 1 0 1
	           1 0 1 0 1
	           1 0 1 0 1
	           1 0 1 0 1 
	 */
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printNumber(n);
	}
	public static void printNumber(int n) {
		for(int i =1; i<=n; i++) {
			for(int j =1; j<=n; j++) {
				System.out.print(j % 2 + " ");
			}
			System.out.println();
		}
	}*/
	
	
	
	
	/*output =1 1 1 1 1
	          0 0 0 0 0
	          1 1 1 1 1
	          0 0 0 0 0
	          1 1 1 1 1
*/
          /* public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
                System.out.println("Enter a Number : ");
                 int n = sc.nextInt();
                printNumber(n);
                 }
           public static void printNumber(int n) {
                   for(int i =1; i<=n; i++) {
	                      for(int j =1; j<=n; j++) {
		                    System.out.print(i % 2 + " ");
	                      }
	           System.out.println();
                        }
                 }*/
	
	
	
	
	
//Q :
/*	*
	* *
	* * *
	* * * *
	* * * * *
	* * * * * *   */
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		rightAngleTraingle(n);
	}
	public static void rightAngleTraingle(int n){
		int star =1;
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			star++;
			System.out.println();
			
			
		}
	}*/
	
	
	//Q :
	
/*	* * * * * *
	* * * * *
	* * * *
	* * *
	* *
	*         */
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printTriangle(n);
	}
	public static void printTriangle(int n) {
		int star = n;
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=star; j++ ) {
				System.out.print("* ");
			}
			star--;
			System.out.println();
		}
	}*/
	
	
	
	
	//Q :
	     /*     *
	          * *
	        * * *
	      * * * *
	    * * * * *    */
	
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printTriangle(n);
	}
public static void printTriangle(int n) {
	int star = 1;
	int space = n-1;
	for(int i =1; i<=n; i++) {
		for(int j=1; j<=space; j++) {
			System.out.print("  ");
		}
		for(int j =1; j<=star; j++) {
			System.out.print("* ");
		}
		star++;
		space--;
		System.out.println();
	}
}*/
	
	
	
	//Q:
/*	* * * * * * *
	  * * * * * *
	    * * * * *
	      * * * *
	        * * *
	          * *
	            *        */
	/*public static void main(String[]  args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printStar(n);
		
	}
	public static void printStar(int n) {
		int star =n;
		int space =0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			star--;
			space++;
			System.out.println();
		}
	}*/
	
	
	
	//Q:
/*	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1         */
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printNumber(n);
	}
	public static void printNumber(int n) {
		int num = n;
		for(int i =1; i<=n; i++) {
			for(int j =1; j<=num; j++) {
				System.out.print(j + " ");
			}
			num--;
			System.out.println();
		}
	}*/
	
	
	
	//Q :
/*	1 1 1 1 1 
	2 2 2 2 
	3 3 3
	4 4 
	5       */
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n= sc.nextInt();
		printNumber(n);
	}
	public static void printNumber(int n) {
		int num = n;
		for(int i =1 ; i<=n; i++) {
			for( int j=1; j<=num; j++){
				System.out.print(i + " ");
			}
			num--;
			System.out.println();
		}
	}*/
	
	
	
	//Q:
/*	1 0 1 0 1
	1 0 1 0
	1 0 1
	1 0
	1           */
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printNumber(n);
		
	}
	public static void printNumber(int n) {
		int num =n;
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=num; j++) {
				System.out.print(j%2 + " ");
			}
			num--;
			System.out.println();
		}
	}   */
	
	
	
	
	//Q :
/*	1 1 1 1 1 
	2 2 2 2 
	3 3 3
	4 4
	5      */
	/*public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printNumber(n);
	}
	public static void printNumber(int n) {
		int num =n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=num; j++) {
				System.out.print(i + " ");
			}
			num--;
			System.out.println();
		}
	}*/
	
	
	
	//Q :
/*	1 1 1 1 1 
	0 0 0 0
	1 1 1
	0 0 
	1      */
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printNumber(n);
	}
	public static void printNumber(int n) {
		int num =n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=num; j++) {
				System.out.print(i%2 + " ");
			}
			num--;
			System.out.println();
		}
	}*/
	
	
	
	//Q :
	      /*       1
	             1 2
	           1 2 3
	         1 2 3 4
	       1 2 3 4 5     */
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printNumber(n);
	}
	
	public static void printNumber(int n) {
		int num =1;
		int space = n-1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=num; j++) {
				System.out.print(j +" ");
			}
			num++;
			space--;
			System.out.println();
		}
		
	    
	}*/
	
	                                       
	                                       
	
	                                    /*         *
	                                             * * *
	//Q :                                      * * * * *
	                                         * * * * * * *     */
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printPyramid(n);
	}
	
	public static void printPyramid(int n) {
		int star =1;
		int space = n-1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			star+=2;
			space--;
			System.out.println();
		}
	
	
	}*/
	
	
	
	//Q :
	                  /*       * * * * * * * * 
	                            * * * * * *
	                              * * * *
	                                * *
	                                 *        */
	
	
	/*public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printReversePyramid(n);
	
	}
	public static void printReversePyramid(int n) {
		int star = 2*n-1;
		int space = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j =1; j<=star; j++) {
				System.out.print("* ");
			}
			star-=2;
			space++;
			System.out.println();
		}
	}*/
	
	
	
	//Q :
	                             
     /*                         
	                *   
                  *   *   
                *   *   *   
              *   *   *   *   
            *   *   *   *   *   
          *   *   *   *   *   *   
        *   *   *   *   *   *   *        */
	
	
	/*public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printSpacePyramid(n);
	}
	public static void printSpacePyramid(int n) {
		int star =1;
		int space = n-1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("*   ");
			}
			star++;
			space--;
			System.out.println();
		}
	}*/
	
	
	
	//Q :
	              /*      *   *   *   *   *   *   *
	                       *   *   *   *   *   *
	                         *   *   *   *   *
	                           *   *   *   *
	                             *   *   *
	                               *   *
	                                 *        */
	
/*	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printReversePyramid(n);
		
	}
	public static void printReversePyramid(int n) 
	{
		int star =n;
		int space = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("*   ");
			}
			star--;
			space++;
			System.out.println();
		}
	}  */   
	
	
	
	
	//Q :
	    /*  
	         *
	         * *
	         * * *
	         * * * * 
	         * * * * *
	         * * * *
	         * * *
	         * *
	         *
	     */
/*	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a NUmber :");
		int n =sc.nextInt();
		printPyramid(n);
	}
	public static void printPyramid(int n) {
		int mid = n/2+1;
		int star = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			if(i<mid) {
				star++;
			}
			else {
				star--;
			}
			System.out.println();
		}
	}*/
	
	
	
	//Q :: Reverse Of Upper Program
	
         /*     public static void main(String[] args) {
	        	Scanner sc = new Scanner(System.in);
	        	System.out.println("Enter a Number : ");
	        	int n = sc.nextInt();
	        	printPyramid(n);
	        }
	public static void printPyramid(int n) {
		int mid = n/2+1;
		int star = 1;
		int space = n/2;
		for(int i=1; i<=n; i++) {
			for(int j =1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			if(i<mid) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			System.out.println();
		}
	}*/
	
	
	
	//Q :Diamond Shape Problem
	/*     public static void main(String[] args) {
	    	 Scanner sc = new Scanner(System.in);
	    	 System.out.println("Enter a Number : ");
	    	 int n= sc.nextInt();
	    	 printDiamond(n);
	     }
	public static void printDiamond(int n) {
		int mid = n/2 +1;
		int star =1;
		int space = n/2;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			if(i<mid) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
			System.out.println();
		}
	}      */
	
	
	
	//Q : Space Diamond Shape Problem
	
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		spaceDiamond(num);
		
	}
	public static void spaceDiamond(int n) {
		int mid = n/2 +1;
		int star =1; int space = n/2;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("*   ");
			}
			
			if(i<mid) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			System.out.println();
		}
	}*/
	
	
	
	
	//Q :    
	  /*        * * * * * * * * *
	            *
	            *
	            *
	            *
	            * * * * * * * * *
	            *
	            *
	            *
	            *
	            * * * * * * * * *      */
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printE(n);
		
	}
	
	public static void printE(int n) {
		int mid =n/2 +1;
		for(int i=1; i<=n; i++ ) {
			for(int j=1; j<=n; j++) {
				if(i==1 || j==1 ||i==mid || i==n)
					System.out.print("* ");
			}
			System.out.println();
		}
	}*/
	
	
	
	
	
	
	//Q :  Print N of a Number :
	
	
/*	*               * 
	* *             * 
	*   *           * 
	*     *         * 
	*       *       * 
	*         *     * 
	*           *   * 
	*             * * 
	*               *    */

	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a Number : ");
		int n = sc.nextInt();
		printN(n);
	}
	
	public static void printN(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==1 || j==n || i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}*/
	
	
	
	//Q : Print reverse of N of a Number.
	
/*	*               * 
	*             * * 
	*           *   * 
	*         *     * 
	*       *       * 
	*     *         * 
	*   *           * 
	* *             * 
	*               *     */
	
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printReverseN(n);
	}
	public static void printReverseN(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==1 || j==n || i+j==n+1) {
				   System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
	}            */
	
	
	
	
	//Q : Draw a Pattern of B
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printB(n);
		
	}
	
	public static void printB(int n) {
		int mid = n/2 + 1;
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==1 || i==1 || i==n || i==mid && j!=n || j==n && i!=mid) 
					System.out.print("* ");
				else
					System.out.print("  ");
					
				
			}
			System.out.println();
		}
	}*/
	
	
	
	
	//Q  : Draw a Pattern of V
	
	/*public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printV(n);
		
	}
	
	public static void printV(int n) {
		int sstar=1;
		int estar=n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=estar; j++) {
				if(j==sstar || j==estar) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			sstar++;
			estar--;
			System.out.println();
		}
	}    */
	
	
	
	
	//Q : Draw and print reverse of V
	
	
	
	//Q : Draw and print the pattern of damru
	
	
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printDamru(n);
	}
	
	
	public static void printDamru(int n) {
		int star = n;
		int space =0;
		int mid = n/2 +1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");				
			}
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
				
			}
			
			if(i<mid) {
				star-=2;
				space++;
			}
			else {
				space--;
				star+=2;
			}
			
			System.out.println();
		}
		 
	}*/
	
	
	
	
	//Q : Draw and print the pattern of Butterfly
	/*public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printButterfly(n);
	}
	public static void printButterfly(int n) {
		int sst = 1;
		int est = n;
		int mid = n/2 +1 ;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j<=sst || j>=est) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			if(i<mid) {
				sst++;
				est--;
			}
			else {
				sst--;
				est++;
			}
			System.out.println();
		}
		
		
	}*/   
	
	
	
	//Q : Daimond Shape Problems with Number :
	
	public static void printDaimond(int n) {
		

	}
	
	
	
	
	
	
	
	
	                 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

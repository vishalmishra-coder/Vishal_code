package vp;

public class Triangle {
     int a;
     int b;
     int c;
     
     public void setValue(int a , int b , int c)
     {
    	 this.a = a;
    	 this.b = b;
    	 this.c = c; 
     }
     public void areaTriangle()
     {
    	 if(a+b >c && b+c >a && c+a >b)
    	 {
    		 double s = (a+b+c)/2;
    		 double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    		 System.out.println("Area of triangle is :" + area);
    	 }
    	 else
    	 {
    		 System.out.println("Invalid Triangle");
    	 }
     }
     public void perimeterTriangle()
     {
    	 if(a+b >c && b+c >a && c+a >b) {
    		 System.out.println("Perimeter of triangle is :" + (a+b+c));
    	 }
    	 else
    	 {
    		 System.out.println("Invalid Triangle");
    	 }
    	 System.out.println("======================================");
     }
     
     public static void main(String[] args)
     {
    	 Triangle t1 = new Triangle();
    	 t1.setValue(12 , 22 ,16);
    	 t1.areaTriangle();
    	 t1.perimeterTriangle();
    	 Triangle t2 = new Triangle();
    	 t2.setValue(14 , 22 ,18);
    	 t2.areaTriangle();
    	 t2.perimeterTriangle();
    	 
     }
     

}

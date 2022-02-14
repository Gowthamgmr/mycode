package week1.day3;

public class Golbalvariable {
	 int a=5,d=6,f;
  public void addition() {
	  int i=9,j=7;
	  int k=i+j;
	  System.out.println("sum of the number:"+"  "+k);
  }
  public void subtraction() {
	  int i=9,j=7;
	  int k=i-j;
	  System.out.println(k);
  }
  public void multiplication() {
      int f=a*d;
  System.out.println(f);
  }
  public static void main(String[] args) {
	  Golbalvariable local=new Golbalvariable();
	  local.addition();
	  local.subtraction();
	  local.multiplication();
	  System.out.println(local.d);
	  System.out.println(local.a);
		}

}

package week5.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Listlearn {
	public void method1() {
	Set<String> company=new LinkedHashSet<String>();
	company.add("tcs");
	company.add("Wipro");
	company.add("CTS");
	company.add("Capgemini");
	company.add("Infosys");
	company.add("tcs");
	System.out.println(company);
	}

	public void method2() {
	Set<String> company1=new HashSet<String>();
	company1.add("tcs");
	company1.add("Wipro");
	company1.add("CTS");
	company1.add("Capgemini");
	company1.add("Infosys");
	company1.add("tcs");
	System.out.println(company1);
	}
	
	public void method3() {
		Set<String> company2=new TreeSet<String>();
		company2.add("tcs");
		company2.add("Wipro");
		company2.add("CTS");
		company2.add("Capgemini");
		company2.add("Infosys");
		company2.add("tcs");
		System.out.println(company2);
		
		
		}
	public static void main(String[] args) {
		 Listlearn obj=new Listlearn();
		 obj.method1();
		 obj.method2();
		 obj.method3();
	   }
}


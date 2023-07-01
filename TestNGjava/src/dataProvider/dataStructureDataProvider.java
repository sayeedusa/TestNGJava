package dataProvider;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;


public class dataStructureDataProvider {
	
	@Test(dataProvider = "dataset")
	public void dataStructureTest(String str) {
		System.out.println(str);
		//assertEquals("Scott", str);
	}
	
	@DataProvider(name="dataset")
	public Iterator<String> dp(){
		List<String> data=new ArrayList<>();
		data.add("Scott");
		data.add("Miller");
		data.add("John");
		return data.iterator();
		
		
	}
	
	
//	@Test(dataProvider = "objStructure")
//	public void dataStructureTest1(String str) {
//		System.out.println(str);
//		//assertEquals("Scott", str);
//	}
	
	
	@DataProvider(name="objStructure")
	public Iterator<Object> dp1(){
		
		Set<Object> data1=new HashSet<>();
		data1.add(new Object[] {"Scott","111"});
		data1.add(new Object[] {"Miller","222"});
		return data1.iterator();
		
		
	}
	

}

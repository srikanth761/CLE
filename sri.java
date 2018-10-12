import java.io.*;
import java.util.*;

class SComparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		String s2=o2.toString();
		return -s1.compareTo(s2);
	}
	
}

public class sri
{
	public static void main(String[] args) throws Exception{

		//look into ground
		FileInputStream fis=new FileInputStream("mad.txt");
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);











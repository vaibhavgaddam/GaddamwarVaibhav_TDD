package Epam.TDD_AND_JUNIT;

public class RemoveAs {

	public Object remA(String string) {
		// TODO Auto-generated method stub
		String result="";
		int len= string.length();
		
		for(int i=0;i<len;i++)
		{
			if(i<2 && (string.charAt(i)=='A'))
				continue;
			result=result+string.charAt(i);
		}
		
		return result;
	}

}

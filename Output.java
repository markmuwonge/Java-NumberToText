
public class Output {
	
	String out = "";
	
	boolean tens2Triggered = false;
	
	public void makeText(String num)
	{
		if (num.length() == 4)
		{		
			thousands(num.substring(0, 1));
			hundreds(num.substring(1, 2));
			if (!("1".equals(num.substring(2, 3))))
			{
				tens(num.substring(2, 3));
			}
			else
			{
				tens2(num.substring(2, 4));
				tens2Triggered = true;
			}
			
			if (tens2Triggered == false)
			{
				units(num.substring(3, 4));
			}
			
		}
		
		if (num.length() == 3)
		{	
			hundreds(num.substring(0, 1));
			if (!("1".equals(num.substring(1, 2))))
			{
				tens(num.substring(1, 2));
			}
			else
			{
				tens2(num.substring(1, 3));
				tens2Triggered = true;
			}
			
			if (tens2Triggered == false)
			{
				units(num.substring(2, 3));
			}
			
		}
		
		if (num.length() == 2)
		{	
			if (!("1".equals(num.substring(0, 1))))
			{
				tens(num.substring(0, 1));
			}
			else
			{
				tens2(num.substring(0, 2));
				tens2Triggered = true;
			}
			
			if (tens2Triggered == false)
			{
				units(num.substring(1, 2));
			}
			
		}
		
		if (num.length() == 1)
		{	
			units(num.substring(0, 1));	
		}
		
		
		
		
		System.out.println(num + " is " + out.trim());
		
	}
	
	public void thousands(String t)
	{
		switch(t) 
		{
			case "1":
				out = out + "one thousand";
				break;
			case "2":
				out = out + "two thousand";
				break;
			case "3":
				out = out + "three thousand";
				break;
			case "4":
				out = out + "four thousand";
				break;
			case "5":
				out = out + "five thousand";
				break;
			case "6":
				out = out + "six thousand";
				break;
			case "7":
				out = out + "seven thousand";
				break;
			case "8":
				out = out + "eight thousand";
				break;
			case "9":
				out = out + "nine thousand";
				break;
		}
			
			
	}
	
	public void hundreds(String h)
	{
		switch(h) 
		{
			case "0":
				
				break;
			case "1":
				out = out + " one hundred";
				break;
			case "2":
				out = out + " two hundred";
				break;
			case "3":
				out = out + " three hundred";
				break;
			case "4":
				out = out + " four hundred";
				break;
			case "5":
				out = out + " five hundred";
				break;
			case "6":
				out = out + " six hundred";
				break;
			case "7":
				out = out + " seven hundred";
				break;
			case "8":
				out = out + " eight hundred";
				break;
			case "9":
				out = out + " nine hundred";
				break;
		}
	}
	
	public void tens(String t)
	{
		switch(t) 
		{
			case "0":
				
				break;
//			case "1":
//				out = out + " one hundred";
//				break;
			case "2":
				out = out + " twenty";
				break;
			case "3":
				out = out + " thirty";
				break;
			case "4":
				out = out + " fourty";
				break;
			case "5":
				out = out + " fifty";
				break;
			case "6":
				out = out + " sixy";
				break;
			case "7":
				out = out + " seventy";
				break;
			case "8":
				out = out + " eighty";
				break;
			case "9":
				out = out + " ninety";
				break;
		}
	}
	
	public void tens2(String t)
	{
		switch(t) 
		{
			case "0":
				
				break;
//			case "1":
//				out = out + " one hundred";
//				break;
			case "10":
				out = out + " ten";
				break;	
			case "11":
				out = out + " eleven";
				break;
			case "12":
				out = out + " twelve";
				break;
			case "13":
				out = out + " thirteen";
				break;
			case "14":
				out = out + " fourteen";
				break;
			case "15":
				out = out + " fifteen";
				break;
			case "16":
				out = out + " sixteen";
				break;
			case "17":
				out = out + " seventeen";
				break;
			case "18":
				out = out + " eighteen";
				break;
			case "19":
				out = out + " nineteen";
				break;
		}
	}
	
	public void units(String u)
	{
		switch(u) 
		{
			case "0":
				
				break;
			case "1":
				out = out + " one";
				break;
			case "2":
				out = out + " two";
				break;
			case "3":
				out = out + " three";
				break;
			case "4":
				out = out + " four";
				break;
			case "5":
				out = out + " five";
				break;
			case "6":
				out = out + " six";
				break;
			case "7":
				out = out + " seven";
				break;
			case "8":
				out = out + " eight";
				break;
			case "9":
				out = out + " nine";
				break;
		}
	}
}



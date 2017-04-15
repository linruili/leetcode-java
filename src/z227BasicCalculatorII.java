import java.util.ArrayDeque;

public class z227BasicCalculatorII
{
	public int calculate(String s)
	{
		int i , num = 0 ,sum=0;
		ArrayDeque<Integer> numStack = new ArrayDeque<>();
		char op = '+';
		for(i=0 ; i<s.length() ; ++i)
		{
			char c = s.charAt(i);
			if(Character.isDigit(c))
				num = num*10 + (c-'0');
			if((!Character.isDigit(c) && c!=' ' )|| i==s.length()-1)
			{
				switch (op)
				{
					case '+':
						break;
					case '-':
						num = -num;
						break;
					case '*':
						num = numStack.pop() * num;
						break;
					case '/':
						num = numStack.pop() / num;
				}
				op = c;
				numStack.push(num);
				num = 0;
			}
		}
		while(!numStack.isEmpty())
			sum += numStack.pop();
		return sum;
	}

	public static void main(String[] args)
	{
		z227BasicCalculatorII t = new z227BasicCalculatorII();
		System.out.println(t.calculate("3+2*2"));

	}

}


public class MyString {
	private char[] contents;

	public MyString(String s) {
		contents = s.toCharArray();
	}

	@Override
	public String toString() {
		return contents.toString();
	}

	public int indexOf(char c) {
		for (int i = 0; i < contents.length; i++)
			if (contents[i] == c)
				return i;
		return -1;
	}

	public int indexOf(String s) {
		char[] c = s.toCharArray();
		for (int j = 0; j < contents.length; j++)
			for (int i = 0; i < c.length; i++)
				if (contents[j] == c[i])
					return j;
		
		return -1;
	}

	public int lastIndexOf(char c) {
		for (int i = contents.length - 1; i >= 0; i--) {
			if (contents[i] == c)
				return i;
		}
		return -1;
	}

	public int lastIndexOf(String s) {
		char[] c = s.toCharArray();
		for (int j = contents.length - 1; j >= 0; j--)
			for (int i = 0; i < c.length; i++) 
				if(contents[j] == c[i])
					return j;
			
		return -1;
	}

	public void replace(String oldString, String newString) {
		char[] oldChar = oldString.toCharArray();
		char[] newChar = newString.toCharArray();
		
		for(int j = 0; j<contents.length;j++)
		for(int i =0; i<newChar.length;i++)
		{
			
		}
			
	}

	
	public static void main(String[] args) {
		String s = "con di rong";
		MyString string1 = new MyString(s);
		
		int index = string1.indexOf("ron");
		System.out.println(index);
	}
}

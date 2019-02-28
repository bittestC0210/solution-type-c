package problem03;

public class MyStack {
	
	private String[] buffer;

	public MyStack( int size ) {
		buffer = new String[size];
	}
	
	public void push(String item) {
		for(int i=0; i<buffer.length; i++)
		{
			buffer[buffer.length - 1] = item; // 2 new
			buffer[buffer.length - 2] = buffer[buffer.length - 1]; // 1 2
			buffer[buffer.length - 3] = buffer[buffer.length - 2]; // 0 1
		}
	}

	public String pop() {
		String pop = "";
		for(int i=0; i<buffer.length; i++)
		{
			pop = buffer[buffer.length - 1];
			
			buffer[buffer.length - 1] = null;
		}
		
		return pop;
	}

	public boolean isEmpty() {
		return !(buffer.length == 0);
	}
	
	public int size() {
		int count = 0;
		
		for(int i=0; i<buffer.length; i++)
		{
			if(!(buffer[i].isEmpty()))
			{
				count++;
			}		
		}
		
		return count;
	}
}
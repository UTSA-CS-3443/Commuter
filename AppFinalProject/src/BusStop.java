
public class BusStop 
{
	private String name;
	private int offset;
	
	public BusStop(String name, int offset)
	{
		this.setName(name);
		this.setOffset(offset);
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

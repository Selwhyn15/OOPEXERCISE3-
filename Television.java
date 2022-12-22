public class Television
{
	private String color;
	private Windows windows;
	private Remote remote;
	private Button button;
	
	public Television(String color){
		this.color = color;
		windows = new Windows();
		remote = new Remote();
		button = new Button();	
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public String open(){
		return windows.openWindows;
	}
}

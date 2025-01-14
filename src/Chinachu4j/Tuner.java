package Chinachu4j;

public class Tuner{

	private String name;
	private boolean isScrambling;
	private String[] types;
	private String command;
	private int n;

	public Tuner(String name, boolean isScrambling, String[] types, String command, int n){
		this.name = name;
		this.isScrambling = isScrambling;
		this.types = types;
		this.command = command;
		this.n = n;
	}

	
	public String getName(){
		return name;
	}
	public boolean getIsScrambling(){
		return isScrambling;
	}
	public String[] getTypes(){
		return types;
	}
	public String getCommand(){
		return command;
	}
	public int getN(){
		return n;
	}
}
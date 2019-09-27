package Task_3;

public class MainTask_3 {

	public static void main(String[] args) {
		UserInput inp = new UserInput();
		
		inp.delTrash(inp.input());
		
		FirstLettToUp up = new FirstLettToUp(inp.list);
		
		PrintInfo.print(up.list);
	}
}

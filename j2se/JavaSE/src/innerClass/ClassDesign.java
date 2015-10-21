package innerClass;
class User{
	
	private String id;
	private String password;
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class verify {
	
	private String[] args;
	
	public verify(String[] args){
		this.args = args;	
	}

	public boolean validate(){
		System.out.println(args[0]);
		System.out.println(args[1]);
		return this.args[0].equals("aaa")&&this.args[1].equals("123")?true:false;
	}
}

public class ClassDesign {
	
	public static void main(String[] args) {
	String aargs[] = {"aaa","123"};
	args = aargs;
		System.out.println(new verify(args).validate()==true?"验证成功！":"验证失败！");
	}

}

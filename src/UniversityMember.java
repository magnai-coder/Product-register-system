
abstract class UniversityMember implements User{
	private String UserName;
	public abstract boolean Login(String User, String Password);
	public abstract void Logout();
	public void showNews() {}
	public void showAdvertising() {}

}

class A
{
	public static voi public static void main(String[] args)throws Exception
	 {
		Class.froName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/geu","root","root");
		Statemnet st=con.createStatemnet();
		int i=st.executeUpdate("insert into emp43 values(4,'rohan')");
		System.out.println(i);
	}
}
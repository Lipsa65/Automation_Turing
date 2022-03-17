public  TuringHomePageTest(){
		super();
	}
		@BeforeMethod
		public void setup() throws Throwable{
			launch();
			turingLoginPage=new TuringLoginPage();
			turingHomePage= new TuringHomePage();
			turingLoginPage.login(prop.getProperty("username"),prop.getProperty("password"));}
		
		//testcases completed
		//test is not completed

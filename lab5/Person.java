package day7.lab5;

public class Person implements AutoCloseable{

	private int age;
	private String name;
	
	public Person(int age, String name)
			throws AgeException,NameException
	{
		if(age<15)
		{
			throw new AgeException(age);
		}
		else this.age = age;
		
		if(name.isEmpty()||name == null||name.length()<1)
		{
			throw new NameException(name);
		}
		else this.name = name;
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		// how to close
	
	}
	
	
	
}//end main

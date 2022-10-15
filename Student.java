package collection;

public class Student {
	
	
	private String name;
	private String rollno;
	private int mark;
	private int age;


	public Student(String name, String rollno, int mark, int age) {
		this.name=name;
		this.rollno=rollno;
		this.mark=mark;
		this.age=age;
	}
	
		public String getname()
		{
			return name;
		}
		public void setname(String name)
		{
			this.name=name;
		}
	    public String getrollno()
	    {
			return rollno;	
	    }
	    public void setrollno(String rollno)
	    {
	    	this.rollno=rollno;
	    }
        public int getmark()
        {
        	return mark;
        }
        public void setmark(int mark)
        {
        	this.mark=mark;
        }
        public int getage()
        {
        	return age;
        }
        public void setage(int age)
        {
        	this.age=age;
        }
	public static void main(String[] args) {

	
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", mark=" + mark + ", age=" + age + "]";
	}

}

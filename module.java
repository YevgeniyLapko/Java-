/**
* Our second pure Object Oriented Programming Java class, in the sense it is used to model a concept (a type of objects) of the problem we want to solve<br>. 
* The module class produces and give functionality to n >= 0 module objects<br>
*/
public class module {

	public String      moduleName;    				     //Module name
	public int         moduleID;;     			         //Module ID
	public student []  students = new student[5];        //Students for this module
	public int 		   capacity = 5;						//Capacity of student for this module
	public int 		   currentEnrollment ;			//Current number of students in a module
	
	public module(String name, int id)
	{
		moduleName = name;
		moduleID = id;
		currentEnrollment = 0;;
	}
	
	public String getName()
	{
		return moduleName;
	}
	
	public int getModuleID()
	{
		return moduleID;
	}
	
	public void setModuleName(String name)
	{
		moduleName = name;
	}
	
	public void setModuleID(int a)
	{
		moduleID = a;
	}
	
	public boolean registerStudent(student s)
	{
	
		if(currentEnrollment < capacity){    
            students[currentEnrollment++] = s;
            return true;
        }
        return false;
	}
	
	public student getStudentInfo(int i)
	{ 
		try {
		return students[i];
		} catch (IndexOutOfBoundsException e)
		{
			return null;
		}
		
	}
	

	
}

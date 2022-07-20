package marksheetmodel1;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		 
		add();
		//update();
	    //delete();
		//get();
		//Search();
		//testGetMeritList();
	}
	private static void get() throws Exception {
		
		
		javabean Bean = new javabean();
		
		 MarksheetModel mm =  new MarksheetModel();
		Bean.setRollno(1011);	
		 List<javabean>List = mm.get(Bean);
		 
		 Iterator<javabean> it = List.iterator();
		 
		 while(it.hasNext()) {
			
			 javabean mb=(javabean) it.next();
			 
			 System.out.println(mb.getRollno());
			 System.out.println(mb.getName());
			 System.out.println(mb.getPhysics());
			 System.out.println(mb.getChemistry());
			 System.out.println(mb.getMaths());
		 }
		
		
	}
	private static void delete() throws Exception {
		javabean c = new javabean();
		 
		 MarksheetModel mm =  new MarksheetModel();
		
		 
		 c.setRollno(1012);
		  
 		
		 mm.Delete(c);
		 
		 System.out.println("Work is Done");
		
	}
	private static void update() throws Exception {
		 javabean b = new javabean();
		 
		 MarksheetModel mm =  new MarksheetModel();
		
		 
		 b.setRollno(1016);
		 b.setName( "ram");
		 b.setPhysics(85);
		 b.setChemistry(95);
		 b.setMaths(88);
  		
		 mm.Update(b);
		 
		 System.out.println("Work is Done");
		
	}

	private static void add() throws Exception {
		 javabean bean =  new javabean();
		
		 MarksheetModel mm= new MarksheetModel();
		 
		  
		 bean.setRollno(1017);
		 bean.setName("shayam");
		 bean.setPhysics(66);
		 bean.setChemistry(85);
		 bean.setMaths(75);
		 
         mm.Add(bean);
         
		System.out.println("insert");
	}
	

	
	private static void Search() throws Exception {
		
		MarksheetModel model = new MarksheetModel();
		
		List<javabean> list = model.search();
		
		Iterator<javabean> it = list.iterator();
		
		while (it.hasNext()) {
			javabean mb = (javabean) it.next();
			
			System.out.print("\t" + mb.getRollno());
			System.out.print("\t" + mb.getName());
			System.out.print("\t" + mb.getPhysics());
			System.out.print("\t" + mb.getChemistry());
			System.out.println("\t" + mb.getMaths());
		}
	}
	private static void testGetMeritList() throws Exception {
		
		MarksheetModel model = new MarksheetModel();
		
		List<javabean> list = model.getMeritList();
		
		Iterator<javabean> it = list.iterator();
		
		while (it.hasNext()) {
			javabean mb = (javabean) it.next();
			
			System.out.print("\t" + mb.getRollno());
			System.out.print("\t" + mb.getName());
			System.out.print("\t" + mb.getPhysics());
			System.out.print("\t" + mb.getChemistry());
			System.out.println("\t" + mb.getMaths());
		}
	}



		
	}



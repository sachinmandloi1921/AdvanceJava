import in.co.sachin.RegModel;
import in.co.sachin.Regbean;

public class hhhh {
	public static void main(String[] args) throws Exception {
		RegModel r=new RegModel();
		Regbean b=new Regbean();
		b=r.Authenticate("23", "Vaibhav@123");
		System.out.println(b.getFirstName());
	}

}

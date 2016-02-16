import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestion.banque.entities.Client;
import com.gestion.banque.metier.ICompteMetier;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml"});
		ICompteMetier metier = (ICompteMetier) context.getBean("metier");
		
		metier.ajouterClient(new Client("Yahya"));
		metier.ajouterClient(new Client("Ali"));
		

	}

}

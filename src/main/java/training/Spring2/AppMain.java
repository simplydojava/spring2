package training.Spring2;


import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		Logger LOG=Logger.getLogger(AppMain.class);
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");

		PartyService obj = (PartyService) context.getBean("partyService");
		try {
			boolean flag1=obj.registerParty(1, "Ishaani");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOG.error("Error in AppMain",e);
		}finally{
			context.close();
		}
	}

}

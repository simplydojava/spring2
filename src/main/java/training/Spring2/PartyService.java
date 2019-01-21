package training.Spring2;

/**
 * Hello world!
 *
 */
public class PartyService 
{
	PartyDao partyDao1;
  


   
   public void setPartyDao1(PartyDao partyDao1) {
		this.partyDao1 = partyDao1;
	}




public boolean registerParty(int partyId,String partyName) throws Exception{
	   
	 boolean flag=  partyDao1.registerParty(partyId, partyName);
	 
	 return flag;
   }
   
}

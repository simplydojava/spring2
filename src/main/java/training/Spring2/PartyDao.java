package training.Spring2;

import java.sql.Connection;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;

public class PartyDao {
	
	final static Logger LOG=Logger.getLogger(PartyDao.class);
	String Addrress;
	BasicDataSource dataSource;
	
	PartyDao(BasicDataSource dataSource){
		
		this.dataSource=dataSource;
	}
	public void setAddrress(String addrress) {
		Addrress = addrress;
	}
	public boolean registerParty(int partyId,String partyName) throws Exception{
		
		try{
			Connection con=dataSource.getConnection();
			LOG.info("Connection created:"+con.toString());
			LOG.info("Registered PartyId:"+partyId+",Party Name:"+partyName+",address:"+Addrress);
			
		}catch(Exception e1){
			LOG.error("Exception in registerParty",e1);
			throw e1;
		}
		
		return true;
	}

}

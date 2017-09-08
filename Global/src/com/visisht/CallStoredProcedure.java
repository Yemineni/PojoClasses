package com.visisht;

import java.sql.Connection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


public class CallStoredProcedure {

	public CallStoredProcedure() {
		
	}
	
	public static void main(String []args){
		
		
		Session session=HibernateUtil.openSession();
		
	
		session.beginTransaction(); 
		Connection con=session.connection();
		
		
		Query query = session.createSQLQuery("MASTERS.REP_PAYROLL_COMPARISION(:c,:d,:s,:sup,:sal,:comp,:user,:mac,:out)");
				
		query.setParameter("c","EMRI");
		query.setParameter("d","AP");
		query.setParameter("s","AP-108");
		query.setParameter("sup","CONRL");
		query.setParameter("sal","03/2013");
		query.setParameter("comp","04/2013");
		query.setParameter("user","99992");
		query.setParameter("mac","JEFFA");
		
		
		
		
		
	/*	Query query = session.createSQLQuery(
				"CALL GetStocks(:stockCode)")
				.setParameter("stockCode", "7277");
		*/
		
		

			List result = query.list();
			for(int i=0; i<result.size(); i++){
				String  stock = (String )result.get(i);
				System.out.println(stock);
			}
		   
		
		
	}
	
	

}

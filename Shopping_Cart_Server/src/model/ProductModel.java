package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;

import entities.Product;
import entities.ProductWS;

public class ProductModel extends AbstractModel<Product>{

	public ProductModel() {
		super(Product.class);
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<ProductWS> findALLWS(){
		List<ProductWS> result = new ArrayList<ProductWS>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			result = session.createQuery("select p.id as id, "
					+ "p.name as name, "
					+ "p.price as price, "
					+ "p.quantity as quantity, "
					+ "p.photo as photo "
					+ "from Product p")
					.setResultTransformer(Transformers.aliasToBean(ProductWS.class)).list();
			transaction.commit();
		} catch (Exception e) {
			result = null;
			if(transaction !=null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}
	
	@SuppressWarnings("deprecation")
	public ProductWS findWS(Integer id){
		ProductWS result = new ProductWS();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			result = (ProductWS) session.createQuery("select p.id as id, "
					+ "p.name as name, "
					+ "p.price as price, "
					+ "p.quantity as quantity, "
					+ "p.photo as photo "
					+ "from Product p "
					+ "where p.id = :id")
					.setInteger("id", id)
					.setResultTransformer(Transformers.aliasToBean(ProductWS.class)).uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			result = null;
			if(transaction !=null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}
}

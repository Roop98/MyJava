package dbo;

import entities.Tables;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TablesDbo {

    public void create(){
            try {

                SessionFactory sessionFactory = Hibernateutil.getSessionFactory();
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                Tables tables = new Tables(4,4);
                session.save(tables);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    public void update(){
        try {
            SessionFactory sessionFactory = Hibernateutil.getSessionFactory();
            Sess
        }
    }
}

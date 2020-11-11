package domain;

import logic.HibernateUtil;
import org.hibernate.SessionFactory;

public class Domain {
    public static void main(String[] args) {
        System.out.println("12323");
        HibernateUtil hibernateUtil = new HibernateUtil();
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
    }
}

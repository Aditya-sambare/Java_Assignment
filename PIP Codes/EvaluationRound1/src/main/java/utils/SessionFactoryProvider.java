package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
    static SessionFactory sessionFactory;
    private SessionFactoryProvider(){
    }
    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null){
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();
            return sessionFactory;
        }else{
            return sessionFactory;
        }
    }
}

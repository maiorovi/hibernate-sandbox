package core.fst;

import core.utils.SessionFactoryUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo {

    public static void main(String[] args) {
        final SessionFactory sessionFactory = SessionFactoryUtils.getSessionFactory();
        final Session session = sessionFactory.openSession();

        final Transaction transaction = session.beginTransaction();

        Message m = new Message();
        m.setMessage("msg");
        m.setDateExperiment(LocalDate.of(2018, 2, 20));
        m.setLocalDateTime(LocalDateTime.now());

//        session.save(m);

        final Message load = session.load(Message.class, 1L);
        System.out.println(load);

        transaction.commit();
    }
}

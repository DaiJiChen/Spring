import collection.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testCollection {

    @Test
    public void testCollection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Student student = context.getBean("student", Student.class);

        System.out.println(student.toString());
    }

    @Test
    public void testCollection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Student student = context.getBean("student", Student.class);

        System.out.println(student.toString());
    }
}

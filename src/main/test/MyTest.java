import com.lry.dao.BookMapper;
import com.lry.pojo.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookMapper bookMapper = context.getBean("bookMapper", BookMapper.class);
        System.out.println(bookMapper);
//        bookMapper.queryAllBook();
        for (Book book : bookMapper.queryAllBook()) {
            System.out.println(book);
        }
    }
}

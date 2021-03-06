package Spring.com.springinaction.springidol.test;

import Spring.com.springinaction.springidol.Instrumentalist;
import Spring.com.springinaction.springidol.Interface.Performer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( { "classpath:spring-idol-useAutowiring.xml" })
public class IdolTest {

  @Autowired
  ApplicationContext context;

  @Test
  public void carlShouldBeWiredWithKennysSong() {
     Performer performer = (Performer)context.getBean("kenny");
     performer.perform();
  }

}

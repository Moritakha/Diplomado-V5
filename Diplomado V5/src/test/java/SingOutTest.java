import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.SingIngElements;
import task.tasking.SingOutElements;

public class SingOutTest extends BaseTest {
    @Test
    public void SingOutTest(){
        SingOutElements.as(webDriver, "oswaldomora4444@gmail.com", "password");
    }
}

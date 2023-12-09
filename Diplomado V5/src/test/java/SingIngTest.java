import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.SingIngElements;
import task.tasking.Todolyelements;

public class SingIngTest extends BaseTest {

    @Test
    public void singIngTest(){
        SingIngElements.as(webDriver, "oswaldomora4444@gmail.com", "password");
    }
}

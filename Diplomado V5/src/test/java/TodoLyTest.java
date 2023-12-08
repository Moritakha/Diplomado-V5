import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.Todolyelements;

public class TodoLyTest extends BaseTest {
    @Test
    public void todoLytest(){
        Todolyelements.as(webDriver, "Oswaldo", "oswaldomora4444@gmail.com", "password");
    }
}

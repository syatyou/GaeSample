package jp.itacademy.gae_sample.controller.taskqueue.item;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class EditControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/taskqueue/item/edit");
        EditController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/taskqueue/item/edit.jsp"));
    }
}

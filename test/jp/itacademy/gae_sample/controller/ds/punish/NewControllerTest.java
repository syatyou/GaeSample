package jp.itacademy.gae_sample.controller.ds.punish;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class NewControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/ds/punish/new");
        NewController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/ds/punish/new.jsp"));
    }
}

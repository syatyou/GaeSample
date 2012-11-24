package jp.itacademy.gae_sample.controller.book;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class ListController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("list.jsp");
    }
}

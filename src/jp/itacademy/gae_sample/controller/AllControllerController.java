package jp.itacademy.gae_sample.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class AllControllerController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("AllController.jsp");
    }
}

package jp.itacademy.gae_sample.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class PunishmentController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("Punishment.jsp");
    }
}

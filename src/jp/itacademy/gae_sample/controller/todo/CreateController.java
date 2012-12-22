package jp.itacademy.gae_sample.controller.todo;

import java.util.Date;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.controller.validator.Validators;

public class CreateController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        Validators v = new Validators(request);
        v.add("description", v.required());
        v.add("createDate", v.required());
        
        if (!v.validate()) {
            return forward("index");
        }
        
        String description = asString("description");
        String createDate = asString("createDate");
        return forward("create.jsp");
    }
}

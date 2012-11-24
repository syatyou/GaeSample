package jp.itacademy.gae_sample.controller.book;

import jp.itacademy.gae_sample.model.User;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.controller.validator.Validators;

public class CreateController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        Validators v = new Validators(request);
        v.add("title", v.required());
        v.add("author", v.required());
        v.add("price", v.required());
        
        if (!v.validate()) {
            return forward("index");
        }
        String title = asString("title");
        String author = asString("author");
        String price = asString("price");
        
        User user = new User();
        
        return forward("create.jsp");
    }
}

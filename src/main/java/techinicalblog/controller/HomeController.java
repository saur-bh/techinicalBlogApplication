package techinicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import techinicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")  // This to map the request Model is passed
    public String getAllPost(Model model){

        // Create ArrayList to collect all Post

        ArrayList<Post> posts = new ArrayList<Post>();

        Post post1 = new Post();
        post1.setTitle(" This is title 1 :");
        post1.setBody(" Body of the title 1");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("Post Body 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("Post Body 3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("post",posts);

        return "index";


    }
}

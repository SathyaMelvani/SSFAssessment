import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @GetMapping("/articleslist")


    @RequestMapping("/GetArticles")

    @PostMapping(value = "/articleslist", consumes ="application/json", produces = "application/json")
    public GetArticles createGetArticles(@RequestBody GetArticles getarticles) {

        return getarticles;
    }
}


    



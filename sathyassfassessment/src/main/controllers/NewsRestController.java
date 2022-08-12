import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsRestController {

    @GetMapping(value = "/articleslist", consumes ="application/json", produces = "application/json")
    public GetArticles createGetArticles(@RequestBody GetArticles getarticles) {


        return getarticles;


}
}

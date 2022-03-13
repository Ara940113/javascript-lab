package site.metacoding.test5;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {
     
    @GetMapping("/number")
    public List<Integer> number(){
        List<Integer> list = Arrays.asList(1,2,3,4);
        return list;
    }
}

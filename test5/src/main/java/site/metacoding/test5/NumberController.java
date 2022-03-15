package site.metacoding.test5;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // data를 리턴
public class NumberController {

    @CrossOrigin(methods = { RequestMethod.POST, RequestMethod.GET }, originPatterns = "http://127.0.0.1:5500") // 자바스크립트
                                                                                                                // 요청 허용
    // 다른 도메인의 자바스크립트 요청만 금지
    @GetMapping("/number")
    public List<Integer> number() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // view Resolver작동 (@Controller) = 파일을 찾아주는 친구
        // MessageConverter작동 (@RestController) = JSON으로 변환해서 응답{"data" : [1,2,3,4]}

        return list;
    }
}

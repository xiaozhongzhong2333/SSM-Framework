package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * *测试git
 * @author renzhong
 *
 */
@Controller
public class FooController {
  @GetMapping("/haha")
  @ResponseBody
  public String haha() {
	  return "test git";
  }
}

package sherlock.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sherlock.service.StudentService;
import sherlock.vo.R;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/5/21 7:01
 */
@RestController
public class StudentController {
//    retries：重试次数。默认为2
    @Reference(version = "1.0.0",retries = 0)
    private StudentService studentService;

    @GetMapping("/api/student/all.do")
    public R all(int count) {
        System.out.println("success!");
        return studentService.queryAll(count);
    }
}

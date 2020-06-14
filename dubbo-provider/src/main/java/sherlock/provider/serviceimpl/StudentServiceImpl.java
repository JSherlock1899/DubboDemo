package sherlock.provider.serviceimpl;

import org.apache.dubbo.config.annotation.Service;
import sherlock.entity.Student;
import sherlock.service.StudentService;
import sherlock.vo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/5/21 6:35
 */
@Service(version = "1.0.0")
public class StudentServiceImpl implements StudentService {

    @Override
    public R queryAll(int count) {
        //模拟数据操作
        //查询指定数量的学生信息
        List<Student> list = new ArrayList<>();
        for (int i = 1; i < count; i++) {
            Student student = new Student();
            student.setAddress("杭州");
            student.setName("sherlock" + i);
            student.setNo("1899_" + i);
            list.add(student);
        }

        return R.ok(list);
    }
}

package org.abc.batch.batch;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.abc.batch.entity.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<User, User> {

    private static final Map<String, String> DEPT_NAMES =
            new HashMap<>();

    public Processor() {
        DEPT_NAMES.put("001", "IT");
        DEPT_NAMES.put("002", "HR");
        DEPT_NAMES.put("003", "Marketing");
        DEPT_NAMES.put("004", "Branding");
    }

    @Override
    public User process(User user) throws Exception {
        String deptCode = user.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        user.setDept(dept);
        user.setTime(new Date());
        System.out.println(String.format("Convertion from [%s] to [%s]", deptCode, dept));
        return user;
    }
}
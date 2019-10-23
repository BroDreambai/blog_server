package com.dreambai.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import com.dreambai.admin.bean.User;

/**
 * Created by dreambai on 2017/12/20.
 */
public class Util {
    public static User getCurrentUser() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return user;
    }
}

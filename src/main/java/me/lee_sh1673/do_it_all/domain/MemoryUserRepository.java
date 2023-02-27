package me.lee_sh1673.do_it_all.domain;

import java.util.HashMap;
import java.util.Map;

public class MemoryUserRepository implements UserRepository {

    private final Map<Long, User> map = new HashMap<>();


    @Override
    public Long save(final User user) {
        Long id = user.getId();
        map.put(id, user);
        return id;
    }

    @Override
    public User findById(final Long id) {
        return map.get(id);
    }
}

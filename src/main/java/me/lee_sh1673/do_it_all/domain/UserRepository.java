package me.lee_sh1673.do_it_all.domain;

public interface UserRepository {

    Long save(final User user);

    User findById(final Long id);
}

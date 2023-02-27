package me.lee_sh1673.do_it_all.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class User {

    private final Long id;

    private final String name;

    private final int age;

}
